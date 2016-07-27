# ClustersApi

All URIs are relative to *http://localhost/apidocs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ClustersCreate**](ClustersApi.md#apiV1ClustersCreate) | **POST** /api/v1/clusters.json | Creates a new Cluster
[**apiV1ClustersDestroy**](ClustersApi.md#apiV1ClustersDestroy) | **DELETE** /api/v1/clusters/{id}.json | Deletes an existing Cluster item
[**apiV1ClustersIndex**](ClustersApi.md#apiV1ClustersIndex) | **GET** /api/v1/clusters.json | Fetches all Cluster items
[**apiV1ClustersShow**](ClustersApi.md#apiV1ClustersShow) | **GET** /api/v1/clusters/{id}.json | Fetches a single Cluster item
[**apiV1ClustersUpdate**](ClustersApi.md#apiV1ClustersUpdate) | **PATCH** /api/v1/clusters/{id}.json | Updates an existing Cluster


<a name="apiV1ClustersCreate"></a>
# **apiV1ClustersCreate**
> apiV1ClustersCreate(name, description)

Creates a new Cluster

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ClustersApi;


ClustersApi apiInstance = new ClustersApi();
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
try {
    apiInstance.apiV1ClustersCreate(name, description);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#apiV1ClustersCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name |
 **description** | **String**| Description | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV1ClustersDestroy"></a>
# **apiV1ClustersDestroy**
> apiV1ClustersDestroy(id)

Deletes an existing Cluster item

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ClustersApi;


ClustersApi apiInstance = new ClustersApi();
Integer id = 56; // Integer | Cluster Id
try {
    apiInstance.apiV1ClustersDestroy(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#apiV1ClustersDestroy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Cluster Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV1ClustersIndex"></a>
# **apiV1ClustersIndex**
> apiV1ClustersIndex()

Fetches all Cluster items

This lists all clusters

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ClustersApi;


ClustersApi apiInstance = new ClustersApi();
try {
    apiInstance.apiV1ClustersIndex();
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#apiV1ClustersIndex");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV1ClustersShow"></a>
# **apiV1ClustersShow**
> User apiV1ClustersShow(id)

Fetches a single Cluster item

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ClustersApi;


ClustersApi apiInstance = new ClustersApi();
Integer id = 56; // Integer | Cluster Id
try {
    User result = apiInstance.apiV1ClustersShow(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#apiV1ClustersShow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Cluster Id |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV1ClustersUpdate"></a>
# **apiV1ClustersUpdate**
> apiV1ClustersUpdate(id, name, description)

Updates an existing Cluster

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ClustersApi;


ClustersApi apiInstance = new ClustersApi();
Integer id = 56; // Integer | Cluster Id
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
try {
    apiInstance.apiV1ClustersUpdate(id, name, description);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#apiV1ClustersUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Cluster Id |
 **name** | **String**| Name | [optional]
 **description** | **String**| Description | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

