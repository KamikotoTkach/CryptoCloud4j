# CryptoCloud4j
SDK for [CryptoCloud](https://cryptocloud.plus/) based on [HttpWrapper](https://github.com/KamikotoTkach/HttpWrapper) <br> 
Currently wrapping all v2 requests
<br>

## Usage:
Add to pom:

```xml
<dependency>
    <groupId>ru.cwcode.tkach.cryptocloud4j</groupId>
    <artifactId>CryptoCloud4j</artifactId>
    <version>1.0.1</version>
</dependency>
```

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

### Listening for postback:
Add to pom:
```xml
<dependency>
    <groupId>ru.cwcode.tkach.cryptocloud4j</groupId>
    <artifactId>CryptoCloud4jListener</artifactId>
    <version>1.0.0</version>
</dependency>
```
Create listener:
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
