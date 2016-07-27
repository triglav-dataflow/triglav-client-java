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
import io.triglav.client.api.ClustersApi;

import java.io.File;
import java.util.*;

public class ClustersApiExample {

    public static void main(String[] args) {
        
        ClustersApi apiInstance = new ClustersApi();
        String name = "name_example"; // String | Name
        String description = "description_example"; // String | Description
        try {
            apiInstance.apiV1ClustersCreate(name, description);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClustersApi#apiV1ClustersCreate");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/apidocs*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClustersApi* | [**apiV1ClustersCreate**](docs/ClustersApi.md#apiV1ClustersCreate) | **POST** /api/v1/clusters.json | Creates a new Cluster
*ClustersApi* | [**apiV1ClustersDestroy**](docs/ClustersApi.md#apiV1ClustersDestroy) | **DELETE** /api/v1/clusters/{id}.json | Deletes an existing Cluster item
*ClustersApi* | [**apiV1ClustersIndex**](docs/ClustersApi.md#apiV1ClustersIndex) | **GET** /api/v1/clusters.json | Fetches all Cluster items
*ClustersApi* | [**apiV1ClustersShow**](docs/ClustersApi.md#apiV1ClustersShow) | **GET** /api/v1/clusters/{id}.json | Fetches a single Cluster item
*ClustersApi* | [**apiV1ClustersUpdate**](docs/ClustersApi.md#apiV1ClustersUpdate) | **PATCH** /api/v1/clusters/{id}.json | Updates an existing Cluster
*JobsApi* | [**apiV1JobsDestroy**](docs/JobsApi.md#apiV1JobsDestroy) | **DELETE** /api/v1/jobs/{id_or_uri}.json | Deletes an existing Job item
*JobsApi* | [**apiV1JobsShow**](docs/JobsApi.md#apiV1JobsShow) | **GET** /api/v1/jobs/{id_or_uri}.json | Fetches a single Job
*JobsApi* | [**apiV1JobsUpdate**](docs/JobsApi.md#apiV1JobsUpdate) | **PUT** /api/v1/jobs/{id_or_uri}.json | Creates or Updates a Job
*MessagesApi* | [**apiV1MessagesCreate**](docs/MessagesApi.md#apiV1MessagesCreate) | **POST** /api/v1/messages.json | Enqueues a new Message
*MessagesApi* | [**apiV1MessagesIndex**](docs/MessagesApi.md#apiV1MessagesIndex) | **GET** /api/v1/messages.json | Fetches messages
*ResourcesApi* | [**apiV1ResourcesCreate**](docs/ResourcesApi.md#apiV1ResourcesCreate) | **POST** /api/v1/resources.json | Creates a Resource
*ResourcesApi* | [**apiV1ResourcesDestroy**](docs/ResourcesApi.md#apiV1ResourcesDestroy) | **DELETE** /api/v1/resources/{id_or_uri}.json | Deletes an existing Resource
*ResourcesApi* | [**apiV1ResourcesIndex**](docs/ResourcesApi.md#apiV1ResourcesIndex) | **GET** /api/v1/resources.json | Fetches resources
*ResourcesApi* | [**apiV1ResourcesShow**](docs/ResourcesApi.md#apiV1ResourcesShow) | **GET** /api/v1/resources/{id_or_uri}.json | Fetches a single Resource
*ResourcesApi* | [**apiV1ResourcesUpdate**](docs/ResourcesApi.md#apiV1ResourcesUpdate) | **PUT** /api/v1/resources/{id_or_uri}.json | Updates a Resource
*UsersApi* | [**apiV1UsersCreate**](docs/UsersApi.md#apiV1UsersCreate) | **POST** /api/v1/users.json | Creates a new User
*UsersApi* | [**apiV1UsersDestroy**](docs/UsersApi.md#apiV1UsersDestroy) | **DELETE** /api/v1/users/{id}.json | Deletes an existing User item
*UsersApi* | [**apiV1UsersIndex**](docs/UsersApi.md#apiV1UsersIndex) | **GET** /api/v1/users.json | Fetches all User items
*UsersApi* | [**apiV1UsersShow**](docs/UsersApi.md#apiV1UsersShow) | **GET** /api/v1/users/{id}.json | Fetches a single User item
*UsersApi* | [**apiV1UsersUpdate**](docs/UsersApi.md#apiV1UsersUpdate) | **PATCH** /api/v1/users/{id}.json | Updates an existing User


## Documentation for Models



## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



