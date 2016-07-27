# MessagesApi

All URIs are relative to *http://localhost/apidocs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1MessagesCreate**](MessagesApi.md#apiV1MessagesCreate) | **POST** /api/v1/messages.json | Enqueues a new Message
[**apiV1MessagesIndex**](MessagesApi.md#apiV1MessagesIndex) | **GET** /api/v1/messages.json | Fetches messages


<a name="apiV1MessagesCreate"></a>
# **apiV1MessagesCreate**
> apiV1MessagesCreate(resourceUri, datetime, params, payload)

Enqueues a new Message

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.MessagesApi;


MessagesApi apiInstance = new MessagesApi();
String resourceUri = "resourceUri_example"; // String | Resource URI (or Topic)
String datetime = "datetime_example"; // String | Date
String params = "params_example"; // String | Conditional params
String payload = "payload_example"; // String | Message payload
try {
    apiInstance.apiV1MessagesCreate(resourceUri, datetime, params, payload);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#apiV1MessagesCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceUri** | **String**| Resource URI (or Topic) |
 **datetime** | **String**| Date | [optional]
 **params** | **String**| Conditional params | [optional]
 **payload** | **String**| Message payload | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV1MessagesIndex"></a>
# **apiV1MessagesIndex**
> apiV1MessagesIndex(resourceUri, offset, datetime)

Fetches messages



### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.MessagesApi;


MessagesApi apiInstance = new MessagesApi();
String resourceUri = "resourceUri_example"; // String | Resource URI (or Topic)
Integer offset = 56; // Integer | Offset
String datetime = "datetime_example"; // String | Date
try {
    apiInstance.apiV1MessagesIndex(resourceUri, offset, datetime);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#apiV1MessagesIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceUri** | **String**| Resource URI (or Topic) |
 **offset** | **Integer**| Offset |
 **datetime** | **String**| Date | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

