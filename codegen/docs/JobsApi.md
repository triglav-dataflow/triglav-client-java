# JobsApi

All URIs are relative to *http://localhost/apidocs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1JobsDestroy**](JobsApi.md#apiV1JobsDestroy) | **DELETE** /api/v1/jobs/{id_or_uri}.json | Deletes an existing Job item
[**apiV1JobsShow**](JobsApi.md#apiV1JobsShow) | **GET** /api/v1/jobs/{id_or_uri}.json | Fetches a single Job
[**apiV1JobsUpdate**](JobsApi.md#apiV1JobsUpdate) | **PUT** /api/v1/jobs/{id_or_uri}.json | Creates or Updates a Job


<a name="apiV1JobsDestroy"></a>
# **apiV1JobsDestroy**
> apiV1JobsDestroy(idOrUri)

Deletes an existing Job item

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.JobsApi;


JobsApi apiInstance = new JobsApi();
String idOrUri = "idOrUri_example"; // String | Resource Id or URI
try {
    apiInstance.apiV1JobsDestroy(idOrUri);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#apiV1JobsDestroy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrUri** | **String**| Resource Id or URI |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV1JobsShow"></a>
# **apiV1JobsShow**
> Resource apiV1JobsShow(idOrUri)

Fetches a single Job

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.JobsApi;


JobsApi apiInstance = new JobsApi();
String idOrUri = "idOrUri_example"; // String | Resource Id or URI
try {
    Resource result = apiInstance.apiV1JobsShow(idOrUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#apiV1JobsShow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrUri** | **String**| Resource Id or URI |

### Return type

[**Resource**](Resource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV1JobsUpdate"></a>
# **apiV1JobsUpdate**
> apiV1JobsUpdate(uri, inputResources, outputResources)

Creates or Updates a Job

Input and output resources are also created if they do not exist. Use Resource API to update.

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.JobsApi;


JobsApi apiInstance = new JobsApi();
String uri = "uri_example"; // String | Job URI
List<Object> inputResources = null; // List<Object> | Input Resources
List<Object> outputResources = null; // List<Object> | Output Resources
try {
    apiInstance.apiV1JobsUpdate(uri, inputResources, outputResources);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#apiV1JobsUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uri** | **String**| Job URI |
 **inputResources** | [**List&lt;Object&gt;**](Object.md)| Input Resources | [optional]
 **outputResources** | [**List&lt;Object&gt;**](Object.md)| Output Resources | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

