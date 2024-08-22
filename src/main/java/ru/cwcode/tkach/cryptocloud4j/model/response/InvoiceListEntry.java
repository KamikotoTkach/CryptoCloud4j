package ru.cwcode.tkach.cryptocloud4j.model.response;

import lombok.Getter;
import ru.cwcode.tkach.cryptocloud4j.model.Currency;
import ru.cwcode.tkach.cryptocloud4j.model.Project;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class InvoiceListEntry extends ModelObject {
  /**
   * unique identifier of the invoice with the INV prefix.
   */
  ModelField<String> uuid = new ModelField<>("uuid", String.class, this);
  /**
   * time of invoice creation in UTC +0 in the format YYYYY-MM-DD HH:MI:SS.FFFFFF.
   */
  ModelField<String> created = new ModelField<>("created", String.class, this);
  /**
   * payment address. It will be pre-filled only in case of selecting cryptocurrency for payment.
   * To select the currency for the client, it is necessary to specify the currency
   * available in the project in add_fields.cryptocurrency.
   */
  ModelField<String> address = new ModelField<>("address", String.class, this);
  ModelField<String> dateFinished = new ModelField<>("date_finished", String.class, this);
  /**
   *  expiration date of the invoice in UTC +0 in the format YYYY-MM-DD HH:MI:SS.FFFFFFFF.
   *  After the expiry date invoice will be transferred to the status canceled, if no payment has been received.
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
   *  invoice amount in crypto.
   */
  ModelField<Double> amountCrypto = new ModelField<>("amount_in_crypto", Double.class, this);
  /**
   *  invoice amount in USD.
   */
  ModelField<Double> amountUsd = new ModelField<>("amount_usd", Double.class, this);
  /**
   * invoice amount in creation currency (depends on currency parameter).
   */
  ModelField<Double> amountFiat = new ModelField<>("amount_in_fiat", Double.class, this);
  ModelField<Double> amountToPay = new ModelField<>("amount_to_pay", Double.class, this);
  ModelField<Double> amountToPayUsd = new ModelField<>("amount_to_pay_usd", Double.class, this);
  ModelField<Double> amountPaid = new ModelField<>("amount_paid", Double.class, this);
  ModelField<Double> amountPaidUsd = new ModelField<>("amount_paid_usd", Double.class, this);
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
   *  service commission in USD.
   */
  ModelField<Double> serviceFeeUsd = new ModelField<>("service_fee_usd", Double.class, this);
  /**
   * amount in cryptocurrency credited to the balance.
   */
  ModelField<Double> received = new ModelField<>("received", Double.class, this);
  /**
   * amount in USD credited to the balance.
   */
  ModelField<Double> receivedUsd = new ModelField<>("received_usd", Double.class, this);
  /**
   *  amount to be additionally paid in cryptocurrency.
   */
  ModelField<Double> toSupercharge = new ModelField<>("to_surcharge", Double.class, this);
  /**
   * amount to be additionally paid in USD.
   */
  ModelField<Double> toSuperchargeUsd = new ModelField<>("to_surcharge_usd", Double.class, this);
  ModelField<String> typePayments = new ModelField<>("type_payments", String.class, this);
  /**
   *  code of fiat currency in which the invoice was created.
   */
  ModelField<String> fiatCurrency = new ModelField<>("fiat_currency", String.class, this);
  /**
   *  invoice status. When sending a request for invoice creation, it is always created.
   *  There are also paid, partial, overpaid and canceled statuses.
   */
  ModelField<String> status = new ModelField<>("status", String.class, this);
  ModelField<String> orderId = new ModelField<>("order_id", String.class, this);
  ModelField<String> phone = new ModelField<>("phone", String.class, this);
  ModelField<String> payUrl = new ModelField<>("pay_url", String.class, this);
  ModelField<String> userEmail = new ModelField<>("user_email", String.class, this);
  ModelField<String> type = new ModelField<>("type", String.class, this);
  ModelField<Object> txList = new ModelField<>("tx_list", Object.class, this);
  /**
   * parameter for mandatory email filling in the invoice.
   */
  ModelField<Boolean> isEmailRequired = new ModelField<>("is_email_required", Boolean.class, this);
  /**
   * link to the invoice page.
   */
  ModelField<String> link = new ModelField<>("link", String.class, this);
  ModelField<String> invoiceId = new ModelField<>("invoice_id", String.class, this);
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
  
  public InvoiceListEntry() {
  }
  
  public InvoiceListEntry(Map<String, Object> data) {
    super(data);
  }
}
