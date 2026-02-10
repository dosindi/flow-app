package com.dun.open_process_flow.model;

import java.net.URI;
import java.util.Objects;
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
 * NodesIdTextsPutRequest
 */

@JsonTypeName("_nodes__id__texts_put_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class NodesIdTextsPutRequest {

  @Valid
  private List<String> texts = new ArrayList<>();

  public NodesIdTextsPutRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NodesIdTextsPutRequest(List<String> texts) {
    this.texts = texts;
  }

  public NodesIdTextsPutRequest texts(List<String> texts) {
    this.texts = texts;
    return this;
  }

  public NodesIdTextsPutRequest addTextsItem(String textsItem) {
    if (this.texts == null) {
      this.texts = new ArrayList<>();
    }
    this.texts.add(textsItem);
    return this;
  }

  /**
   * Get texts
   * @return texts
   */
  @NotNull 
  @Schema(name = "texts", example = "[\"Vaporizer\",\"Compressor\"]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("texts")
  public List<String> getTexts() {
    return texts;
  }

  public void setTexts(List<String> texts) {
    this.texts = texts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodesIdTextsPutRequest nodesIdTextsPutRequest = (NodesIdTextsPutRequest) o;
    return Objects.equals(this.texts, nodesIdTextsPutRequest.texts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(texts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodesIdTextsPutRequest {\n");
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
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

