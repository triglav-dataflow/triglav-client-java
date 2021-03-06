# ResourcesApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createResource**](ResourcesApi.md#createResource) | **POST** /resources | 
[**deleteResource**](ResourcesApi.md#deleteResource) | **DELETE** /resources/{id_or_uri} | 
[**getResource**](ResourcesApi.md#getResource) | **GET** /resources/{id_or_uri} | 
[**listAggregatedResources**](ResourcesApi.md#listAggregatedResources) | **GET** /aggregated_resources | 
[**listResources**](ResourcesApi.md#listResources) | **GET** /resources | 
[**updateResource**](ResourcesApi.md#updateResource) | **PATCH** /resources/{id_or_uri} | 


<a name="createResource"></a>
# **createResource**
> ResourceResponse createResource(resource)



Creates a new resource

### Example
```java
// Import classes:
//import io.github.triglav_dataflow.client.ApiClient;
//import io.github.triglav_dataflow.client.ApiException;
//import io.github.triglav_dataflow.client.Configuration;
//import io.github.triglav_dataflow.client.auth.*;
//import io.github.triglav_dataflow.client.api.ResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResourcesApi apiInstance = new ResourcesApi();
ResourceRequest resource = new ResourceRequest(); // ResourceRequest | Resource to add
try {
    ResourceResponse result = apiInstance.createResource(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#createResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ResourceRequest**](ResourceRequest.md)| Resource to add |

### Return type

[**ResourceResponse**](ResourceResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteResource"></a>
# **deleteResource**
> deleteResource(idOrUri)



Deletes single resource

### Example
```java
// Import classes:
//import io.github.triglav_dataflow.client.ApiClient;
//import io.github.triglav_dataflow.client.ApiException;
//import io.github.triglav_dataflow.client.Configuration;
//import io.github.triglav_dataflow.client.auth.*;
//import io.github.triglav_dataflow.client.api.ResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResourcesApi apiInstance = new ResourcesApi();
String idOrUri = "idOrUri_example"; // String | ID or URI of resource to fetch
try {
    apiInstance.deleteResource(idOrUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#deleteResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrUri** | **String**| ID or URI of resource to fetch |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResource"></a>
# **getResource**
> ResourceResponse getResource(idOrUri)



Returns a single resource

### Example
```java
// Import classes:
//import io.github.triglav_dataflow.client.ApiClient;
//import io.github.triglav_dataflow.client.ApiException;
//import io.github.triglav_dataflow.client.Configuration;
//import io.github.triglav_dataflow.client.auth.*;
//import io.github.triglav_dataflow.client.api.ResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResourcesApi apiInstance = new ResourcesApi();
String idOrUri = "idOrUri_example"; // String | ID or URI of resource to fetch
try {
    ResourceResponse result = apiInstance.getResource(idOrUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#getResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrUri** | **String**| ID or URI of resource to fetch |

### Return type

[**ResourceResponse**](ResourceResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAggregatedResources"></a>
# **listAggregatedResources**
> List&lt;AggregatedResourceEachResponse&gt; listAggregatedResources(uriPrefix)



Returns aggregated resources to be monitored

### Example
```java
// Import classes:
//import io.github.triglav_dataflow.client.ApiClient;
//import io.github.triglav_dataflow.client.ApiException;
//import io.github.triglav_dataflow.client.Configuration;
//import io.github.triglav_dataflow.client.auth.*;
//import io.github.triglav_dataflow.client.api.ResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResourcesApi apiInstance = new ResourcesApi();
String uriPrefix = "uriPrefix_example"; // String | Prefix of Resource URI
try {
    List<AggregatedResourceEachResponse> result = apiInstance.listAggregatedResources(uriPrefix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#listAggregatedResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uriPrefix** | **String**| Prefix of Resource URI |

### Return type

[**List&lt;AggregatedResourceEachResponse&gt;**](AggregatedResourceEachResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listResources"></a>
# **listResources**
> List&lt;ResourceEachResponse&gt; listResources(uriPrefix)



Returns all resources

### Example
```java
// Import classes:
//import io.github.triglav_dataflow.client.ApiClient;
//import io.github.triglav_dataflow.client.ApiException;
//import io.github.triglav_dataflow.client.Configuration;
//import io.github.triglav_dataflow.client.auth.*;
//import io.github.triglav_dataflow.client.api.ResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResourcesApi apiInstance = new ResourcesApi();
String uriPrefix = "uriPrefix_example"; // String | Prefix of Resource URI
try {
    List<ResourceEachResponse> result = apiInstance.listResources(uriPrefix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#listResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uriPrefix** | **String**| Prefix of Resource URI | [optional]

### Return type

[**List&lt;ResourceEachResponse&gt;**](ResourceEachResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateResource"></a>
# **updateResource**
> ResourceResponse updateResource(idOrUri, resource)



Updates a single resource

### Example
```java
// Import classes:
//import io.github.triglav_dataflow.client.ApiClient;
//import io.github.triglav_dataflow.client.ApiException;
//import io.github.triglav_dataflow.client.Configuration;
//import io.github.triglav_dataflow.client.auth.*;
//import io.github.triglav_dataflow.client.api.ResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResourcesApi apiInstance = new ResourcesApi();
String idOrUri = "idOrUri_example"; // String | ID or URI of resource to fetch
ResourceRequest resource = new ResourceRequest(); // ResourceRequest | Resource parameters to update
try {
    ResourceResponse result = apiInstance.updateResource(idOrUri, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#updateResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrUri** | **String**| ID or URI of resource to fetch |
 **resource** | [**ResourceRequest**](ResourceRequest.md)| Resource parameters to update |

### Return type

[**ResourceResponse**](ResourceResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

