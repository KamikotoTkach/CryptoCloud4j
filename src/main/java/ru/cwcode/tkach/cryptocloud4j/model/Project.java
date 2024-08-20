package ru.cwcode.tkach.cryptocloud4j.model;

import lombok.Getter;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class Project extends ModelObject {
  ModelField<Integer> id = new ModelField<>("id", Integer.class, this);
  ModelField<String> name = new ModelField<>("name", String.class, this);
  ModelField<String> fail = new ModelField<>("fail", String.class, this);
  ModelField<String> success = new ModelField<>("success", String.class, this);
  ModelField<String> logo = new ModelField<>("logo", String.class, this);
  
  public Project() {
  }
  
  public Project(Map<String, Object> data) {
    super(data);
  }
}
