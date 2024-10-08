package ru.cwcode.tkach.cryptocloud4j.model;

import lombok.Getter;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class InvoiceInfo extends ModelObject {
  /**
   * unique identifier of the invoice with the INV prefix.
   */
  ModelField<String> uuid = new ModelField<>("uuid", String.class, this);
  
  /**
   * payment address. It will be pre-filled only in case of selecting cryptocurrency for payment.
   * To select the currency for the client, it is necessary to specify the currency
   * available in the project in add_fields.cryptocurrency.
   */
  ModelField<String> address = new ModelField<>("address", String.class, this);
  /**
   * expiration date of the invoice in UTC +0 in the format YYYY-MM-DD HH:MI:SS.FFFFFFFF.
   * After the expiry date invoice will be transferred to the status canceled, if no payment has been received.
   */
  ModelField<String> expiryDate = new ModelField<>("expiry_date", String.class, this);
  /**
   * transfer fee payment side
   */
  ModelField<String> sideCommission = new ModelField<>("side_commission", String.class, this);
  /**
   * service fee payment side.
   */
  ModelField<String> sideCommission_cc = new ModelField<>("side_commission_cc", String.class, this);
  /**
   * invoice amount.
   */
  ModelField<Double> amount = new ModelField<>("amount", Double.class, this);
  /**
   * invoice amount in USD.
   */
  ModelField<Double> amountUsd = new ModelField<>("amount_usd", Double.class, this);
  /**
   * received amount.
   */
  ModelField<Double> received = new ModelField<>("received", Double.class, this);
  /**
   * received amount in USD.
   */
  ModelField<Double> receivedUsd = new ModelField<>("received_usd", Double.class, this);
  /**
   * invoice transfer commission.
   */
  ModelField<Double> fee = new ModelField<>("fee", Double.class, this);
  /**
   * invoice transfer commission in USD.
   */
  ModelField<Double> feeUsd = new ModelField<>("fee_usd", Double.class, this);
  /**
   * service commission.
   */
  ModelField<Double> serviceFee = new ModelField<>("service_fee", Double.class, this);
  /**
   * service commission in USD.
   */
  ModelField<Double> serviceFeeUsd = new ModelField<>("service_fee_usd", Double.class, this);
  
  /**
   * invoice status. When sending a request for invoice creation, it is always created.
   * There are also paid, partial, overpaid and canceled statuses.
   */
  ModelField<String> status = new ModelField<>("status", String.class, this);
  
  ModelField<String> orderId = new ModelField<>("order_id", String.class, this);
  /**
   * object of the selected cryptocurrency in the invoice.
   * It also contains the object network — information about the selected currency network.
   */
  ModelField<Currency> currency = new ModelField<>("currency", Currency.class, this);
  /**
   * information about the project.
   */
  ModelField<Project> project = new ModelField<>("project", Project.class, this);
  /**
   * test invoice sign.
   */
  ModelField<Boolean> testMode = new ModelField<>("test_mode", Boolean.class, this);
  
  public InvoiceInfo() {
  }
  
  public InvoiceInfo(Map<String, Object> data) {
    super(data);
  }
}
