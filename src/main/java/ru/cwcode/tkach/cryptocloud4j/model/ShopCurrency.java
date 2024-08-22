package ru.cwcode.tkach.cryptocloud4j.model;

import lombok.Getter;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class ShopCurrency extends ModelObject {
  ModelField<Integer> id = new ModelField<>("id", Integer.class, this);
  ModelField<String> code = new ModelField<>("code", String.class, this);
  ModelField<String> shortCode = new ModelField<>("short_code", String.class, this);
  ModelField<String> name = new ModelField<>("name", String.class, this);
  ModelField<Boolean> isEmailRequired = new ModelField<>("is_email_required", Boolean.class, this);
  ModelField<Boolean> stablecoin = new ModelField<>("stablecoin", Boolean.class, this);
  ModelField<String> iconBase = new ModelField<>("icon_base", String.class, this);
  ModelField<String> iconNetwork = new ModelField<>("icon_network", String.class, this);
  ModelField<String> iconQr = new ModelField<>("icon_qr", String.class, this);
  ModelField<Integer> order = new ModelField<>("order", Integer.class, this);
  ModelField<Network> network = new ModelField<>("obj_network", Network.class, this);
  ModelField<Boolean> enabled = new ModelField<>("enabled", Boolean.class, this);
  
  public ShopCurrency() {
  }
  
  public ShopCurrency(Map<String, Object> data) {
    super(data);
  }
}
