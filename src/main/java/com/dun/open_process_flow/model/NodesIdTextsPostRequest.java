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
 * NodesIdTextsPostRequest
 */

@JsonTypeName("_nodes__id__texts_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class NodesIdTextsPostRequest {

  private String textContent;

  private @Nullable Integer sequenceOrder;

  public NodesIdTextsPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NodesIdTextsPostRequest(String textContent) {
    this.textContent = textContent;
  }

  public NodesIdTextsPostRequest textContent(String textContent) {
    this.textContent = textContent;
    return this;
  }

  /**
   * Get textContent
   * @return textContent
   */
  @NotNull @Size(max = 500) 
  @Schema(name = "text_content", example = "Vaporizer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text_content")
  public String getTextContent() {
    return textContent;
  }

  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }

  public NodesIdTextsPostRequest sequenceOrder(@Nullable Integer sequenceOrder) {
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
    NodesIdTextsPostRequest nodesIdTextsPostRequest = (NodesIdTextsPostRequest) o;
    return Objects.equals(this.textContent, nodesIdTextsPostRequest.textContent) &&
        Objects.equals(this.sequenceOrder, nodesIdTextsPostRequest.sequenceOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textContent, sequenceOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodesIdTextsPostRequest {\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
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

