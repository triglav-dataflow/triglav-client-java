# UsersApi

All URIs are relative to *http://localhost/apidocs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1UsersCreate**](UsersApi.md#apiV1UsersCreate) | **POST** /api/v1/users.json | Creates a new User
[**apiV1UsersDestroy**](UsersApi.md#apiV1UsersDestroy) | **DELETE** /api/v1/users/{id}.json | Deletes an existing User item
[**apiV1UsersIndex**](UsersApi.md#apiV1UsersIndex) | **GET** /api/v1/users.json | Fetches all User items
[**apiV1UsersShow**](UsersApi.md#apiV1UsersShow) | **GET** /api/v1/users/{id}.json | Fetches a single User item
[**apiV1UsersUpdate**](UsersApi.md#apiV1UsersUpdate) | **PATCH** /api/v1/users/{id}.json | Updates an existing User


<a name="apiV1UsersCreate"></a>
# **apiV1UsersCreate**
> apiV1UsersCreate(name, authenticator, groups, password, description, email)

Creates a new User

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String name = "name_example"; // String | Name
String authenticator = "authenticator_example"; // String | local or ldap.dena.local
List<Object> groups = null; // List<Object> | Groups
String password = "password_example"; // String | Password
String description = "description_example"; // String | Description
String email = "email_example"; // String | Email
try {
    apiInstance.apiV1UsersCreate(name, authenticator, groups, password, description, email);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#apiV1UsersCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name |
 **authenticator** | **String**| local or ldap.dena.local |
 **groups** | [**List&lt;Object&gt;**](Object.md)| Groups |
 **password** | **String**| Password |
 **description** | **String**| Description | [optional]
 **email** | **String**| Email | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV1UsersDestroy"></a>
# **apiV1UsersDestroy**
> apiV1UsersDestroy(id)

Deletes an existing User item

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer | User Id
try {
    apiInstance.apiV1UsersDestroy(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#apiV1UsersDestroy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| User Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV1UsersIndex"></a>
# **apiV1UsersIndex**
> apiV1UsersIndex()

Fetches all User items

This lists all the active users

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
try {
    apiInstance.apiV1UsersIndex();
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#apiV1UsersIndex");
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

<a name="apiV1UsersShow"></a>
# **apiV1UsersShow**
> User apiV1UsersShow(id)

Fetches a single User item

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer | User Id
try {
    User result = apiInstance.apiV1UsersShow(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#apiV1UsersShow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| User Id |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV1UsersUpdate"></a>
# **apiV1UsersUpdate**
> apiV1UsersUpdate(id, name, description, authenticator, email, groups, password)

Updates an existing User

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer | User Id
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
String authenticator = "authenticator_example"; // String | Local or ldap
String email = "email_example"; // String | Email
List<Object> groups = null; // List<Object> | Groups
String password = "password_example"; // String | Password for local authentication
try {
    apiInstance.apiV1UsersUpdate(id, name, description, authenticator, email, groups, password);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#apiV1UsersUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| User Id |
 **name** | **String**| Name | [optional]
 **description** | **String**| Description | [optional]
 **authenticator** | **String**| Local or ldap | [optional]
 **email** | **String**| Email | [optional]
 **groups** | [**List&lt;Object&gt;**](Object.md)| Groups | [optional]
 **password** | **String**| Password for local authentication | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

