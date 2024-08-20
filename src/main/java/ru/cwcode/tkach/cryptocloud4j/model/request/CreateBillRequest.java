package ru.cwcode.tkach.cryptocloud4j.model.request;

import lombok.Getter;
import ru.cwcode.tkach.cryptocloud4j.model.CryptoCloudRequest;
import ru.cwcode.tkach.cryptocloud4j.model.Time;
import ru.cwcode.tkach.cryptocloud4j.model.response.BillCreated;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

public class CreateBillRequest extends CryptoCloudRequest<CreateBillRequest> {
  public CreateBillRequest() {
    super("POST", "v2/invoice/create");
    addResponseModel(200, BillCreated.class);
  }
  
  public CreateBillRequest locale(String locale) {
    addParameter("locale", locale);
    return this;
  }
  
  public CreateBillRequest shopId(String shopId) {
    addBody("shop_id", shopId);
    return this;
  }
  
  public CreateBillRequest amount(Double amount) {
    addBody("amount", amount);
    return this;
  }
  
  public CreateBillRequest currency(String currency) {
    addBody("currency", currency);
    return this;
  }
  
  public CreateBillRequest orderId(String orderId) {
    addBody("order_id", orderId);
    return this;
  }
  
  public CreateBillRequest email(String email) {
    addBody("email", email);
    return this;
  }
  
  public CreateBillRequest email(Fields fields) {
    addBody("add_fields", fields);
    return this;
  }
  
  @Getter
  public static class Fields extends ModelObject {
    ModelField<Time> timeToPay = new ModelField<>("time_to_pay", Time.class, this);
    ModelField<String> emailToSend = new ModelField<>("email_to_send", String.class, this);
    ModelField<String[]> availableCurrencies = new ModelField<>("available_currencies", String[].class, this);
    ModelField<String> cryptocurrency = new ModelField<>("cryptocurrency", String.class, this);
    ModelField<String> period = new ModelField<>("period", String.class, this);
    
    public Fields() {
    }
    
    public Fields(Map<String, Object> data) {
      super(data);
    }
  }
}
