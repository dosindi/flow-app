package com.dun.open_process_flow.model;

import java.net.URI;
import java.util.Objects;
import com.dun.open_process_flow.model.Lane;
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
 * LanesGet200Response
 */

@JsonTypeName("_lanes_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class LanesGet200Response {

  private @Nullable Boolean success;

  @Valid
  private List<@Valid Lane> data = new ArrayList<>();

  private @Nullable Integer count;

  public LanesGet200Response success(@Nullable Boolean success) {
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

  public LanesGet200Response data(List<@Valid Lane> data) {
    this.data = data;
    return this;
  }

  public LanesGet200Response addDataItem(Lane dataItem) {
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
  public List<@Valid Lane> getData() {
    return data;
  }

  public void setData(List<@Valid Lane> data) {
    this.data = data;
  }

  public LanesGet200Response count(@Nullable Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  
  @Schema(name = "count", example = "6", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public @Nullable Integer getCount() {
    return count;
  }

  public void setCount(@Nullable Integer count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanesGet200Response lanesGet200Response = (LanesGet200Response) o;
    return Objects.equals(this.success, lanesGet200Response.success) &&
        Objects.equals(this.data, lanesGet200Response.data) &&
        Objects.equals(this.count, lanesGet200Response.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, data, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanesGet200Response {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

