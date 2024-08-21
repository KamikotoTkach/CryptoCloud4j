package ru.cwcode.tkach.cryptocloud4j.listener.model;

public record PostbackRequest(String status,
                              String invoiceId,
                              double amountCrypto,
                              String currency,
                              String orderId,
                              String token) {
}
