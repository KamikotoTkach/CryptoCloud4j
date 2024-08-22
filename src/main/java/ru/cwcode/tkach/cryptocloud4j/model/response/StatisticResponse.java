package ru.cwcode.tkach.cryptocloud4j.model.response;

import lombok.Getter;
import ru.cwcode.tkach.cryptocloud4j.model.StatisticAmount;
import ru.cwcode.tkach.cryptocloud4j.model.StatisticCount;
import ru.cwcode.tkach.httpWrapper.ModelField;
import ru.cwcode.tkach.httpWrapper.ModelObject;

import java.util.Map;

@Getter
public class StatisticResponse extends ModelObject {
  /**
   * an object that contains values for the number of invoices.
   */
  ModelField<StatisticCount> count = new ModelField<>("count", StatisticCount.class, this);
  /**
   * an object that contains values for the invoice amounts in USD.
   */
  ModelField<StatisticAmount> amount = new ModelField<>("amount", StatisticAmount.class, this);
  
  public StatisticResponse() {
  }
  
  public StatisticResponse(Map<String, Object> data) {
    super(data);
  }
}
