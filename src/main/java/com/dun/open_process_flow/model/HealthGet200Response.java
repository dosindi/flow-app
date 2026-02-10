package com.dun.open_process_flow.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * HealthGet200Response
 */

@JsonTypeName("_health_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class HealthGet200Response {

  private @Nullable String status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime timestamp;

  private @Nullable String database;

  public HealthGet200Response status(@Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "status", example = "healthy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable String getStatus() {
    return status;
  }

  public void setStatus(@Nullable String status) {
    this.status = status;
  }

  public HealthGet200Response timestamp(@Nullable OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @Valid 
  @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public @Nullable OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(@Nullable OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public HealthGet200Response database(@Nullable String database) {
    this.database = database;
    return this;
  }

  /**
   * Get database
   * @return database
   */
  
  @Schema(name = "database", example = "connected", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("database")
  public @Nullable String getDatabase() {
    return database;
  }

  public void setDatabase(@Nullable String database) {
    this.database = database;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthGet200Response healthGet200Response = (HealthGet200Response) o;
    return Objects.equals(this.status, healthGet200Response.status) &&
        Objects.equals(this.timestamp, healthGet200Response.timestamp) &&
        Objects.equals(this.database, healthGet200Response.database);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, timestamp, database);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthGet200Response {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
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

