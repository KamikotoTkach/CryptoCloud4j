package ru.cwcode.tkach.cryptocloud4j.model;

import lombok.Getter;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class StatisticAmount extends ModelObject {
  /**
   * all invoices.
   */
  ModelField<Double> all = new ModelField<>("all", Double.class, this);
  /**
   * invoices with the status «Created».
   */
  ModelField<Double> created = new ModelField<>("created", Double.class, this);
  /**
   *  invoices with the status «Paid».
   */
  ModelField<Double> paid = new ModelField<>("paid", Double.class, this);
  /**
   * invoices with the status «Overpaid».
   */
  ModelField<Double> overpaid = new ModelField<>("overpaid", Double.class, this);
  /**
   * invoices with the status «Partially paid».
   */
  ModelField<Double> partial = new ModelField<>("partial", Double.class, this);
  /**
   * invoices with the status «Canceled».
   */
  ModelField<Double> canceled = new ModelField<>("canceled", Double.class, this);
  
  public StatisticAmount() {
  }
  
  public StatisticAmount(Map<String, Object> data) {
    super(data);
  }
}
