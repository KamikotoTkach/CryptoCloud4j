package ru.cwcode.tkach.cryptocloud4j.model.request;

import ru.cwcode.tkach.cryptocloud4j.model.CryptoCloudRequest;
import ru.cwcode.tkach.cryptocloud4j.model.response.StatisticResponse;

/**
 * invoice statistics for the specified period
 */
public class StatisticsRequest extends CryptoCloudRequest<StatisticsRequest> {
  public StatisticsRequest() {
    super("POST", "v2/invoice/merchant/statistics");
    addResponseModel(200, StatisticResponse.class);
  }
  
  /**
   * @param start Date in format «dd.mm.yyyyy». Required.
   */
  public StatisticsRequest setStart(String start) {
    addBody("start", start);
    return this;
  }
  
  /**
   * @param end Date in format «dd.mm.yyyyy». Required.
   */
  public StatisticsRequest setEnd(String end) {
    addBody("end", end);
    return this;
  }
}
