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
 * NodeText
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class NodeText {

  private @Nullable Integer id;

  private @Nullable String nodeId;

  private @Nullable String textContent;

  private @Nullable Integer sequenceOrder;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  public NodeText id(@Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Integer getId() {
    return id;
  }

  public void setId(@Nullable Integer id) {
    this.id = id;
  }

  public NodeText nodeId(@Nullable String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  /**
   * Get nodeId
   * @return nodeId
   */
  
  @Schema(name = "node_id", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("node_id")
  public @Nullable String getNodeId() {
    return nodeId;
  }

  public void setNodeId(@Nullable String nodeId) {
    this.nodeId = nodeId;
  }

  public NodeText textContent(@Nullable String textContent) {
    this.textContent = textContent;
    return this;
  }

  /**
   * Get textContent
   * @return textContent
   */
  
  @Schema(name = "text_content", example = "Vaporizer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text_content")
  public @Nullable String getTextContent() {
    return textContent;
  }

  public void setTextContent(@Nullable String textContent) {
    this.textContent = textContent;
  }

  public NodeText sequenceOrder(@Nullable Integer sequenceOrder) {
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

  public NodeText createdAt(@Nullable OffsetDateTime createdAt) {
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
    NodeText nodeText = (NodeText) o;
    return Objects.equals(this.id, nodeText.id) &&
        Objects.equals(this.nodeId, nodeText.nodeId) &&
        Objects.equals(this.textContent, nodeText.textContent) &&
        Objects.equals(this.sequenceOrder, nodeText.sequenceOrder) &&
        Objects.equals(this.createdAt, nodeText.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nodeId, textContent, sequenceOrder, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeText {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
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

