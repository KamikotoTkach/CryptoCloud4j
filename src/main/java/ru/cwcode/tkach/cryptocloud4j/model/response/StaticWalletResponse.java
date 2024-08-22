package ru.cwcode.tkach.cryptocloud4j.model.response;

import lombok.Getter;
import ru.cwcode.tkach.cryptocloud4j.model.ShopCurrency;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class StaticWalletResponse extends ModelObject {
  ModelField<ShopCurrency> currency = new ModelField<>("currency", ShopCurrency.class, this);
  /**
   * Cryptocurrency address
   */
  ModelField<String> address = new ModelField<>("address", String.class, this);
  ModelField<String> uuid = new ModelField<>("uuid", String.class, this);
  
  public StaticWalletResponse() {
  }
  
  public StaticWalletResponse(Map<String, Object> data) {
    super(data);
  }
}
