package ru.cwcode.tkach.cryptocloud4j.model.request;

import ru.cwcode.tkach.cryptocloud4j.model.CryptoCloudRequest;
import ru.cwcode.tkach.cryptocloud4j.model.response.InvoicesListResponse;

/**
 * When you send this request, you will receive a list of invoices for the specified period.
 * The maximum number of records per request is 100. By default, the response will contain 10 records.
 */
public class InvoicesListRequest extends CryptoCloudRequest<InvoicesListRequest> {
  public InvoicesListRequest() {
    super("POST", "v2/invoice/merchant/list");
    addResponseModel(200, InvoicesListResponse.class);
  }
  
  /**
   * @param start Date in format «dd.mm.yyyyy». Required.
   */
  public InvoicesListRequest setStart(String start) {
    addBody("start", start);
    return this;
  }
  
  /**
   * @param end Date in format «dd.mm.yyyyy». Must be later or equal to start. Required.
   */
  public InvoicesListRequest setEnd(String end) {
    addBody("end", end);
    return this;
  }
  
  /**
   * @param offset This is the number of the initial record from which data output will start.
   *               For example, if you set offset=10, the data will start to be displayed from the 11th record
   */
  public InvoicesListRequest setOffset(Integer offset) {
    addBody("offset", offset);
    return this;
  }
  
  /**
   * @param limit This is the number of the last record you want to receive.
   *              For example, if limit=20, you will get records up to and including the 20th,
   *              starting from the one specified in offset
   */
  public InvoicesListRequest setLimit(Integer limit) {
    addBody("limit", limit);
    return this;
  }
}
