package ru.cwcode.tkach.cryptocloud4j.model;

import ru.cwcode.tkach.cryptocloud4j.model.response.BadRequestResponse;
import ru.cwcode.tkach.httpWrapper.BaseRequest;

public class CryptoCloudRequest<T extends CryptoCloudRequest<T>> extends BaseRequest<T, CryptoCloudResponse> {
  public CryptoCloudRequest(String method, String url) {
    super(method, url, CryptoCloudResponse.class);
    addResponseModel(400, BadRequestResponse.class);
    addResponseModel(403, BadRequestResponse.class);
  }
}
