package ru.cwcode.tkach.cryptocloud4j.model.response;

import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.LinkedHashMap;
import java.util.Map;

public class BadRequestResponse extends ModelObject {
  public BadRequestResponse(Map<String, Object> data) {
    super(data);
  }
  
  public BadRequestResponse() {
  }
  
  public Map<String, String> getErrors() {
    LinkedHashMap<String, String> errors = new LinkedHashMap<>();
    
    data.forEach((key, value) -> errors.put(key, value.toString()));
    
    return errors;
  }
}
