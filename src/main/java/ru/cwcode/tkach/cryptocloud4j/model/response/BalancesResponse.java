package ru.cwcode.tkach.cryptocloud4j.model.response;

import lombok.Getter;
import ru.cwcode.tkach.cryptocloud4j.model.ShopCurrencyBalance;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class BalancesResponse extends ModelObject {
  ModelField<ShopCurrencyBalance[]> balances = new ModelField<>("result", ShopCurrencyBalance[].class, this);
  
  public BalancesResponse() {
  }
  
  public BalancesResponse(Map<String, Object> data) {
    super(data);
  }
}
