/**
 * Triglav API
 * Triglav API Reference
 *
 * OpenAPI spec version: 1.0.0
 * Contact: triglav_admin_my@dena.jp
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.triglav.client.api;

import io.triglav.client.ApiCallback;
import io.triglav.client.ApiClient;
import io.triglav.client.ApiException;
import io.triglav.client.ApiResponse;
import io.triglav.client.Configuration;
import io.triglav.client.Pair;
import io.triglav.client.ProgressRequestBody;
import io.triglav.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.triglav.client.ResourceResponse;
import io.triglav.client.ErrorModel;
import io.triglav.client.ResourceRequest;
import io.triglav.client.MonResourceEachResponse;
import io.triglav.client.ResourceEachResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourcesApi {
    private ApiClient apiClient;

    public ResourcesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ResourcesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createResource */
    private com.squareup.okhttp.Call createResourceCall(ResourceRequest resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = resource;
        
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new ApiException("Missing the required parameter 'resource' when calling createResource(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/resources".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Creates a new resource
     * @param resource Resource to add (required)
     * @return ResourceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourceResponse createResource(ResourceRequest resource) throws ApiException {
        ApiResponse<ResourceResponse> resp = createResourceWithHttpInfo(resource);
        return resp.getData();
    }

    /**
     * 
     * Creates a new resource
     * @param resource Resource to add (required)
     * @return ApiResponse&lt;ResourceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourceResponse> createResourceWithHttpInfo(ResourceRequest resource) throws ApiException {
        com.squareup.okhttp.Call call = createResourceCall(resource, null, null);
        Type localVarReturnType = new TypeToken<ResourceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates a new resource
     * @param resource Resource to add (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createResourceAsync(ResourceRequest resource, final ApiCallback<ResourceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createResourceCall(resource, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteResource */
    private com.squareup.okhttp.Call deleteResourceCall(String idOrUri, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idOrUri' is set
        if (idOrUri == null) {
            throw new ApiException("Missing the required parameter 'idOrUri' when calling deleteResource(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/resources/{id_or_uri}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id_or_uri" + "\\}", apiClient.escapeString(idOrUri.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Deletes single resource
     * @param idOrUri ID or URI of resource to fetch (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteResource(String idOrUri) throws ApiException {
        deleteResourceWithHttpInfo(idOrUri);
    }

    /**
     * 
     * Deletes single resource
     * @param idOrUri ID or URI of resource to fetch (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteResourceWithHttpInfo(String idOrUri) throws ApiException {
        com.squareup.okhttp.Call call = deleteResourceCall(idOrUri, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes single resource
     * @param idOrUri ID or URI of resource to fetch (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteResourceAsync(String idOrUri, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteResourceCall(idOrUri, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getResource */
    private com.squareup.okhttp.Call getResourceCall(String idOrUri, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idOrUri' is set
        if (idOrUri == null) {
            throw new ApiException("Missing the required parameter 'idOrUri' when calling getResource(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/resources/{id_or_uri}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id_or_uri" + "\\}", apiClient.escapeString(idOrUri.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Returns a single resource
     * @param idOrUri ID or URI of resource to fetch (required)
     * @return ResourceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourceResponse getResource(String idOrUri) throws ApiException {
        ApiResponse<ResourceResponse> resp = getResourceWithHttpInfo(idOrUri);
        return resp.getData();
    }

    /**
     * 
     * Returns a single resource
     * @param idOrUri ID or URI of resource to fetch (required)
     * @return ApiResponse&lt;ResourceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourceResponse> getResourceWithHttpInfo(String idOrUri) throws ApiException {
        com.squareup.okhttp.Call call = getResourceCall(idOrUri, null, null);
        Type localVarReturnType = new TypeToken<ResourceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a single resource
     * @param idOrUri ID or URI of resource to fetch (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getResourceAsync(String idOrUri, final ApiCallback<ResourceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getResourceCall(idOrUri, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listMonResources */
    private com.squareup.okhttp.Call listMonResourcesCall(String uriPrefix, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uriPrefix' is set
        if (uriPrefix == null) {
            throw new ApiException("Missing the required parameter 'uriPrefix' when calling listMonResources(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/mon_resources".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (uriPrefix != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "uri_prefix", uriPrefix));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Returns resources required to be monitored
     * @param uriPrefix Prefix of Resource URI (required)
     * @return List&lt;MonResourceEachResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MonResourceEachResponse> listMonResources(String uriPrefix) throws ApiException {
        ApiResponse<List<MonResourceEachResponse>> resp = listMonResourcesWithHttpInfo(uriPrefix);
        return resp.getData();
    }

    /**
     * 
     * Returns resources required to be monitored
     * @param uriPrefix Prefix of Resource URI (required)
     * @return ApiResponse&lt;List&lt;MonResourceEachResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MonResourceEachResponse>> listMonResourcesWithHttpInfo(String uriPrefix) throws ApiException {
        com.squareup.okhttp.Call call = listMonResourcesCall(uriPrefix, null, null);
        Type localVarReturnType = new TypeToken<List<MonResourceEachResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns resources required to be monitored
     * @param uriPrefix Prefix of Resource URI (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMonResourcesAsync(String uriPrefix, final ApiCallback<List<MonResourceEachResponse>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listMonResourcesCall(uriPrefix, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MonResourceEachResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listResources */
    private com.squareup.okhttp.Call listResourcesCall(String uriPrefix, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/resources".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (uriPrefix != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "uri_prefix", uriPrefix));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Returns all resources
     * @param uriPrefix Prefix of Resource URI (optional)
     * @return List&lt;ResourceEachResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ResourceEachResponse> listResources(String uriPrefix) throws ApiException {
        ApiResponse<List<ResourceEachResponse>> resp = listResourcesWithHttpInfo(uriPrefix);
        return resp.getData();
    }

    /**
     * 
     * Returns all resources
     * @param uriPrefix Prefix of Resource URI (optional)
     * @return ApiResponse&lt;List&lt;ResourceEachResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ResourceEachResponse>> listResourcesWithHttpInfo(String uriPrefix) throws ApiException {
        com.squareup.okhttp.Call call = listResourcesCall(uriPrefix, null, null);
        Type localVarReturnType = new TypeToken<List<ResourceEachResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns all resources
     * @param uriPrefix Prefix of Resource URI (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listResourcesAsync(String uriPrefix, final ApiCallback<List<ResourceEachResponse>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listResourcesCall(uriPrefix, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ResourceEachResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateResource */
    private com.squareup.okhttp.Call updateResourceCall(String idOrUri, ResourceRequest resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = resource;
        
        // verify the required parameter 'idOrUri' is set
        if (idOrUri == null) {
            throw new ApiException("Missing the required parameter 'idOrUri' when calling updateResource(Async)");
        }
        
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new ApiException("Missing the required parameter 'resource' when calling updateResource(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/resources/{id_or_uri}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id_or_uri" + "\\}", apiClient.escapeString(idOrUri.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Updates a single resource
     * @param idOrUri ID or URI of resource to fetch (required)
     * @param resource Resource parameters to update (required)
     * @return ResourceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourceResponse updateResource(String idOrUri, ResourceRequest resource) throws ApiException {
        ApiResponse<ResourceResponse> resp = updateResourceWithHttpInfo(idOrUri, resource);
        return resp.getData();
    }

    /**
     * 
     * Updates a single resource
     * @param idOrUri ID or URI of resource to fetch (required)
     * @param resource Resource parameters to update (required)
     * @return ApiResponse&lt;ResourceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourceResponse> updateResourceWithHttpInfo(String idOrUri, ResourceRequest resource) throws ApiException {
        com.squareup.okhttp.Call call = updateResourceCall(idOrUri, resource, null, null);
        Type localVarReturnType = new TypeToken<ResourceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Updates a single resource
     * @param idOrUri ID or URI of resource to fetch (required)
     * @param resource Resource parameters to update (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateResourceAsync(String idOrUri, ResourceRequest resource, final ApiCallback<ResourceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateResourceCall(idOrUri, resource, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
