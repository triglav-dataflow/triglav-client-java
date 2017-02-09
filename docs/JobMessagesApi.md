# JobMessagesApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchJobMessages**](JobMessagesApi.md#fetchJobMessages) | **GET** /job_messages | 
[**getLastJobMessageId**](JobMessagesApi.md#getLastJobMessageId) | **GET** /job_messages/last_id | 


<a name="fetchJobMessages"></a>
# **fetchJobMessages**
> List&lt;JobMessageEachResponse&gt; fetchJobMessages(offset, jobId, limit)



Fetch Job messages

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.JobMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobMessagesApi apiInstance = new JobMessagesApi();
Long offset = 789L; // Long | Offset (Greater than or equal to) ID for Messages to fetch from
Long jobId = 789L; // Long | Job ID
Long limit = 789L; // Long | Number of limits
try {
    List<JobMessageEachResponse> result = apiInstance.fetchJobMessages(offset, jobId, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobMessagesApi#fetchJobMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Long**| Offset (Greater than or equal to) ID for Messages to fetch from |
 **jobId** | **Long**| Job ID |
 **limit** | **Long**| Number of limits | [optional]

### Return type

[**List&lt;JobMessageEachResponse&gt;**](JobMessageEachResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLastJobMessageId"></a>
# **getLastJobMessageId**
> LastJobMessageIdResponse getLastJobMessageId()



Get the current last message id which would be used as a first offset to fetch messages

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.JobMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobMessagesApi apiInstance = new JobMessagesApi();
try {
    LastJobMessageIdResponse result = apiInstance.getLastJobMessageId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobMessagesApi#getLastJobMessageId");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LastJobMessageIdResponse**](LastJobMessageIdResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

