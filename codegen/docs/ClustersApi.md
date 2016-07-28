# ClustersApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCluster**](ClustersApi.md#createCluster) | **POST** /clusters | 
[**deleteCluster**](ClustersApi.md#deleteCluster) | **DELETE** /clusters/{id_or_name} | 
[**getCluster**](ClustersApi.md#getCluster) | **GET** /clusters/{id_or_name} | 
[**listClusters**](ClustersApi.md#listClusters) | **GET** /clusters | 
[**updateCluster**](ClustersApi.md#updateCluster) | **PATCH** /clusters/{id_or_name} | 


<a name="createCluster"></a>
# **createCluster**
> Cluster createCluster(cluster)



Creates a new cluster

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ClustersApi apiInstance = new ClustersApi();
ClusterInput cluster = new ClusterInput(); // ClusterInput | Cluster to add
try {
    Cluster result = apiInstance.createCluster(cluster);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#createCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cluster** | [**ClusterInput**](ClusterInput.md)| Cluster to add |

### Return type

[**Cluster**](Cluster.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCluster"></a>
# **deleteCluster**
> deleteCluster(idOrName)



Deletes single cluster

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ClustersApi apiInstance = new ClustersApi();
String idOrName = "idOrName_example"; // String | ID or Name of cluster to fetch
try {
    apiInstance.deleteCluster(idOrName);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#deleteCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrName** | **String**| ID or Name of cluster to fetch |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCluster"></a>
# **getCluster**
> Cluster getCluster(idOrName)



Returns a single cluster

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ClustersApi apiInstance = new ClustersApi();
String idOrName = "idOrName_example"; // String | ID or Name of cluster to fetch
try {
    Cluster result = apiInstance.getCluster(idOrName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#getCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrName** | **String**| ID or Name of cluster to fetch |

### Return type

[**Cluster**](Cluster.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listClusters"></a>
# **listClusters**
> List&lt;ClusterEach&gt; listClusters()



Returns all clusters from the system

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ClustersApi apiInstance = new ClustersApi();
try {
    List<ClusterEach> result = apiInstance.listClusters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#listClusters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ClusterEach&gt;**](ClusterEach.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCluster"></a>
# **updateCluster**
> Cluster updateCluster(idOrName, cluster)



Updates a single cluster

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ClustersApi apiInstance = new ClustersApi();
String idOrName = "idOrName_example"; // String | ID or Name of cluster to fetch
ClusterInput cluster = new ClusterInput(); // ClusterInput | Cluster parameters to update
try {
    Cluster result = apiInstance.updateCluster(idOrName, cluster);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#updateCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrName** | **String**| ID or Name of cluster to fetch |
 **cluster** | [**ClusterInput**](ClusterInput.md)| Cluster parameters to update |

### Return type

[**Cluster**](Cluster.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

