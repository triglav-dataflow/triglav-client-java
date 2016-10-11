# AuthApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToken**](AuthApi.md#createToken) | **POST** /auth/token | 
[**deleteToken**](AuthApi.md#deleteToken) | **DELETE** /auth/token | 
[**me**](AuthApi.md#me) | **GET** /auth/me | 


<a name="createToken"></a>
# **createToken**
> TokenResponse createToken(credential)



Creates a new token

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
Credential credential = new Credential(); // Credential | 
try {
    TokenResponse result = apiInstance.createToken(credential);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credential** | [**Credential**](Credential.md)|  |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteToken"></a>
# **deleteToken**
> deleteToken()



Deletes (Expires) a token of header

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AuthApi apiInstance = new AuthApi();
try {
    apiInstance.deleteToken();
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="me"></a>
# **me**
> User me()



Returns a user property of the access_token

### Example
```java
// Import classes:
//import io.triglav.client.ApiClient;
//import io.triglav.client.ApiException;
//import io.triglav.client.Configuration;
//import io.triglav.client.auth.*;
//import io.triglav.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AuthApi apiInstance = new AuthApi();
try {
    User result = apiInstance.me();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#me");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

