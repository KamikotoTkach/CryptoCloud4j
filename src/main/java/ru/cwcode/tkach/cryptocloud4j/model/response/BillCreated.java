package ru.cwcode.tkach.cryptocloud4j.model.response;

import lombok.Getter;
import ru.cwcode.tkach.cryptocloud4j.model.Currency;
import ru.cwcode.tkach.cryptocloud4j.model.Project;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class BillCreated extends ModelObject {
  ModelField<String> uuid = new ModelField<>("uuid", String.class, this);
  ModelField<String> created = new ModelField<>("created", String.class, this);
  ModelField<String> address = new ModelField<>("address", String.class, this);
  ModelField<String> expiryDate = new ModelField<>("expiry_date", String.class, this);
  ModelField<String> sideCommission = new ModelField<>("side_commission", String.class, this);
  ModelField<String> sideCommission_cc = new ModelField<>("side_commission_cc", String.class, this);
  ModelField<Double> amount = new ModelField<>("amount", Double.class, this);
  ModelField<Double> amountUsd = new ModelField<>("amount_usd", Double.class, this);
  ModelField<Double> amountFiat = new ModelField<>("amount_in_fiat", Double.class, this);
  ModelField<Double> fee = new ModelField<>("fee", Double.class, this);
  ModelField<Double> feeUsd = new ModelField<>("fee_usd", Double.class, this);
  ModelField<Double> serviceFee = new ModelField<>("service_fee", Double.class, this);
  ModelField<Double> serviceFeeUsd = new ModelField<>("service_fee_usd", Double.class, this);
  ModelField<String> typePayments = new ModelField<>("type_payments", String.class, this);
  ModelField<String> fiatCurrency = new ModelField<>("fiat_currency", String.class, this);
  ModelField<String> status = new ModelField<>("status", String.class, this);
  ModelField<Boolean> isEmailRequired = new ModelField<>("is_email_required", Boolean.class, this);
  ModelField<String> link = new ModelField<>("link", String.class, this);
  ModelField<String> invoiceId = new ModelField<>("invoice_id", String.class, this);
  ModelField<Currency> currency = new ModelField<>("currency", Currency.class, this);
  ModelField<Project> project = new ModelField<>("project", Project.class, this);
  ModelField<Boolean> testMode = new ModelField<>("test_mode", Boolean.class, this);
  
  public BillCreated(Map<String, Object> data) {
    super(data);
  }
  
  public BillCreated() {
  }
}
