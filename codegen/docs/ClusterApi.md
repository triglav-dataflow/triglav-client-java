# ClusterApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCluster**](ClusterApi.md#addCluster) | **POST** /clusters | 
[**deleteClusterByIdOrName**](ClusterApi.md#deleteClusterByIdOrName) | **DELETE** /clusters/{id_or_name} | 
[**findClusterByIdOrName**](ClusterApi.md#findClusterByIdOrName) | **GET** /clusters/{id_or_name} | 
[**findClusters**](ClusterApi.md#findClusters) | **GET** /clusters | 
[**updateClusterByIdOrName**](ClusterApi.md#updateClusterByIdOrName) | **PATCH** /clusters/{id_or_name} | 


<a name="addCluster"></a>
# **addCluster**
> Cluster addCluster(cluster)



Creates a new cluster

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
ClusterInput cluster = new ClusterInput(); // ClusterInput | Cluster to add
try {
    Cluster result = apiInstance.addCluster(cluster);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#addCluster");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClusterByIdOrName"></a>
# **deleteClusterByIdOrName**
> deleteClusterByIdOrName(idOrName)



Deletes single cluster

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String idOrName = "idOrName_example"; // String | ID or Name of cluster to fetch
try {
    apiInstance.deleteClusterByIdOrName(idOrName);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#deleteClusterByIdOrName");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findClusterByIdOrName"></a>
# **findClusterByIdOrName**
> Cluster findClusterByIdOrName(idOrName)



Returns a single cluster

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String idOrName = "idOrName_example"; // String | ID or Name of cluster to fetch
try {
    Cluster result = apiInstance.findClusterByIdOrName(idOrName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#findClusterByIdOrName");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findClusters"></a>
# **findClusters**
> List&lt;ClusterEach&gt; findClusters()



Returns all clusters from the system

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
try {
    List<ClusterEach> result = apiInstance.findClusters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#findClusters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ClusterEach&gt;**](ClusterEach.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClusterByIdOrName"></a>
# **updateClusterByIdOrName**
> Cluster updateClusterByIdOrName(idOrName, cluster)



Updates a single cluster

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String idOrName = "idOrName_example"; // String | ID or Name of cluster to fetch
ClusterInput cluster = new ClusterInput(); // ClusterInput | Cluster parameters to update
try {
    Cluster result = apiInstance.updateClusterByIdOrName(idOrName, cluster);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateClusterByIdOrName");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

