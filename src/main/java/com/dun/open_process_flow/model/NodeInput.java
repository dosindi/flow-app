package com.dun.open_process_flow.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NodeInput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class NodeInput {

  private String id;

  private String laneId;

  private String title;

  private String titleAbbreviation;

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

  private StateEnum state;

  private JsonNullable<@Size(max = 100) String> stateText = JsonNullable.<String>undefined();

  private Boolean focused = false;

  public NodeInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NodeInput(String id, String laneId, String title, String titleAbbreviation, StateEnum state) {
    this.id = id;
    this.laneId = laneId;
    this.title = title;
    this.titleAbbreviation = titleAbbreviation;
    this.state = state;
  }

  public NodeInput id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull @Size(max = 10) 
  @Schema(name = "id", example = "10", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NodeInput laneId(String laneId) {
    this.laneId = laneId;
    return this;
  }

  /**
   * Get laneId
   * @return laneId
   */
  @NotNull @Size(max = 10) 
  @Schema(name = "lane_id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lane_id")
  public String getLaneId() {
    return laneId;
  }

  public void setLaneId(String laneId) {
    this.laneId = laneId;
  }

  public NodeInput title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @NotNull @Size(max = 255) 
  @Schema(name = "title", example = "Manufacturing: Freezer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public NodeInput titleAbbreviation(String titleAbbreviation) {
    this.titleAbbreviation = titleAbbreviation;
    return this;
  }

  /**
   * Get titleAbbreviation
   * @return titleAbbreviation
   */
  @NotNull @Size(max = 20) 
  @Schema(name = "title_abbreviation", example = "MAF", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title_abbreviation")
  public String getTitleAbbreviation() {
    return titleAbbreviation;
  }

  public void setTitleAbbreviation(String titleAbbreviation) {
    this.titleAbbreviation = titleAbbreviation;
  }

  public NodeInput state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @NotNull 
  @Schema(name = "state", example = "Positive", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public NodeInput stateText(String stateText) {
    this.stateText = JsonNullable.of(stateText);
    return this;
  }

  /**
   * Get stateText
   * @return stateText
   */
  @Size(max = 100) 
  @Schema(name = "state_text", example = "Finished", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state_text")
  public JsonNullable<@Size(max = 100) String> getStateText() {
    return stateText;
  }

  public void setStateText(JsonNullable<String> stateText) {
    this.stateText = stateText;
  }

  public NodeInput focused(Boolean focused) {
    this.focused = focused;
    return this;
  }

  /**
   * Get focused
   * @return focused
   */
  
  @Schema(name = "focused", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("focused")
  public Boolean getFocused() {
    return focused;
  }

  public void setFocused(Boolean focused) {
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
    NodeInput nodeInput = (NodeInput) o;
    return Objects.equals(this.id, nodeInput.id) &&
        Objects.equals(this.laneId, nodeInput.laneId) &&
        Objects.equals(this.title, nodeInput.title) &&
        Objects.equals(this.titleAbbreviation, nodeInput.titleAbbreviation) &&
        Objects.equals(this.state, nodeInput.state) &&
        equalsNullable(this.stateText, nodeInput.stateText) &&
        Objects.equals(this.focused, nodeInput.focused);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, laneId, title, titleAbbreviation, state, hashCodeNullable(stateText), focused);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeInput {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    laneId: ").append(toIndentedString(laneId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAbbreviation: ").append(toIndentedString(titleAbbreviation)).append("\n");
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

