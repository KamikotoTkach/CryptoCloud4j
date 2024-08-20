package ru.cwcode.tkach.cryptocloud4j.spark.model;

public record PostbackRequest(String status, String invoice_id, double amount_crypto, String currency, String order_id, String token) {
}
