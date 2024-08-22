package ru.cwcode.tkach.cryptocloud4j.model.response;

import lombok.Getter;
import ru.cwcode.tkach.cryptocloud4j.model.ShopCurrencyBalance;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class Balances extends ModelObject {
  ModelField<ShopCurrencyBalance[]> balances = new ModelField<>("result", ShopCurrencyBalance[].class, this);
  
  public Balances() {
  }
  
  public Balances(Map<String, Object> data) {
    super(data);
  }
}
