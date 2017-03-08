# triglav-client-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.github.triglav_dataflow</groupId>
    <artifactId>triglav-client-java</artifactId>
    <version>1.0.0.pre1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.github.triglav_dataflow:triglav-client-java:1.0.0.pre1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/triglav-client-java-1.0.0.pre1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.github.triglav_dataflow.client.*;
import io.github.triglav_dataflow.client.auth.*;
import io.github.triglav_dataflow.client.model.*;
import io.github.triglav_dataflow.client.api.AuthApi;

import java.io.File;
import java.util.*;

public class AuthApiExample {

    public static void main(String[] args) {
        
        AuthApi apiInstance = new AuthApi();
        Credential credential = new Credential(); // Credential | 
        try {
            TokenResponse result = apiInstance.createToken(credential);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#createToken");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**createToken**](docs/AuthApi.md#createToken) | **POST** /auth/token | 
*AuthApi* | [**deleteToken**](docs/AuthApi.md#deleteToken) | **DELETE** /auth/token | 
*AuthApi* | [**me**](docs/AuthApi.md#me) | **GET** /auth/me | 
*JobMessagesApi* | [**fetchJobMessages**](docs/JobMessagesApi.md#fetchJobMessages) | **GET** /job_messages | 
*JobMessagesApi* | [**getLastJobMessageId**](docs/JobMessagesApi.md#getLastJobMessageId) | **GET** /job_messages/last_id | 
*JobsApi* | [**createOrUpdateJob**](docs/JobsApi.md#createOrUpdateJob) | **PATCH** /jobs | 
*JobsApi* | [**deleteJob**](docs/JobsApi.md#deleteJob) | **DELETE** /jobs/{id_or_uri} | 
*JobsApi* | [**getJob**](docs/JobsApi.md#getJob) | **GET** /jobs/{id_or_uri} | 
*JobsApi* | [**listJobs**](docs/JobsApi.md#listJobs) | **GET** /jobs | 
*MessagesApi* | [**fetchMessages**](docs/MessagesApi.md#fetchMessages) | **GET** /messages | 
*MessagesApi* | [**getLastMessageId**](docs/MessagesApi.md#getLastMessageId) | **GET** /messages/last_id | 
*MessagesApi* | [**sendMessages**](docs/MessagesApi.md#sendMessages) | **POST** /messages | 
*ResourcesApi* | [**createResource**](docs/ResourcesApi.md#createResource) | **POST** /resources | 
*ResourcesApi* | [**deleteResource**](docs/ResourcesApi.md#deleteResource) | **DELETE** /resources/{id_or_uri} | 
*ResourcesApi* | [**getResource**](docs/ResourcesApi.md#getResource) | **GET** /resources/{id_or_uri} | 
*ResourcesApi* | [**listAggregatedResources**](docs/ResourcesApi.md#listAggregatedResources) | **GET** /aggregated_resources | 
*ResourcesApi* | [**listResources**](docs/ResourcesApi.md#listResources) | **GET** /resources | 
*ResourcesApi* | [**updateResource**](docs/ResourcesApi.md#updateResource) | **PATCH** /resources/{id_or_uri} | 
*UsersApi* | [**createUser**](docs/UsersApi.md#createUser) | **POST** /users | 
*UsersApi* | [**deleteUser**](docs/UsersApi.md#deleteUser) | **DELETE** /users/{id} | 
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /users/{id} | 
*UsersApi* | [**listUsers**](docs/UsersApi.md#listUsers) | **GET** /users | 
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateUser) | **PATCH** /users/{id} | 


## Documentation for Models

 - [AggregatedResourceEachResponse](docs/AggregatedResourceEachResponse.md)
 - [BulkinsertResponse](docs/BulkinsertResponse.md)
 - [Credential](docs/Credential.md)
 - [ErrorModel](docs/ErrorModel.md)
 - [JobEachResponse](docs/JobEachResponse.md)
 - [JobMessageEachResponse](docs/JobMessageEachResponse.md)
 - [JobRequest](docs/JobRequest.md)
 - [JobResponse](docs/JobResponse.md)
 - [LastJobMessageIdResponse](docs/LastJobMessageIdResponse.md)
 - [LastMessageIdResponse](docs/LastMessageIdResponse.md)
 - [MessageEachResponse](docs/MessageEachResponse.md)
 - [MessageFetchRequest](docs/MessageFetchRequest.md)
 - [MessageRequest](docs/MessageRequest.md)
 - [MessageResponse](docs/MessageResponse.md)
 - [ResourceEachResponse](docs/ResourceEachResponse.md)
 - [ResourceRequest](docs/ResourceRequest.md)
 - [ResourceResponse](docs/ResourceResponse.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [UserEachResponse](docs/UserEachResponse.md)
 - [UserRequest](docs/UserRequest.md)
 - [UserResponse](docs/UserResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

triglav_admin_my@dena.jp

