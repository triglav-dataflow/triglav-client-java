# UsersApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UsersApi.md#createUser) | **POST** /users | 
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /users/{id} | 
[**getUser**](UsersApi.md#getUser) | **GET** /users/{id} | 
[**listUsers**](UsersApi.md#listUsers) | **GET** /users | 
[**updateUser**](UsersApi.md#updateUser) | **PATCH** /users/{id} | 


<a name="createUser"></a>
# **createUser**
> UserResponse createUser(user)



Creates a new user in the store

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
UserRequest user = new UserRequest(); // UserRequest | User to add to the store
try {
    UserResponse result = apiInstance.createUser(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**UserRequest**](UserRequest.md)| User to add to the store |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(id)



Deletes single user

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Long id = 789L; // Long | ID of user to fetch
try {
    apiInstance.deleteUser(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of user to fetch |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UserResponse getUser(id)



Returns a single user

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Long id = 789L; // Long | ID of user to fetch
try {
    UserResponse result = apiInstance.getUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of user to fetch |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> List&lt;UserEachResponse&gt; listUsers()



Returns all users from the system that the user has access to

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
try {
    List<UserEachResponse> result = apiInstance.listUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#listUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserEachResponse&gt;**](UserEachResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> UserResponse updateUser(id, user)



Updates a single user

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Long id = 789L; // Long | ID of user to fetch
UserRequest user = new UserRequest(); // UserRequest | User parameters to update
try {
    UserResponse result = apiInstance.updateUser(id, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of user to fetch |
 **user** | [**UserRequest**](UserRequest.md)| User parameters to update |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

