# AuthApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToken**](AuthApi.md#createToken) | **POST** /auth/token | 
[**deleteToken**](AuthApi.md#deleteToken) | **DELETE** /auth/token | 
[**me**](AuthApi.md#me) | **GET** /auth/me | 


<a name="createToken"></a>
# **createToken**
> AccessToken createToken(auth)



Creates a new token

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
AuthInput auth = new AuthInput(); // AuthInput | 
try {
    AccessToken result = apiInstance.createToken(auth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auth** | [**AuthInput**](AuthInput.md)|  |

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteToken"></a>
# **deleteToken**
> deleteToken(authorization)



Deletes (Expires) a token

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String authorization = "authorization_example"; // String | token #{access_token}
try {
    apiInstance.deleteToken(authorization);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| token #{access_token} |

### Return type

null (empty response body)

### Authorization

No authorization required

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
//import io.triglav.client.ApiException;
//import io.triglav.client.api.AuthApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

