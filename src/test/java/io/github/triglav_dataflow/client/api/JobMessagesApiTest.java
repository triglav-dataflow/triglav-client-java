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


package io.github.triglav_dataflow.client.api;

import io.github.triglav_dataflow.client.ApiException;
import io.github.triglav_dataflow.client.ErrorModel;
import io.github.triglav_dataflow.client.JobMessageEachResponse;
import io.github.triglav_dataflow.client.LastJobMessageIdResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobMessagesApi
 */
public class JobMessagesApiTest {

    private final JobMessagesApi api = new JobMessagesApi();

    
    /**
     * 
     *
     * Fetch Job messages
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchJobMessagesTest() throws ApiException {
        Long offset = null;
        Long jobId = null;
        Long limit = null;
        // List<JobMessageEachResponse> response = api.fetchJobMessages(offset, jobId, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the current last message id which would be used as a first offset to fetch messages
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLastJobMessageIdTest() throws ApiException {
        // LastJobMessageIdResponse response = api.getLastJobMessageId();

        // TODO: test validations
    }
    
}
