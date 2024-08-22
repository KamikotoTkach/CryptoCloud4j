package ru.cwcode.tkach.cryptocloud4j.model.request;

import ru.cwcode.tkach.cryptocloud4j.model.CryptoCloudRequest;
import ru.cwcode.tkach.cryptocloud4j.model.response.StaticWalletResponse;

/**
 * A static wallet allows customers to make payments to the same address
 * without having to create a new invoice and proceed to the payment page each time.
 * This is a convenient method that allows you to accept funds in a specific cryptocurrency
 * with automatic crediting to the balance after deducting all commissions.
 * The solution is perfectly suited for projects that involve topping up the user's account balance,
 * accepting donations, iGaming projects, and others.
 */
public class StaticWalletRequest extends CryptoCloudRequest<StaticWalletRequest> {
  public StaticWalletRequest() {
    super("POST", "v2/invoice/static/create");
    addResponseModel(200, StaticWalletResponse.class);
  }
  
  /**
   * @param shopId Project identifier. Required.
   */
  public StaticWalletRequest setShopId(String shopId) {
    addBody("shop_id", shopId);
    return this;
  }
  
  /**
   * @param currency Static wallet cryptocurrency. Required.
   */
  public StaticWalletRequest setCurrency(String currency) {
    addBody("currency", currency);
    return this;
  }
  
  /**
   * @param identify Customer identifier. When POSTBACK is sent on receipt, it will be written to order_id. Required.
   */
  public StaticWalletRequest setIdentify(String identify) {
    addBody("identify", identify);
    return this;
  }
}
