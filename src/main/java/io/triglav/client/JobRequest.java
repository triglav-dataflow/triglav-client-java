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


package io.triglav.client;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.triglav.client.ResourceRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * JobRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T22:35:11.505+09:00")
public class JobRequest   {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("logical_op")
  private String logicalOp = null;

  @SerializedName("input_resources")
  private List<ResourceRequest> inputResources = new ArrayList<ResourceRequest>();

  @SerializedName("output_resources")
  private List<ResourceRequest> outputResources = new ArrayList<ResourceRequest>();

  public JobRequest id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public JobRequest uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public JobRequest logicalOp(String logicalOp) {
    this.logicalOp = logicalOp;
    return this;
  }

   /**
   * Get logicalOp
   * @return logicalOp
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLogicalOp() {
    return logicalOp;
  }

  public void setLogicalOp(String logicalOp) {
    this.logicalOp = logicalOp;
  }

  public JobRequest inputResources(List<ResourceRequest> inputResources) {
    this.inputResources = inputResources;
    return this;
  }

   /**
   * New resources are created if id is not given. Update if id is given
   * @return inputResources
  **/
  @ApiModelProperty(example = "null", value = "New resources are created if id is not given. Update if id is given")
  public List<ResourceRequest> getInputResources() {
    return inputResources;
  }

  public void setInputResources(List<ResourceRequest> inputResources) {
    this.inputResources = inputResources;
  }

  public JobRequest outputResources(List<ResourceRequest> outputResources) {
    this.outputResources = outputResources;
    return this;
  }

   /**
   * New resources are created if id is not given. Update if id is given
   * @return outputResources
  **/
  @ApiModelProperty(example = "null", value = "New resources are created if id is not given. Update if id is given")
  public List<ResourceRequest> getOutputResources() {
    return outputResources;
  }

  public void setOutputResources(List<ResourceRequest> outputResources) {
    this.outputResources = outputResources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobRequest jobRequest = (JobRequest) o;
    return Objects.equals(this.id, jobRequest.id) &&
        Objects.equals(this.uri, jobRequest.uri) &&
        Objects.equals(this.logicalOp, jobRequest.logicalOp) &&
        Objects.equals(this.inputResources, jobRequest.inputResources) &&
        Objects.equals(this.outputResources, jobRequest.outputResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, logicalOp, inputResources, outputResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    logicalOp: ").append(toIndentedString(logicalOp)).append("\n");
    sb.append("    inputResources: ").append(toIndentedString(inputResources)).append("\n");
    sb.append("    outputResources: ").append(toIndentedString(outputResources)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

