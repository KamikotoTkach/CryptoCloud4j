package ru.cwcode.tkach.cryptocloud4j.model;

import lombok.Getter;
import ru.cwcode.tkach.httpWrapper.BaseRequest;
import ru.cwcode.tkach.httpWrapper.SimpleResponse;

import java.util.Map;

@Getter
public class CryptoCloudResponse extends SimpleResponse<CryptoCloudResponse> {
  String status;
  
  public CryptoCloudResponse(boolean success, int code, BaseRequest<?, ?> request, Map<String, Object> response) {
    super(success, code, request, response);
    this.status = response.get("status") + "";
  }
  
  @Override
  public Map<String, Object> getResponse() {
    Object result = super.getResponse().get("result");
    
    if (result instanceof Map) {
      return (Map<String, Object>) result;
    } else if (result == null) {
      return getResponse();
    } else {
      return Map.of("result", result);
    }
  }
}
