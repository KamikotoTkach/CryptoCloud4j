package ru.cwcode.tkach.cryptocloud4j.model.request;

import lombok.Getter;
import ru.cwcode.tkach.cryptocloud4j.model.CryptoCloudRequest;
import ru.cwcode.tkach.cryptocloud4j.model.Time;
import ru.cwcode.tkach.cryptocloud4j.model.response.BillCreatedResponse;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

public class CreateBillRequest extends CryptoCloudRequest<CreateBillRequest> {
  public CreateBillRequest() {
    super("POST", "v2/invoice/create");
    addResponseModel(200, BillCreatedResponse.class);
  }
  
  /**
   * @param locale currently `en` or `ru`
   */
  public CreateBillRequest locale(String locale) {
    addParameter("locale", locale);
    return this;
  }
  
  /**
   * @param shopId Unique identifier of the store from personal account. Required.
   */
  public CreateBillRequest shopId(String shopId) {
    addBody("shop_id", shopId);
    return this;
  }
  
  /**
   * @param amount Payment amount in USD. Required.
   */
  public CreateBillRequest amount(Double amount) {
    addBody("amount", amount);
    return this;
  }
  
  /**
   * @param currency Available currencies for conversion: USD, UZS, KGS, KZT, AMD, AZN, BYN, AUD, 'TRY', AED, CAD, CNY, HKD, IDR, INR, INR, JPY, PHP, SGD, THB, VND, MYR, RUB, UAH, EUR, GBP. The default currency is USD
   */
  public CreateBillRequest currency(String currency) {
    addBody("currency", currency);
    return this;
  }
  
  /**
   * @param orderId Arbitrary invoice number in the external system.
   */
  public CreateBillRequest orderId(String orderId) {
    addBody("order_id", orderId);
    return this;
  }
  
  /**
   * @param email Email address of the customer
   */
  public CreateBillRequest email(String email) {
    addBody("email", email);
    return this;
  }
  
  /**
   * @param fields Additional parameters
   */
  public CreateBillRequest addFields(Fields fields) {
    addBody("add_fields", fields);
    return this;
  }
  
  @Getter
  public static class Fields extends ModelObject {
    /**
     * Invoice due time
     */
    ModelField<Time> timeToPay = new ModelField<>("time_to_pay", Time.class, this);
    /**
     * If you specify an email in the parameter, the invoice will be automatically sent to this email.
     */
    ModelField<String> emailToSend = new ModelField<>("email_to_send", String.class, this);
    /**
     * Payment currencies
     */
    ModelField<String[]> availableCurrencies = new ModelField<>("available_currencies", String[].class, this);
    /**
     * Select the payment currency for the user. The details will be displayed on the payment page when specifying the currency. The address will be given in response to the request.
     */
    ModelField<String> cryptocurrency = new ModelField<>("cryptocurrency", String.class, this);
    /**
     * Period for invoice resubmission (only if email for automatic invoice sending is filled in).
     */
    ModelField<String> period = new ModelField<>("period", String.class, this);
    
    public Fields() {
    }
    
    public Fields(Map<String, Object> data) {
      super(data);
    }
  }
}
