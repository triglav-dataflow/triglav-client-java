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

import io.triglav.client.ErrorModel;
import io.triglav.client.MessageEachResponse;
import io.triglav.client.MessageFetchRequest;
import io.triglav.client.LastMessageIdResponse;
import io.triglav.client.MessageRequest;
import io.triglav.client.BulkinsertResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagesApi {
    private ApiClient apiClient;

    public MessagesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessagesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for fetchMessages */
    private com.squareup.okhttp.Call fetchMessagesCall(MessageFetchRequest fetchRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = fetchRequest;
        
        // verify the required parameter 'fetchRequest' is set
        if (fetchRequest == null) {
            throw new ApiException("Missing the required parameter 'fetchRequest' when calling fetchMessages(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fetch_messages".replaceAll("\\{format\\}","json");

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
     * Fetch messages with HTTP POST method
     * @param fetchRequest Fetch Request (required)
     * @return List&lt;MessageEachResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MessageEachResponse> fetchMessages(MessageFetchRequest fetchRequest) throws ApiException {
        ApiResponse<List<MessageEachResponse>> resp = fetchMessagesWithHttpInfo(fetchRequest);
        return resp.getData();
    }

    /**
     * 
     * Fetch messages with HTTP POST method
     * @param fetchRequest Fetch Request (required)
     * @return ApiResponse&lt;List&lt;MessageEachResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MessageEachResponse>> fetchMessagesWithHttpInfo(MessageFetchRequest fetchRequest) throws ApiException {
        com.squareup.okhttp.Call call = fetchMessagesCall(fetchRequest, null, null);
        Type localVarReturnType = new TypeToken<List<MessageEachResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Fetch messages with HTTP POST method
     * @param fetchRequest Fetch Request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchMessagesAsync(MessageFetchRequest fetchRequest, final ApiCallback<List<MessageEachResponse>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = fetchMessagesCall(fetchRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MessageEachResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getLastMessageId */
    private com.squareup.okhttp.Call getLastMessageIdCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/messages/last_id".replaceAll("\\{format\\}","json");

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
     * Get the current last message id which would be used as a first offset to fetch messages
     * @return LastMessageIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LastMessageIdResponse getLastMessageId() throws ApiException {
        ApiResponse<LastMessageIdResponse> resp = getLastMessageIdWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Get the current last message id which would be used as a first offset to fetch messages
     * @return ApiResponse&lt;LastMessageIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LastMessageIdResponse> getLastMessageIdWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLastMessageIdCall(null, null);
        Type localVarReturnType = new TypeToken<LastMessageIdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the current last message id which would be used as a first offset to fetch messages
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLastMessageIdAsync(final ApiCallback<LastMessageIdResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLastMessageIdCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LastMessageIdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listMessages */
    private com.squareup.okhttp.Call listMessagesCall(Integer offset, Integer limit, String resourceUris, String resourceUnit, Integer resourceTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'offset' is set
        if (offset == null) {
            throw new ApiException("Missing the required parameter 'offset' when calling listMessages(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/messages".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (resourceUris != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "resource_uris", resourceUris));
        if (resourceUnit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "resource_unit", resourceUnit));
        if (resourceTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "resource_time", resourceTime));

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
     * List messages with HTTP GET method
     * @param offset Offset (Greater than or equal to) ID for Messages to list from (required)
     * @param limit Number of limits (optional)
     * @param resourceUris URIs of Resource (optional)
     * @param resourceUnit Resource Unit such as daily, hourly, or singular. Required if resource_time is given (optional)
     * @param resourceTime Resource Time in UNIX Timestamp (optional)
     * @return List&lt;MessageEachResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MessageEachResponse> listMessages(Integer offset, Integer limit, String resourceUris, String resourceUnit, Integer resourceTime) throws ApiException {
        ApiResponse<List<MessageEachResponse>> resp = listMessagesWithHttpInfo(offset, limit, resourceUris, resourceUnit, resourceTime);
        return resp.getData();
    }

    /**
     * 
     * List messages with HTTP GET method
     * @param offset Offset (Greater than or equal to) ID for Messages to list from (required)
     * @param limit Number of limits (optional)
     * @param resourceUris URIs of Resource (optional)
     * @param resourceUnit Resource Unit such as daily, hourly, or singular. Required if resource_time is given (optional)
     * @param resourceTime Resource Time in UNIX Timestamp (optional)
     * @return ApiResponse&lt;List&lt;MessageEachResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MessageEachResponse>> listMessagesWithHttpInfo(Integer offset, Integer limit, String resourceUris, String resourceUnit, Integer resourceTime) throws ApiException {
        com.squareup.okhttp.Call call = listMessagesCall(offset, limit, resourceUris, resourceUnit, resourceTime, null, null);
        Type localVarReturnType = new TypeToken<List<MessageEachResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List messages with HTTP GET method
     * @param offset Offset (Greater than or equal to) ID for Messages to list from (required)
     * @param limit Number of limits (optional)
     * @param resourceUris URIs of Resource (optional)
     * @param resourceUnit Resource Unit such as daily, hourly, or singular. Required if resource_time is given (optional)
     * @param resourceTime Resource Time in UNIX Timestamp (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMessagesAsync(Integer offset, Integer limit, String resourceUris, String resourceUnit, Integer resourceTime, final ApiCallback<List<MessageEachResponse>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listMessagesCall(offset, limit, resourceUris, resourceUnit, resourceTime, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MessageEachResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for sendMessages */
    private com.squareup.okhttp.Call sendMessagesCall(List<MessageRequest> messages, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = messages;
        
        // verify the required parameter 'messages' is set
        if (messages == null) {
            throw new ApiException("Missing the required parameter 'messages' when calling sendMessages(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/messages".replaceAll("\\{format\\}","json");

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
     * Enqueues new messages
     * @param messages Messages to enqueue (required)
     * @return BulkinsertResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BulkinsertResponse sendMessages(List<MessageRequest> messages) throws ApiException {
        ApiResponse<BulkinsertResponse> resp = sendMessagesWithHttpInfo(messages);
        return resp.getData();
    }

    /**
     * 
     * Enqueues new messages
     * @param messages Messages to enqueue (required)
     * @return ApiResponse&lt;BulkinsertResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BulkinsertResponse> sendMessagesWithHttpInfo(List<MessageRequest> messages) throws ApiException {
        com.squareup.okhttp.Call call = sendMessagesCall(messages, null, null);
        Type localVarReturnType = new TypeToken<BulkinsertResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Enqueues new messages
     * @param messages Messages to enqueue (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sendMessagesAsync(List<MessageRequest> messages, final ApiCallback<BulkinsertResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = sendMessagesCall(messages, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BulkinsertResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
