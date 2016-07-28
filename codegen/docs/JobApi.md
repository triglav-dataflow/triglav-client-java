# JobApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateJob**](JobApi.md#createOrUpdateJob) | **PATCH** /jobs | 
[**deleteJobByIdOrUri**](JobApi.md#deleteJobByIdOrUri) | **DELETE** /jobs/{id_or_uri} | 
[**findJobByIdOrUri**](JobApi.md#findJobByIdOrUri) | **GET** /jobs/{id_or_uri} | 
[**findJobs**](JobApi.md#findJobs) | **GET** /jobs | 


<a name="createOrUpdateJob"></a>
# **createOrUpdateJob**
> Job createOrUpdateJob(job)



Creates or Updates a single job

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.JobApi;


JobApi apiInstance = new JobApi();
JobInput job = new JobInput(); // JobInput | Job parameters
try {
    Job result = apiInstance.createOrUpdateJob(job);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#createOrUpdateJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job** | [**JobInput**](JobInput.md)| Job parameters |

### Return type

[**Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteJobByIdOrUri"></a>
# **deleteJobByIdOrUri**
> deleteJobByIdOrUri(idOrUri)



Deletes single job

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.JobApi;


JobApi apiInstance = new JobApi();
String idOrUri = "idOrUri_example"; // String | ID or URI of job to fetch
try {
    apiInstance.deleteJobByIdOrUri(idOrUri);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#deleteJobByIdOrUri");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findJobByIdOrUri"></a>
# **findJobByIdOrUri**
> Job findJobByIdOrUri(idOrUri)



Returns a single job

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.JobApi;


JobApi apiInstance = new JobApi();
String idOrUri = "idOrUri_example"; // String | ID or URI of job to fetch
try {
    Job result = apiInstance.findJobByIdOrUri(idOrUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#findJobByIdOrUri");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrUri** | **String**| ID or URI of job to fetch |

### Return type

[**Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findJobs"></a>
# **findJobs**
> List&lt;JobEach&gt; findJobs()



Returns all jobs

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.JobApi;


JobApi apiInstance = new JobApi();
try {
    List<JobEach> result = apiInstance.findJobs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#findJobs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;JobEach&gt;**](JobEach.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

