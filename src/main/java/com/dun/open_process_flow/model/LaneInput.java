package com.dun.open_process_flow.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LaneInput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class LaneInput {

  private String id;

  private String icon;

  private String label;

  private Integer position;

  public LaneInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LaneInput(String id, String icon, String label, Integer position) {
    this.id = id;
    this.icon = icon;
    this.label = label;
    this.position = position;
  }

  public LaneInput id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull @Size(max = 10) 
  @Schema(name = "id", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LaneInput icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "icon", example = "sap-icon://cart-3", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("icon")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public LaneInput label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "label", example = "Order", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LaneInput position(Integer position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * minimum: 0
   * @return position
   */
  @NotNull @Min(value = 0) 
  @Schema(name = "position", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("position")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaneInput laneInput = (LaneInput) o;
    return Objects.equals(this.id, laneInput.id) &&
        Objects.equals(this.icon, laneInput.icon) &&
        Objects.equals(this.label, laneInput.label) &&
        Objects.equals(this.position, laneInput.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, icon, label, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaneInput {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

