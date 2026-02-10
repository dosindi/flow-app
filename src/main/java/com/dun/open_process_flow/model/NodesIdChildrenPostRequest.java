package com.dun.open_process_flow.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NodesIdChildrenPostRequest
 */

@JsonTypeName("_nodes__id__children_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class NodesIdChildrenPostRequest {

  private String childId;

  private @Nullable Integer sequenceOrder;

  public NodesIdChildrenPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NodesIdChildrenPostRequest(String childId) {
    this.childId = childId;
  }

  public NodesIdChildrenPostRequest childId(String childId) {
    this.childId = childId;
    return this;
  }

  /**
   * Get childId
   * @return childId
   */
  @NotNull 
  @Schema(name = "child_id", example = "20", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("child_id")
  public String getChildId() {
    return childId;
  }

  public void setChildId(String childId) {
    this.childId = childId;
  }

  public NodesIdChildrenPostRequest sequenceOrder(@Nullable Integer sequenceOrder) {
    this.sequenceOrder = sequenceOrder;
    return this;
  }

  /**
   * Get sequenceOrder
   * @return sequenceOrder
   */
  
  @Schema(name = "sequence_order", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sequence_order")
  public @Nullable Integer getSequenceOrder() {
    return sequenceOrder;
  }

  public void setSequenceOrder(@Nullable Integer sequenceOrder) {
    this.sequenceOrder = sequenceOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodesIdChildrenPostRequest nodesIdChildrenPostRequest = (NodesIdChildrenPostRequest) o;
    return Objects.equals(this.childId, nodesIdChildrenPostRequest.childId) &&
        Objects.equals(this.sequenceOrder, nodesIdChildrenPostRequest.sequenceOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childId, sequenceOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodesIdChildrenPostRequest {\n");
    sb.append("    childId: ").append(toIndentedString(childId)).append("\n");
    sb.append("    sequenceOrder: ").append(toIndentedString(sequenceOrder)).append("\n");
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

