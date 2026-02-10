package com.dun.open_process_flow.model;

import java.net.URI;
import java.util.Objects;
import com.dun.open_process_flow.model.NodeText;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NodesIdTextsPut200Response
 */

@JsonTypeName("_nodes__id__texts_put_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class NodesIdTextsPut200Response {

  private @Nullable Boolean success;

  @Valid
  private List<@Valid NodeText> data = new ArrayList<>();

  private @Nullable String message;

  public NodesIdTextsPut200Response success(@Nullable Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
   */
  
  @Schema(name = "success", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("success")
  public @Nullable Boolean getSuccess() {
    return success;
  }

  public void setSuccess(@Nullable Boolean success) {
    this.success = success;
  }

  public NodesIdTextsPut200Response data(List<@Valid NodeText> data) {
    this.data = data;
    return this;
  }

  public NodesIdTextsPut200Response addDataItem(NodeText dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid NodeText> getData() {
    return data;
  }

  public void setData(List<@Valid NodeText> data) {
    this.data = data;
  }

  public NodesIdTextsPut200Response message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", example = "Texts replaced successfully", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodesIdTextsPut200Response nodesIdTextsPut200Response = (NodesIdTextsPut200Response) o;
    return Objects.equals(this.success, nodesIdTextsPut200Response.success) &&
        Objects.equals(this.data, nodesIdTextsPut200Response.data) &&
        Objects.equals(this.message, nodesIdTextsPut200Response.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, data, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodesIdTextsPut200Response {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

