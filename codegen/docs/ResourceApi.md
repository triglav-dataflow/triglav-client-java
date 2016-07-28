# ResourceApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addResource**](ResourceApi.md#addResource) | **POST** /resources | 
[**deleteResourceByIdOrUri**](ResourceApi.md#deleteResourceByIdOrUri) | **DELETE** /resources/{id_or_uri} | 
[**findResourceByIdOrUri**](ResourceApi.md#findResourceByIdOrUri) | **GET** /resources/{id_or_uri} | 
[**findResources**](ResourceApi.md#findResources) | **GET** /resources | 
[**updateResourceByIdOrUri**](ResourceApi.md#updateResourceByIdOrUri) | **PATCH** /resources/{id_or_uri} | 


<a name="addResource"></a>
# **addResource**
> Resource addResource(resource)



Creates a new resource

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ResourceApi;


ResourceApi apiInstance = new ResourceApi();
ResourceInput resource = new ResourceInput(); // ResourceInput | Resource to add
try {
    Resource result = apiInstance.addResource(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#addResource");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteResourceByIdOrUri"></a>
# **deleteResourceByIdOrUri**
> deleteResourceByIdOrUri(idOrUri)



Deletes single resource

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ResourceApi;


ResourceApi apiInstance = new ResourceApi();
String idOrUri = "idOrUri_example"; // String | ID or URI of resource to fetch
try {
    apiInstance.deleteResourceByIdOrUri(idOrUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#deleteResourceByIdOrUri");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findResourceByIdOrUri"></a>
# **findResourceByIdOrUri**
> Resource findResourceByIdOrUri(idOrUri)



Returns a single resource

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ResourceApi;


ResourceApi apiInstance = new ResourceApi();
String idOrUri = "idOrUri_example"; // String | ID or URI of resource to fetch
try {
    Resource result = apiInstance.findResourceByIdOrUri(idOrUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#findResourceByIdOrUri");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findResources"></a>
# **findResources**
> List&lt;ResourceEach&gt; findResources(clusterId, consumable, notifiable)



Returns all resources from the system

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ResourceApi;


ResourceApi apiInstance = new ResourceApi();
Integer clusterId = 56; // Integer | ID of Cluster
Boolean consumable = true; // Boolean | Consuamble
Boolean notifiable = true; // Boolean | Notifiable
try {
    List<ResourceEach> result = apiInstance.findResources(clusterId, consumable, notifiable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#findResources");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateResourceByIdOrUri"></a>
# **updateResourceByIdOrUri**
> Resource updateResourceByIdOrUri(idOrUri, resource)



Updates a single resource

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ResourceApi;


ResourceApi apiInstance = new ResourceApi();
String idOrUri = "idOrUri_example"; // String | ID or URI of resource to fetch
ResourceInput resource = new ResourceInput(); // ResourceInput | Resource parameters to update
try {
    Resource result = apiInstance.updateResourceByIdOrUri(idOrUri, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#updateResourceByIdOrUri");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

