package ru.cwcode.tkach.cryptocloud4j.model.response;

import lombok.Getter;
import ru.cwcode.tkach.cryptocloud4j.model.InvoiceInfo;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class InvoicesInfo extends ModelObject {
  ModelField<InvoiceInfo[]> invoices = new ModelField<>("result", InvoiceInfo[].class, this);
  
  public InvoicesInfo() {
  }
  
  public InvoicesInfo(Map<String, Object> data) {
    super(data);
  }
}
