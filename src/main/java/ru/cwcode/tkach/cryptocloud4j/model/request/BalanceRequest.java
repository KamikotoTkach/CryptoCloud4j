package ru.cwcode.tkach.cryptocloud4j.model.request;

import ru.cwcode.tkach.cryptocloud4j.model.CryptoCloudRequest;
import ru.cwcode.tkach.cryptocloud4j.model.response.BalancesResponse;

public class BalanceRequest extends CryptoCloudRequest<BalanceRequest> {
  public BalanceRequest() {
    super("POST", "v2/merchant/wallet/balance/all");
    addResponseModel(200, BalancesResponse.class);
  }
}
