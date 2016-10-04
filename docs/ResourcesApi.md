# ResourcesApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createResource**](ResourcesApi.md#createResource) | **POST** /resources | 
[**deleteResource**](ResourcesApi.md#deleteResource) | **DELETE** /resources/{id_or_uri} | 
[**getResource**](ResourcesApi.md#getResource) | **GET** /resources/{id_or_uri} | 
[**listResources**](ResourcesApi.md#listResources) | **GET** /resources | 
[**updateResource**](ResourcesApi.md#updateResource) | **PATCH** /resources/{id_or_uri} | 


<a name="createResource"></a>
# **createResource**
> Resource createResource(resource)



Creates a new resource

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.ResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResourcesApi apiInstance = new ResourcesApi();
ResourceInput resource = new ResourceInput(); // ResourceInput | Resource to add
try {
    Resource result = apiInstance.createResource(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#createResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ResourceInput**](ResourceInput.md)| Resource to add |

### Return type

[**Resource**](Resource.md)

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
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.ResourcesApi;

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
> Resource getResource(idOrUri)



Returns a single resource

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.ResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResourcesApi apiInstance = new ResourcesApi();
String idOrUri = "idOrUri_example"; // String | ID or URI of resource to fetch
try {
    Resource result = apiInstance.getResource(idOrUri);
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

[**Resource**](Resource.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listResources"></a>
# **listResources**
> List&lt;ResourceEach&gt; listResources(clusterId, consumable, notifiable)



Returns all resources from the system

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.ResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResourcesApi apiInstance = new ResourcesApi();
Integer clusterId = 56; // Integer | ID of Cluster
Boolean consumable = true; // Boolean | Consuamble
Boolean notifiable = true; // Boolean | Notifiable
try {
    List<ResourceEach> result = apiInstance.listResources(clusterId, consumable, notifiable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#listResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **Integer**| ID of Cluster |
 **consumable** | **Boolean**| Consuamble |
 **notifiable** | **Boolean**| Notifiable |

### Return type

[**List&lt;ResourceEach&gt;**](ResourceEach.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateResource"></a>
# **updateResource**
> Resource updateResource(idOrUri, resource)



Updates a single resource

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.ResourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResourcesApi apiInstance = new ResourcesApi();
String idOrUri = "idOrUri_example"; // String | ID or URI of resource to fetch
ResourceInput resource = new ResourceInput(); // ResourceInput | Resource parameters to update
try {
    Resource result = apiInstance.updateResource(idOrUri, resource);
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
 **resource** | [**ResourceInput**](ResourceInput.md)| Resource parameters to update |

### Return type

[**Resource**](Resource.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

