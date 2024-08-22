package ru.cwcode.tkach.cryptocloud4j.model;

import lombok.Getter;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class Network extends ModelObject {
  ModelField<Integer> id = new ModelField<>("id", Integer.class, this);
  ModelField<String> code = new ModelField<>("code", String.class, this);
  ModelField<String> icon = new ModelField<>("icon", String.class, this);
  ModelField<String> fullname = new ModelField<>("fullname", String.class, this);
  
  public Network(Map<String, Object> data) {
    super(data);
  }
  
  public Network() {
  }
}
