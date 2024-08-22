package ru.cwcode.tkach.cryptocloud4j.model;

import lombok.Getter;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class StatisticCount extends ModelObject {
  /**
   * all invoices.
   */
  ModelField<Integer> all = new ModelField<>("all", Integer.class, this);
  /**
   * invoices with the status «Created».
   */
  ModelField<Integer> created = new ModelField<>("created", Integer.class, this);
  /**
   *  invoices with the status «Paid».
   */
  ModelField<Integer> paid = new ModelField<>("paid", Integer.class, this);
  /**
   * invoices with the status «Overpaid».
   */
  ModelField<Integer> overpaid = new ModelField<>("overpaid", Integer.class, this);
  /**
   * invoices with the status «Partially paid».
   */
  ModelField<Integer> partial = new ModelField<>("partial", Integer.class, this);
  /**
   * invoices with the status «Canceled».
   */
  ModelField<Integer> canceled = new ModelField<>("canceled", Integer.class, this);
  
  public StatisticCount() {
  }
  
  public StatisticCount(Map<String, Object> data) {
    super(data);
  }
}
