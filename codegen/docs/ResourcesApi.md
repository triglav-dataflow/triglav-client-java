# ResourcesApi

All URIs are relative to *http://localhost/apidocs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ResourcesCreate**](ResourcesApi.md#apiV1ResourcesCreate) | **POST** /api/v1/resources.json | Creates a Resource
[**apiV1ResourcesDestroy**](ResourcesApi.md#apiV1ResourcesDestroy) | **DELETE** /api/v1/resources/{id_or_uri}.json | Deletes an existing Resource
[**apiV1ResourcesIndex**](ResourcesApi.md#apiV1ResourcesIndex) | **GET** /api/v1/resources.json | Fetches resources
[**apiV1ResourcesShow**](ResourcesApi.md#apiV1ResourcesShow) | **GET** /api/v1/resources/{id_or_uri}.json | Fetches a single Resource
[**apiV1ResourcesUpdate**](ResourcesApi.md#apiV1ResourcesUpdate) | **PUT** /api/v1/resources/{id_or_uri}.json | Updates a Resource


<a name="apiV1ResourcesCreate"></a>
# **apiV1ResourcesCreate**
> apiV1ResourcesCreate(uri, description, clusterId, consumable, notifiable)

Creates a Resource

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ResourcesApi;


ResourcesApi apiInstance = new ResourcesApi();
String uri = "uri_example"; // String | Resource URI
String description = "description_example"; // String | Description
Integer clusterId = 56; // Integer | Cluster Id
Boolean consumable = true; // Boolean | Consumable or not
Boolean notifiable = true; // Boolean | Notifiable or not
try {
    apiInstance.apiV1ResourcesCreate(uri, description, clusterId, consumable, notifiable);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#apiV1ResourcesCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uri** | **String**| Resource URI |
 **description** | **String**| Description | [optional]
 **clusterId** | **Integer**| Cluster Id | [optional]
 **consumable** | **Boolean**| Consumable or not | [optional]
 **notifiable** | **Boolean**| Notifiable or not | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV1ResourcesDestroy"></a>
# **apiV1ResourcesDestroy**
> apiV1ResourcesDestroy(idOrUri)

Deletes an existing Resource

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ResourcesApi;


ResourcesApi apiInstance = new ResourcesApi();
String idOrUri = "idOrUri_example"; // String | Resource Id or URI
try {
    apiInstance.apiV1ResourcesDestroy(idOrUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#apiV1ResourcesDestroy");
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

<a name="apiV1ResourcesIndex"></a>
# **apiV1ResourcesIndex**
> apiV1ResourcesIndex(clusterId, consumable, notifiable)

Fetches resources

Query and fetch resources

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ResourcesApi;


ResourcesApi apiInstance = new ResourcesApi();
String clusterId = "clusterId_example"; // String | Cluster Id
Boolean consumable = true; // Boolean | Consumable or not
Boolean notifiable = true; // Boolean | Notifiable or not
try {
    apiInstance.apiV1ResourcesIndex(clusterId, consumable, notifiable);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#apiV1ResourcesIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| Cluster Id |
 **consumable** | **Boolean**| Consumable or not |
 **notifiable** | **Boolean**| Notifiable or not |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV1ResourcesShow"></a>
# **apiV1ResourcesShow**
> Resource apiV1ResourcesShow(idOrUri)

Fetches a single Resource

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ResourcesApi;


ResourcesApi apiInstance = new ResourcesApi();
String idOrUri = "idOrUri_example"; // String | Resource Id or URI
try {
    Resource result = apiInstance.apiV1ResourcesShow(idOrUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#apiV1ResourcesShow");
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

<a name="apiV1ResourcesUpdate"></a>
# **apiV1ResourcesUpdate**
> apiV1ResourcesUpdate(idOrUri, uri, description, clusterId, consumable, notifiable)

Updates a Resource

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ResourcesApi;


ResourcesApi apiInstance = new ResourcesApi();
String idOrUri = "idOrUri_example"; // String | Resource Id or URI
String uri = "uri_example"; // String | Resource URI
String description = "description_example"; // String | Description
Integer clusterId = 56; // Integer | Cluster Id
Boolean consumable = true; // Boolean | Consumable or not
Boolean notifiable = true; // Boolean | Notifiable or not
try {
    apiInstance.apiV1ResourcesUpdate(idOrUri, uri, description, clusterId, consumable, notifiable);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#apiV1ResourcesUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrUri** | **String**| Resource Id or URI |
 **uri** | **String**| Resource URI |
 **description** | **String**| Description | [optional]
 **clusterId** | **Integer**| Cluster Id | [optional]
 **consumable** | **Boolean**| Consumable or not | [optional]
 **notifiable** | **Boolean**| Notifiable or not | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

