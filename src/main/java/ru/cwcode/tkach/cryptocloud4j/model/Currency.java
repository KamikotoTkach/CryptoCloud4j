package ru.cwcode.tkach.cryptocloud4j.model;

import lombok.Getter;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class Currency extends ModelObject {
  ModelField<Integer> id = new ModelField<>("id", Integer.class, this);
  ModelField<String> code = new ModelField<>("code", String.class, this);
  ModelField<String> fullcode = new ModelField<>("fullcode", String.class, this);
  ModelField<Network> network = new ModelField<>("network", Network.class, this);
  
  public Currency(Map<String, Object> data) {
    super(data);
  }
  
  public Currency() {
  }
}
