package ru.cwcode.tkach.cryptocloud4j;

import com.google.gson.Gson;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import ru.cwcode.tkach.cryptocloud4j.spark.model.PostbackRequest;
import spark.Spark;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;

public class PostbackListener {
  private static boolean isInitialized = false;
  Gson gson = new Gson();
  
  public PostbackListener(String url, String secret, int port, Handler handler) {
    if (isInitialized) throw new IllegalStateException("PostbackListener is already initialized");
    
    Key hmacKey = new SecretKeySpec(Base64.getDecoder().decode(secret),
                                    SignatureAlgorithm.HS256.getJcaName());
    
    Spark.port(port);
    Spark.post(url, (req, resp) -> {
      PostbackRequest parsedRequest = gson.fromJson(req.body(), PostbackRequest.class);
      
      Jws<Claims> jwt = Jwts.parserBuilder()
                            .setSigningKey(hmacKey)
                            .build()
                            .parseClaimsJws(parsedRequest.token());
      
      try {
        Status status = handler.handle(parsedRequest, jwt);
        
        if (status != Status.HANDLED) {
          Spark.halt(500, "Failed to handle postback request");
        }
      } catch (Exception e) {
        Spark.halt(500, e.getLocalizedMessage());
      }
      
      return """
        {"message":"Postback received"}
        """;
    });
    
    isInitialized = true;
  }
  
  public enum Status {
    HANDLED, UNHANDLED;
  }
  
  public interface Handler {
    Status handle(PostbackRequest postbackRequest, Jws<Claims> token);
  }
}
