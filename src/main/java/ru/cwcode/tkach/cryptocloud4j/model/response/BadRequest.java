package ru.cwcode.tkach.cryptocloud4j.model.response;


import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

public class BadRequest extends ModelObject {
  public BadRequest(Map<String, Object> data) {
    super(data);
  }
  
  public BadRequest() {
  }
}
