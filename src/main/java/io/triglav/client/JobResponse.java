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
import io.triglav.client.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * JobResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-11T18:51:26.698+09:00")
public class JobResponse   {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("contact_id")
  private Integer contactId = null;

  @SerializedName("created_at")
  private Integer createdAt = null;

  @SerializedName("updated_at")
  private Integer updatedAt = null;

  @SerializedName("input_resources")
  private List<Resource> inputResources = new ArrayList<Resource>();

  @SerializedName("output_resources")
  private List<Resource> outputResources = new ArrayList<Resource>();

  public JobResponse id(Long id) {
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

  public JobResponse uri(String uri) {
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

  public JobResponse contactId(Integer contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * Get contactId
   * @return contactId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getContactId() {
    return contactId;
  }

  public void setContactId(Integer contactId) {
    this.contactId = contactId;
  }

  public JobResponse createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public JobResponse updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

  public JobResponse inputResources(List<Resource> inputResources) {
    this.inputResources = inputResources;
    return this;
  }

   /**
   * New resources are created if it does not exit. Need to use Resource API to update
   * @return inputResources
  **/
  @ApiModelProperty(example = "null", value = "New resources are created if it does not exit. Need to use Resource API to update")
  public List<Resource> getInputResources() {
    return inputResources;
  }

  public void setInputResources(List<Resource> inputResources) {
    this.inputResources = inputResources;
  }

  public JobResponse outputResources(List<Resource> outputResources) {
    this.outputResources = outputResources;
    return this;
  }

   /**
   * New resources are created if it does not exit. Need to use Resource API to update
   * @return outputResources
  **/
  @ApiModelProperty(example = "null", value = "New resources are created if it does not exit. Need to use Resource API to update")
  public List<Resource> getOutputResources() {
    return outputResources;
  }

  public void setOutputResources(List<Resource> outputResources) {
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
    JobResponse jobResponse = (JobResponse) o;
    return Objects.equals(this.id, jobResponse.id) &&
        Objects.equals(this.uri, jobResponse.uri) &&
        Objects.equals(this.contactId, jobResponse.contactId) &&
        Objects.equals(this.createdAt, jobResponse.createdAt) &&
        Objects.equals(this.updatedAt, jobResponse.updatedAt) &&
        Objects.equals(this.inputResources, jobResponse.inputResources) &&
        Objects.equals(this.outputResources, jobResponse.outputResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, contactId, createdAt, updatedAt, inputResources, outputResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
