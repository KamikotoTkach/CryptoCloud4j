package ru.cwcode.tkach.cryptocloud4j.model.response;

import lombok.Getter;
import ru.cwcode.tkach.cryptocloud4j.model.InvoiceListEntry;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class InvoicesList extends ModelObject {
  ModelField<InvoiceListEntry[]> invoices = new ModelField<>("result", InvoiceListEntry[].class, this);
  
  public InvoicesList() {
  }
  
  public InvoicesList(Map<String, Object> data) {
    super(data);
  }
}
