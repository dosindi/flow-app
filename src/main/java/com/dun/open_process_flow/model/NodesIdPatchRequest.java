package com.dun.open_process_flow.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NodesIdPatchRequest
 */

@JsonTypeName("_nodes__id__patch_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class NodesIdPatchRequest {

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    POSITIVE("Positive"),
    
    NEGATIVE("Negative"),
    
    CRITICAL("Critical"),
    
    NEUTRAL("Neutral"),
    
    PLANNED("Planned");

    private final String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable StateEnum state;

  private @Nullable String stateText;

  private @Nullable Boolean focused;

  public NodesIdPatchRequest state(@Nullable StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public @Nullable StateEnum getState() {
    return state;
  }

  public void setState(@Nullable StateEnum state) {
    this.state = state;
  }

  public NodesIdPatchRequest stateText(@Nullable String stateText) {
    this.stateText = stateText;
    return this;
  }

  /**
   * Get stateText
   * @return stateText
   */
  
  @Schema(name = "state_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state_text")
  public @Nullable String getStateText() {
    return stateText;
  }

  public void setStateText(@Nullable String stateText) {
    this.stateText = stateText;
  }

  public NodesIdPatchRequest focused(@Nullable Boolean focused) {
    this.focused = focused;
    return this;
  }

  /**
   * Get focused
   * @return focused
   */
  
  @Schema(name = "focused", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("focused")
  public @Nullable Boolean getFocused() {
    return focused;
  }

  public void setFocused(@Nullable Boolean focused) {
    this.focused = focused;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodesIdPatchRequest nodesIdPatchRequest = (NodesIdPatchRequest) o;
    return Objects.equals(this.state, nodesIdPatchRequest.state) &&
        Objects.equals(this.stateText, nodesIdPatchRequest.stateText) &&
        Objects.equals(this.focused, nodesIdPatchRequest.focused);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, stateText, focused);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodesIdPatchRequest {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateText: ").append(toIndentedString(stateText)).append("\n");
    sb.append("    focused: ").append(toIndentedString(focused)).append("\n");
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

