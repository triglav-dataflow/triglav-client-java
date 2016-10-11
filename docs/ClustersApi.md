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
> ClusterResponse createCluster(cluster)



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
ClusterRequest cluster = new ClusterRequest(); // ClusterRequest | Cluster to add
try {
    ClusterResponse result = apiInstance.createCluster(cluster);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#createCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cluster** | [**ClusterRequest**](ClusterRequest.md)| Cluster to add |

### Return type

[**ClusterResponse**](ClusterResponse.md)

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
> ClusterResponse getCluster(idOrName)



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
    ClusterResponse result = apiInstance.getCluster(idOrName);
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

[**ClusterResponse**](ClusterResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listClusters"></a>
# **listClusters**
> List&lt;ClusterEachResponse&gt; listClusters()



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
    List<ClusterEachResponse> result = apiInstance.listClusters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#listClusters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ClusterEachResponse&gt;**](ClusterEachResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCluster"></a>
# **updateCluster**
> ClusterResponse updateCluster(idOrName, cluster)



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
ClusterRequest cluster = new ClusterRequest(); // ClusterRequest | Cluster parameters to update
try {
    ClusterResponse result = apiInstance.updateCluster(idOrName, cluster);
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
 **cluster** | [**ClusterRequest**](ClusterRequest.md)| Cluster parameters to update |

### Return type

[**ClusterResponse**](ClusterResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

