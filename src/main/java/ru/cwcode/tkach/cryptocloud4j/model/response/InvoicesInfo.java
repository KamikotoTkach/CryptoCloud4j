package ru.cwcode.tkach.cryptocloud4j.model.response;

import lombok.Getter;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

@Getter
public class InvoicesInfo extends ModelObject {
  ModelField<InvoiceInfo[]> invoices = new ModelField<>("result", InvoiceInfo[].class, this);
}
