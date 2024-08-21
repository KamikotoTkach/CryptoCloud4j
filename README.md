# CryptoCloud4j
SDK for [CryptoCloud](https://cryptocloud.plus/) <br>
_WIP: currently wrapped only CreateBillRequest and listening for bill status update_
<br>

Usage:
```java
//create client
ServiceClient client = new ServiceClient(new OkHttpClient(), new Gson(), "https://api.cryptocloud.plus/");
client.addHeader("Authorization", "Token YOUR-SHOP-TOKEN");
```
<br>

Create bill example:
```java 
CreateBillRequest request = new CreateBillRequest();
request.shopId("YOUR-SHOP-ID");
request.amount(200.0);
request.orderId("testid"); // <-- Your order ID, not required
    
client.sendRequest(request).thenAccept(response -> {
    response.getHandler()
        .ifMatch(200, BillCreated.class, billCreated -> {
            System.out.println("Bill created");
            System.out.println(billCreated);
          })
        .ifMatch(400, BadRequest.class, badRequest -> {
            System.out.println("Bad request");
            System.out.println(badRequest);
          })
    });
```
<br>

Postback listening example:
```java
new PostbackListener("/your/notify/url", "YOUR-SHOP-SECRET", (int) port, (postbackRequest, token) -> {
    System.out.printf("""
                      Bill status updated:
                      Invoice id %s
                      Order id %s
                      Status %s
                      """,
                      postbackRequest.invoiceId(),
                      postbackRequest.orderId(),
                      postbackRequest.status());
    return PostbackListener.Status.HANDLED;
    });
```
