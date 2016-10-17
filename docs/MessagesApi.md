# MessagesApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchMessages**](MessagesApi.md#fetchMessages) | **GET** /messages | 
[**sendMessage**](MessagesApi.md#sendMessage) | **POST** /messages | 


<a name="fetchMessages"></a>
# **fetchMessages**
> List&lt;MessageEachResponse&gt; fetchMessages(offset, resourceUri)



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
Integer offset = 56; // Integer | Offset (Greater than or equal to) ID for Messages to fetch from
String resourceUri = "resourceUri_example"; // String | URI of Resource
try {
    List<MessageEachResponse> result = apiInstance.fetchMessages(offset, resourceUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#fetchMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Offset (Greater than or equal to) ID for Messages to fetch from |
 **resourceUri** | **String**| URI of Resource |

### Return type

[**List&lt;MessageEachResponse&gt;**](MessageEachResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendMessage"></a>
# **sendMessage**
> MessageResponse sendMessage(resourceUri, resourceUnit, resourceTime, resourceTimezone, message)



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
String resourceUnit = "resourceUnit_example"; // String | Unit of Resource
Integer resourceTime = 56; // Integer | Resource Time
String resourceTimezone = "resourceTimezone_example"; // String | Timezone of Resource Time
MessageRequest message = new MessageRequest(); // MessageRequest | Message to add
try {
    MessageResponse result = apiInstance.sendMessage(resourceUri, resourceUnit, resourceTime, resourceTimezone, message);
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
 **resourceUnit** | **String**| Unit of Resource |
 **resourceTime** | **Integer**| Resource Time |
 **resourceTimezone** | **String**| Timezone of Resource Time |
 **message** | [**MessageRequest**](MessageRequest.md)| Message to add |

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

