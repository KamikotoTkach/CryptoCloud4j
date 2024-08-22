# CryptoCloud4j
SDK for [CryptoCloud](https://cryptocloud.plus/) <br>
Currently wrapping all v2 requests
<br>

## Usage:
Create client
```java
ServiceClient client = new ServiceClient(new OkHttpClient(), new Gson(), "https://api.cryptocloud.plus/");
client.addHeader("Authorization", "Token YOUR-SHOP-TOKEN");
```
<br>

Create bill:
```java 
CreateBillRequest request = new CreateBillRequest();
request.shopId("YOUR-SHOP-ID");
request.amount(200.0);
request.orderId("testid"); // <-- Your order ID, not required
    
client.sendRequest(request).thenAccept(response -> {
    response.getHandler()
        .ifMatch(200, BillCreatedResponse.class, billCreated -> {
            System.out.println("Bill created");
            System.out.println(billCreated);
          })
        .ifMatch(400, BadRequestResponse.class, badRequest -> {
            System.out.println("Bad request");
            System.out.println(badRequest);
          })
    });
```
<br>

Listen for postback:
```java
new PostbackListener("/your/notify/url", "YOUR-SHOP-SECRET", (int) port, (postbackRequest, token) -> { // <-- is called only if the JWT token is valid
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
