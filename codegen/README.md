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
    <groupId>io.triglav</groupId>
    <artifactId>triglav-client-java</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.triglav:triglav-client-java:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/triglav-client-java-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.triglav.client.*;
import io.triglav.client.auth.*;
import io.triglav.client.model.*;
import io.triglav.client.api.AuthApi;

import java.io.File;
import java.util.*;

public class AuthApiExample {

    public static void main(String[] args) {
        
        AuthApi apiInstance = new AuthApi();
        AuthInput auth = new AuthInput(); // AuthInput | 
        try {
            AccessToken result = apiInstance.createToken(auth);
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
*ClusterApi* | [**addCluster**](docs/ClusterApi.md#addCluster) | **POST** /clusters | 
*ClusterApi* | [**deleteClusterByIdOrName**](docs/ClusterApi.md#deleteClusterByIdOrName) | **DELETE** /clusters/{id_or_name} | 
*ClusterApi* | [**findClusterByIdOrName**](docs/ClusterApi.md#findClusterByIdOrName) | **GET** /clusters/{id_or_name} | 
*ClusterApi* | [**findClusters**](docs/ClusterApi.md#findClusters) | **GET** /clusters | 
*ClusterApi* | [**updateClusterByIdOrName**](docs/ClusterApi.md#updateClusterByIdOrName) | **PATCH** /clusters/{id_or_name} | 
*JobApi* | [**createOrUpdateJob**](docs/JobApi.md#createOrUpdateJob) | **PATCH** /jobs | 
*JobApi* | [**deleteJobByIdOrUri**](docs/JobApi.md#deleteJobByIdOrUri) | **DELETE** /jobs/{id_or_uri} | 
*JobApi* | [**findJobByIdOrUri**](docs/JobApi.md#findJobByIdOrUri) | **GET** /jobs/{id_or_uri} | 
*JobApi* | [**findJobs**](docs/JobApi.md#findJobs) | **GET** /jobs | 
*MessageApi* | [**fetchMessages**](docs/MessageApi.md#fetchMessages) | **GET** /messages | 
*MessageApi* | [**sendMessage**](docs/MessageApi.md#sendMessage) | **POST** /messages | 
*ResourceApi* | [**addResource**](docs/ResourceApi.md#addResource) | **POST** /resources | 
*ResourceApi* | [**deleteResourceByIdOrUri**](docs/ResourceApi.md#deleteResourceByIdOrUri) | **DELETE** /resources/{id_or_uri} | 
*ResourceApi* | [**findResourceByIdOrUri**](docs/ResourceApi.md#findResourceByIdOrUri) | **GET** /resources/{id_or_uri} | 
*ResourceApi* | [**findResources**](docs/ResourceApi.md#findResources) | **GET** /resources | 
*ResourceApi* | [**updateResourceByIdOrUri**](docs/ResourceApi.md#updateResourceByIdOrUri) | **PATCH** /resources/{id_or_uri} | 
*UserApi* | [**addUser**](docs/UserApi.md#addUser) | **POST** /users | 
*UserApi* | [**deleteUserById**](docs/UserApi.md#deleteUserById) | **DELETE** /users/{id} | 
*UserApi* | [**findUserById**](docs/UserApi.md#findUserById) | **GET** /users/{id} | 
*UserApi* | [**findUsers**](docs/UserApi.md#findUsers) | **GET** /users | 
*UserApi* | [**updateUserById**](docs/UserApi.md#updateUserById) | **PATCH** /users/{id} | 


## Documentation for Models

 - [AccessToken](docs/AccessToken.md)
 - [AuthInput](docs/AuthInput.md)
 - [Cluster](docs/Cluster.md)
 - [ClusterEach](docs/ClusterEach.md)
 - [ClusterInput](docs/ClusterInput.md)
 - [ErrorModel](docs/ErrorModel.md)
 - [Job](docs/Job.md)
 - [JobEach](docs/JobEach.md)
 - [JobInput](docs/JobInput.md)
 - [Message](docs/Message.md)
 - [MessageEach](docs/MessageEach.md)
 - [MessageInput](docs/MessageInput.md)
 - [Resource](docs/Resource.md)
 - [ResourceEach](docs/ResourceEach.md)
 - [ResourceInput](docs/ResourceInput.md)
 - [User](docs/User.md)
 - [UserEach](docs/UserEach.md)
 - [UserInput](docs/UserInput.md)


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

