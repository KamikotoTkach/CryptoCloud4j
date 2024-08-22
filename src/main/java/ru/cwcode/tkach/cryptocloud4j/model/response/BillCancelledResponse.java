package ru.cwcode.tkach.cryptocloud4j.model.response;

import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

public class BillCancelledResponse extends ModelObject {
  ModelField<String[]> status = new ModelField<>("result", String[].class, this);
  
  public BillCancelledResponse() {
  }
  
  public BillCancelledResponse(Map<String, Object> data) {
    super(data);
  }
  
  /**
   * @return "ok" if cancelled
   */
  public String getStatus() {
    return status.get()[0];
  }
}
