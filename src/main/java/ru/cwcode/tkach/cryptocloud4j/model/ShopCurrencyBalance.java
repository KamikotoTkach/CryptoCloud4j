package ru.cwcode.tkach.cryptocloud4j.model;

import lombok.Getter;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class ShopCurrencyBalance extends ModelObject {
  ModelField<ShopCurrency> currency = new ModelField<>("currency", ShopCurrency.class, this);
  ModelField<Double> balanceCrypto = new ModelField<>("balance_crypto", Double.class, this);
  ModelField<Double> balanceUsd = new ModelField<>("balance_usd", Double.class, this);
  ModelField<Double> availableBalance = new ModelField<>("available_balance", Double.class, this);
  ModelField<Double> availableBalanceUsd = new ModelField<>("available_balance_usd", Double.class, this);
  
  public ShopCurrencyBalance() {
  }
  
  public ShopCurrencyBalance(Map<String, Object> data) {
    super(data);
  }
}
