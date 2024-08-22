package ru.cwcode.tkach.cryptocloud4j.model.request;

import ru.cwcode.tkach.cryptocloud4j.model.CryptoCloudRequest;
import ru.cwcode.tkach.cryptocloud4j.model.response.InvoicesInfo;

import java.util.List;

public class InvoicesInfoRequest extends CryptoCloudRequest<InvoicesInfoRequest> {
  public InvoicesInfoRequest() {
    super("POST", "v2/invoice/merchant/info");
    addResponseModel(200, InvoicesInfo.class);
  }
  
  /**
   * @param uuids List of invoice identifiers (INV-XXXXXXXX or XXXXXXXX)
   */
  public InvoicesInfoRequest setUUIDs(String... uuids) {
    addBody("uuids", uuids);
    return this;
  }
  
  /**
   * @param uuids List of invoice identifiers (INV-XXXXXXXX or XXXXXXXX)
   */
  public InvoicesInfoRequest setUUIDs(List<String> uuids) {
    addBody("uuids", uuids);
    return this;
  }
}
