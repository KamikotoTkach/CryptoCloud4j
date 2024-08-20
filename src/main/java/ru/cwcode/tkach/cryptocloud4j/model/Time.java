package ru.cwcode.tkach.cryptocloud4j.model;

import lombok.Getter;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class Time extends ModelObject {
  ModelField<Integer> hours = new ModelField<>("hours", Integer.class, this);
  ModelField<Integer> minutes = new ModelField<>("minutes", Integer.class, this);
  
  public Time(Map<String, Object> data) {
    super(data);
  }
  
  public Time() {
  }
}
