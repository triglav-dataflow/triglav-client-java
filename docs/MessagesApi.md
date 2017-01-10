# MessagesApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchMessages**](MessagesApi.md#fetchMessages) | **POST** /fetch_messages | 
[**getLastMessageId**](MessagesApi.md#getLastMessageId) | **GET** /messages/last_id | 
[**listMessages**](MessagesApi.md#listMessages) | **GET** /messages | 
[**sendMessages**](MessagesApi.md#sendMessages) | **POST** /messages | 


<a name="fetchMessages"></a>
# **fetchMessages**
> List&lt;MessageEachResponse&gt; fetchMessages(fetchRequest)



Fetch messages with HTTP POST method

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
MessageFetchRequest fetchRequest = new MessageFetchRequest(); // MessageFetchRequest | Fetch Request
try {
    List<MessageEachResponse> result = apiInstance.fetchMessages(fetchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#fetchMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fetchRequest** | [**MessageFetchRequest**](MessageFetchRequest.md)| Fetch Request |

### Return type

[**List&lt;MessageEachResponse&gt;**](MessageEachResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLastMessageId"></a>
# **getLastMessageId**
> LastMessageIdResponse getLastMessageId()



Get the current last message id which would be used as a first offset to fetch messages

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
try {
    LastMessageIdResponse result = apiInstance.getLastMessageId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#getLastMessageId");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LastMessageIdResponse**](LastMessageIdResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMessages"></a>
# **listMessages**
> List&lt;MessageEachResponse&gt; listMessages(offset, limit, resourceUris)



List messages with HTTP GET method

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
Integer offset = 56; // Integer | Offset (Greater than or equal to) ID for Messages to list from
Integer limit = 56; // Integer | Number of limits
String resourceUris = "resourceUris_example"; // String | URIs of Resource
try {
    List<MessageEachResponse> result = apiInstance.listMessages(offset, limit, resourceUris);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#listMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Offset (Greater than or equal to) ID for Messages to list from |
 **limit** | **Integer**| Number of limits | [optional]
 **resourceUris** | **String**| URIs of Resource | [optional]

### Return type

[**List&lt;MessageEachResponse&gt;**](MessageEachResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendMessages"></a>
# **sendMessages**
> BulkinsertResponse sendMessages(messages)



Enqueues new messages

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
List<MessageRequest> messages = Arrays.asList(new MessageRequest()); // List<MessageRequest> | Messages to enqueue
try {
    BulkinsertResponse result = apiInstance.sendMessages(messages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#sendMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messages** | [**List&lt;MessageRequest&gt;**](MessageRequest.md)| Messages to enqueue |

### Return type

[**BulkinsertResponse**](BulkinsertResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

