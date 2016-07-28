# UserApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUser**](UserApi.md#addUser) | **POST** /users | 
[**deleteUserById**](UserApi.md#deleteUserById) | **DELETE** /users/{id} | 
[**findUserById**](UserApi.md#findUserById) | **GET** /users/{id} | 
[**findUsers**](UserApi.md#findUsers) | **GET** /users | 
[**updateUserById**](UserApi.md#updateUserById) | **PATCH** /users/{id} | 


<a name="addUser"></a>
# **addUser**
> User addUser(user)



Creates a new user in the store

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.UserApi;


UserApi apiInstance = new UserApi();
UserInput user = new UserInput(); // UserInput | User to add to the store
try {
    User result = apiInstance.addUser(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**UserInput**](UserInput.md)| User to add to the store |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserById"></a>
# **deleteUserById**
> deleteUserById(id)



Deletes single user

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long id = 789L; // Long | ID of user to fetch
try {
    apiInstance.deleteUserById(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserById");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findUserById"></a>
# **findUserById**
> User findUserById(id)



Returns a single user

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long id = 789L; // Long | ID of user to fetch
try {
    User result = apiInstance.findUserById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#findUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of user to fetch |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findUsers"></a>
# **findUsers**
> List&lt;UserEach&gt; findUsers()



Returns all users from the system that the user has access to

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.UserApi;


UserApi apiInstance = new UserApi();
try {
    List<UserEach> result = apiInstance.findUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#findUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserEach&gt;**](UserEach.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserById"></a>
# **updateUserById**
> User updateUserById(id, user)



Updates a single user

### Example
```java
// Import classes:
//import io.triglav.client.ApiException;
//import io.triglav.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long id = 789L; // Long | ID of user to fetch
UserInput user = new UserInput(); // UserInput | User parameters to update
try {
    User result = apiInstance.updateUserById(id, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of user to fetch |
 **user** | [**UserInput**](UserInput.md)| User parameters to update |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

