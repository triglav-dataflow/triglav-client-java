# MessageApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchMessages**](MessageApi.md#fetchMessages) | **GET** /messages | 
[**sendMessage**](MessageApi.md#sendMessage) | **POST** /messages | 


<a name="fetchMessages"></a>
# **fetchMessages**
> List&lt;MessageEach&gt; fetchMessages(resourceUri, offset, datetime)



Fetches messages

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.MessageApi;


MessageApi apiInstance = new MessageApi();
String resourceUri = "resourceUri_example"; // String | URI of Resource
Integer offset = 56; // Integer | Offset ID for Messages to fetch from
String datetime = "datetime_example"; // String | Datetime formatted by ISO 8601
try {
    List<MessageEach> result = apiInstance.fetchMessages(resourceUri, offset, datetime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#fetchMessages");
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

No authorization required

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
//import io.triglav.client.ApiException;
//import io.triglav.client.api.MessageApi;


MessageApi apiInstance = new MessageApi();
String resourceUri = "resourceUri_example"; // String | URI of Resource
String datetime = "datetime_example"; // String | Datetime formatted by ISO 8601
MessageInput message = new MessageInput(); // MessageInput | Message to add
try {
    Message result = apiInstance.sendMessage(resourceUri, datetime, message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#sendMessage");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

