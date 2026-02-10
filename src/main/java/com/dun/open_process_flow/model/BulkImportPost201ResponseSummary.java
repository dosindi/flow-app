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
 * BulkImportPost201ResponseSummary
 */

@JsonTypeName("_bulk_import_post_201_response_summary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class BulkImportPost201ResponseSummary {

  private @Nullable Integer lanesCreated;

  private @Nullable Integer nodesCreated;

  private @Nullable Integer relationshipsCreated;

  private @Nullable Integer textsCreated;

  public BulkImportPost201ResponseSummary lanesCreated(@Nullable Integer lanesCreated) {
    this.lanesCreated = lanesCreated;
    return this;
  }

  /**
   * Get lanesCreated
   * @return lanesCreated
   */
  
  @Schema(name = "lanes_created", example = "6", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lanes_created")
  public @Nullable Integer getLanesCreated() {
    return lanesCreated;
  }

  public void setLanesCreated(@Nullable Integer lanesCreated) {
    this.lanesCreated = lanesCreated;
  }

  public BulkImportPost201ResponseSummary nodesCreated(@Nullable Integer nodesCreated) {
    this.nodesCreated = nodesCreated;
    return this;
  }

  /**
   * Get nodesCreated
   * @return nodesCreated
   */
  
  @Schema(name = "nodes_created", example = "14", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nodes_created")
  public @Nullable Integer getNodesCreated() {
    return nodesCreated;
  }

  public void setNodesCreated(@Nullable Integer nodesCreated) {
    this.nodesCreated = nodesCreated;
  }

  public BulkImportPost201ResponseSummary relationshipsCreated(@Nullable Integer relationshipsCreated) {
    this.relationshipsCreated = relationshipsCreated;
    return this;
  }

  /**
   * Get relationshipsCreated
   * @return relationshipsCreated
   */
  
  @Schema(name = "relationships_created", example = "15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relationships_created")
  public @Nullable Integer getRelationshipsCreated() {
    return relationshipsCreated;
  }

  public void setRelationshipsCreated(@Nullable Integer relationshipsCreated) {
    this.relationshipsCreated = relationshipsCreated;
  }

  public BulkImportPost201ResponseSummary textsCreated(@Nullable Integer textsCreated) {
    this.textsCreated = textsCreated;
    return this;
  }

  /**
   * Get textsCreated
   * @return textsCreated
   */
  
  @Schema(name = "texts_created", example = "14", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("texts_created")
  public @Nullable Integer getTextsCreated() {
    return textsCreated;
  }

  public void setTextsCreated(@Nullable Integer textsCreated) {
    this.textsCreated = textsCreated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkImportPost201ResponseSummary bulkImportPost201ResponseSummary = (BulkImportPost201ResponseSummary) o;
    return Objects.equals(this.lanesCreated, bulkImportPost201ResponseSummary.lanesCreated) &&
        Objects.equals(this.nodesCreated, bulkImportPost201ResponseSummary.nodesCreated) &&
        Objects.equals(this.relationshipsCreated, bulkImportPost201ResponseSummary.relationshipsCreated) &&
        Objects.equals(this.textsCreated, bulkImportPost201ResponseSummary.textsCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lanesCreated, nodesCreated, relationshipsCreated, textsCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkImportPost201ResponseSummary {\n");
    sb.append("    lanesCreated: ").append(toIndentedString(lanesCreated)).append("\n");
    sb.append("    nodesCreated: ").append(toIndentedString(nodesCreated)).append("\n");
    sb.append("    relationshipsCreated: ").append(toIndentedString(relationshipsCreated)).append("\n");
    sb.append("    textsCreated: ").append(toIndentedString(textsCreated)).append("\n");
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

