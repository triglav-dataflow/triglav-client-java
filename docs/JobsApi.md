# JobsApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateJob**](JobsApi.md#createOrUpdateJob) | **PATCH** /jobs | 
[**deleteJob**](JobsApi.md#deleteJob) | **DELETE** /jobs/{id_or_uri} | 
[**getJob**](JobsApi.md#getJob) | **GET** /jobs/{id_or_uri} | 
[**listJobs**](JobsApi.md#listJobs) | **GET** /jobs | 


<a name="createOrUpdateJob"></a>
# **createOrUpdateJob**
> JobResponse createOrUpdateJob(job)



Creates or Updates a single job

### Example
```java
// Import classes:
//import io.github.triglav_dataflow.client.ApiClient;
//import io.github.triglav_dataflow.client.ApiException;
//import io.github.triglav_dataflow.client.Configuration;
//import io.github.triglav_dataflow.client.auth.*;
//import io.github.triglav_dataflow.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobsApi apiInstance = new JobsApi();
JobRequest job = new JobRequest(); // JobRequest | Job parameters
try {
    JobResponse result = apiInstance.createOrUpdateJob(job);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#createOrUpdateJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job** | [**JobRequest**](JobRequest.md)| Job parameters |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteJob"></a>
# **deleteJob**
> deleteJob(idOrUri)



Deletes single job

### Example
```java
// Import classes:
//import io.github.triglav_dataflow.client.ApiClient;
//import io.github.triglav_dataflow.client.ApiException;
//import io.github.triglav_dataflow.client.Configuration;
//import io.github.triglav_dataflow.client.auth.*;
//import io.github.triglav_dataflow.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobsApi apiInstance = new JobsApi();
String idOrUri = "idOrUri_example"; // String | ID or URI of job to fetch
try {
    apiInstance.deleteJob(idOrUri);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#deleteJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrUri** | **String**| ID or URI of job to fetch |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJob"></a>
# **getJob**
> JobResponse getJob(idOrUri)



Returns a single job

### Example
```java
// Import classes:
//import io.github.triglav_dataflow.client.ApiClient;
//import io.github.triglav_dataflow.client.ApiException;
//import io.github.triglav_dataflow.client.Configuration;
//import io.github.triglav_dataflow.client.auth.*;
//import io.github.triglav_dataflow.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobsApi apiInstance = new JobsApi();
String idOrUri = "idOrUri_example"; // String | ID or URI of job to fetch
try {
    JobResponse result = apiInstance.getJob(idOrUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#getJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrUri** | **String**| ID or URI of job to fetch |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listJobs"></a>
# **listJobs**
> List&lt;JobEachResponse&gt; listJobs()



Returns all jobs

### Example
```java
// Import classes:
//import io.github.triglav_dataflow.client.ApiClient;
//import io.github.triglav_dataflow.client.ApiException;
//import io.github.triglav_dataflow.client.Configuration;
//import io.github.triglav_dataflow.client.auth.*;
//import io.github.triglav_dataflow.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JobsApi apiInstance = new JobsApi();
try {
    List<JobEachResponse> result = apiInstance.listJobs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#listJobs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;JobEachResponse&gt;**](JobEachResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

