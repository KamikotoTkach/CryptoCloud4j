package ru.cwcode.tkach.cryptocloud4j.model.request;

import ru.cwcode.tkach.cryptocloud4j.model.CryptoCloudRequest;
import ru.cwcode.tkach.cryptocloud4j.model.response.BillCancelled;

public class CancelBillRequest extends CryptoCloudRequest<CancelBillRequest> {
  public CancelBillRequest() {
    super("POST", "v2/invoice/merchant/canceled");
    addResponseModel(200, BillCancelled.class);
  }
  
  /**
   * @param billId Unique invoice identifier (INV-XXXXXXXX or XXXXXXXX)
   */
  public CancelBillRequest setBillId(String billId) {
    addBody("uuid", billId);
    return this;
  }
}
