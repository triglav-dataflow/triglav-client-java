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


package io.github.triglav_dataflow.client;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.github.triglav_dataflow.client.MessageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * MessageResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-08T15:04:46.882+09:00")
public class MessageResponse   {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("resource_uri")
  private String resourceUri = null;

  @SerializedName("resource_unit")
  private String resourceUnit = null;

  @SerializedName("resource_time")
  private Integer resourceTime = null;

  @SerializedName("resource_timezone")
  private String resourceTimezone = null;

  @SerializedName("payload")
  private String payload = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public MessageResponse uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Universally Unique ID to be used to avoid duplicated messages
   * @return uuid
  **/
  @ApiModelProperty(example = "null", value = "Universally Unique ID to be used to avoid duplicated messages")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public MessageResponse resourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

   /**
   * URI of Resource
   * @return resourceUri
  **/
  @ApiModelProperty(example = "null", required = true, value = "URI of Resource")
  public String getResourceUri() {
    return resourceUri;
  }

  public void setResourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
  }

  public MessageResponse resourceUnit(String resourceUnit) {
    this.resourceUnit = resourceUnit;
    return this;
  }

   /**
   * Time unit of resource to monitor such as singular, daily, or hourly
   * @return resourceUnit
  **/
  @ApiModelProperty(example = "null", required = true, value = "Time unit of resource to monitor such as singular, daily, or hourly")
  public String getResourceUnit() {
    return resourceUnit;
  }

  public void setResourceUnit(String resourceUnit) {
    this.resourceUnit = resourceUnit;
  }

  public MessageResponse resourceTime(Integer resourceTime) {
    this.resourceTime = resourceTime;
    return this;
  }

   /**
   * Time of Resource in unix timestamp such as 1476025200 (2016-10-10 in +09:00)
   * @return resourceTime
  **/
  @ApiModelProperty(example = "null", required = true, value = "Time of Resource in unix timestamp such as 1476025200 (2016-10-10 in +09:00)")
  public Integer getResourceTime() {
    return resourceTime;
  }

  public void setResourceTime(Integer resourceTime) {
    this.resourceTime = resourceTime;
  }

  public MessageResponse resourceTimezone(String resourceTimezone) {
    this.resourceTimezone = resourceTimezone;
    return this;
  }

   /**
   * Timezone of resource time, that is, timezone of %Y-%m-%d for hdfs://path/to/%Y-%m-%d such as +09:00
   * @return resourceTimezone
  **/
  @ApiModelProperty(example = "null", required = true, value = "Timezone of resource time, that is, timezone of %Y-%m-%d for hdfs://path/to/%Y-%m-%d such as +09:00")
  public String getResourceTimezone() {
    return resourceTimezone;
  }

  public void setResourceTimezone(String resourceTimezone) {
    this.resourceTimezone = resourceTimezone;
  }

  public MessageResponse payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Any json string
   * @return payload
  **/
  @ApiModelProperty(example = "null", value = "Any json string")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public MessageResponse id(Long id) {
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

  public MessageResponse createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public MessageResponse updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponse messageResponse = (MessageResponse) o;
    return Objects.equals(this.uuid, messageResponse.uuid) &&
        Objects.equals(this.resourceUri, messageResponse.resourceUri) &&
        Objects.equals(this.resourceUnit, messageResponse.resourceUnit) &&
        Objects.equals(this.resourceTime, messageResponse.resourceTime) &&
        Objects.equals(this.resourceTimezone, messageResponse.resourceTimezone) &&
        Objects.equals(this.payload, messageResponse.payload) &&
        Objects.equals(this.id, messageResponse.id) &&
        Objects.equals(this.createdAt, messageResponse.createdAt) &&
        Objects.equals(this.updatedAt, messageResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, resourceUri, resourceUnit, resourceTime, resourceTimezone, payload, id, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponse {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
    sb.append("    resourceUnit: ").append(toIndentedString(resourceUnit)).append("\n");
    sb.append("    resourceTime: ").append(toIndentedString(resourceTime)).append("\n");
    sb.append("    resourceTimezone: ").append(toIndentedString(resourceTimezone)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

