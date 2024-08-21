package ru.cwcode.tkach.cryptocloud4j.listener;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import ru.cwcode.tkach.cryptocloud4j.listener.model.PostbackRequest;
import spark.Spark;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;

public class PostbackListener {
  private static boolean isInitialized = false;
  
  public PostbackListener(String url, String secret, int port, Handler handler) {
    if (isInitialized) throw new IllegalStateException("PostbackListener is already initialized");
    
    SecretKey secretKey = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
    
    Spark.port(port);
    Spark.post(url, (req, resp) -> {
      
      PostbackRequest parsedRequest = new PostbackRequest(req.queryMap("status").value(),
                                                          req.queryMap("invoice_id").value(),
                                                          Double.parseDouble(req.queryMap("amount_crypto").value()),
                                                          req.queryMap("currency").value(),
                                                          req.queryMap("order_id").value(),
                                                          req.queryMap("token").value());
      
      
      try {
        Jws<Claims> jws = Jwts.parser()
                             .verifyWith(secretKey)
                             .require("id", parsedRequest.invoiceId())
                             .build()
                             .parseSignedClaims(parsedRequest.token());
        
        Status status = handler.handle(parsedRequest, jws);
        
        if (status != Status.HANDLED) {
          Spark.halt(500, "Failed to handle postback request");
        }
      } catch (Exception e) {
        e.printStackTrace();
        Spark.halt(500, e.getLocalizedMessage());
      }
      
      return """
        {"message":"Postback received"}
        """;
    });
    
    isInitialized = true;
  }
  
  public interface Handler {
    Status handle(PostbackRequest postbackRequest, Jws<Claims> token);
  }
  
  public enum Status {
    HANDLED, UNHANDLED;
  }
}
