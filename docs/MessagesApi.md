# MessagesApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchMessages**](MessagesApi.md#fetchMessages) | **GET** /messages | 
[**sendMessage**](MessagesApi.md#sendMessage) | **POST** /messages | 


<a name="fetchMessages"></a>
# **fetchMessages**
> List&lt;MessageEach&gt; fetchMessages(resourceUri, offset, datetime)



Fetches messages

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MessagesApi apiInstance = new MessagesApi();
String resourceUri = "resourceUri_example"; // String | URI of Resource
Integer offset = 56; // Integer | Offset ID for Messages to fetch from
String datetime = "datetime_example"; // String | Datetime formatted by ISO 8601
try {
    List<MessageEach> result = apiInstance.fetchMessages(resourceUri, offset, datetime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#fetchMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceUri** | **String**| URI of Resource |
 **offset** | **Integer**| Offset ID for Messages to fetch from |
 **datetime** | **String**| Datetime formatted by ISO 8601 | [optional]

### Return type

[**List&lt;MessageEach&gt;**](MessageEach.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendMessage"></a>
# **sendMessage**
> Message sendMessage(resourceUri, datetime, message)



Enqueues a new message

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MessagesApi apiInstance = new MessagesApi();
String resourceUri = "resourceUri_example"; // String | URI of Resource
String datetime = "datetime_example"; // String | Datetime formatted by ISO 8601
MessageInput message = new MessageInput(); // MessageInput | Message to add
try {
    Message result = apiInstance.sendMessage(resourceUri, datetime, message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#sendMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceUri** | **String**| URI of Resource |
 **datetime** | **String**| Datetime formatted by ISO 8601 |
 **message** | [**MessageInput**](MessageInput.md)| Message to add |

### Return type

[**Message**](Message.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

