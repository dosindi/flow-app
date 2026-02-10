package com.dun.open_process_flow.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NodeChild
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class NodeChild {

  private @Nullable String parentId;

  private @Nullable String childId;

  private @Nullable Integer sequenceOrder;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  public NodeChild parentId(@Nullable String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
   */
  
  @Schema(name = "parent_id", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_id")
  public @Nullable String getParentId() {
    return parentId;
  }

  public void setParentId(@Nullable String parentId) {
    this.parentId = parentId;
  }

  public NodeChild childId(@Nullable String childId) {
    this.childId = childId;
    return this;
  }

  /**
   * Get childId
   * @return childId
   */
  
  @Schema(name = "child_id", example = "20", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("child_id")
  public @Nullable String getChildId() {
    return childId;
  }

  public void setChildId(@Nullable String childId) {
    this.childId = childId;
  }

  public NodeChild sequenceOrder(@Nullable Integer sequenceOrder) {
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

  public NodeChild createdAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public @Nullable OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeChild nodeChild = (NodeChild) o;
    return Objects.equals(this.parentId, nodeChild.parentId) &&
        Objects.equals(this.childId, nodeChild.childId) &&
        Objects.equals(this.sequenceOrder, nodeChild.sequenceOrder) &&
        Objects.equals(this.createdAt, nodeChild.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, childId, sequenceOrder, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeChild {\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    childId: ").append(toIndentedString(childId)).append("\n");
    sb.append("    sequenceOrder: ").append(toIndentedString(sequenceOrder)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

