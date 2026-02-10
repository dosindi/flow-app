package com.dun.open_process_flow.model;

import java.net.URI;
import java.util.Objects;
import com.dun.open_process_flow.model.Lane;
import com.dun.open_process_flow.model.NodeText;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
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
 * NodeComplete
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class NodeComplete {

  private @Nullable String id;

  private @Nullable String laneId;

  private @Nullable String title;

  private @Nullable String titleAbbreviation;

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

  private JsonNullable<String> stateText = JsonNullable.<String>undefined();

  private @Nullable Boolean focused;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime updatedAt;

  private @Nullable Lane lane;

  @Valid
  private List<@Valid NodeText> texts = new ArrayList<>();

  @Valid
  private List<String> children = new ArrayList<>();

  public NodeComplete id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public NodeComplete laneId(@Nullable String laneId) {
    this.laneId = laneId;
    return this;
  }

  /**
   * Get laneId
   * @return laneId
   */
  
  @Schema(name = "lane_id", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lane_id")
  public @Nullable String getLaneId() {
    return laneId;
  }

  public void setLaneId(@Nullable String laneId) {
    this.laneId = laneId;
  }

  public NodeComplete title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", example = "Manufacturing: Freezer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public NodeComplete titleAbbreviation(@Nullable String titleAbbreviation) {
    this.titleAbbreviation = titleAbbreviation;
    return this;
  }

  /**
   * Get titleAbbreviation
   * @return titleAbbreviation
   */
  
  @Schema(name = "title_abbreviation", example = "MAF", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title_abbreviation")
  public @Nullable String getTitleAbbreviation() {
    return titleAbbreviation;
  }

  public void setTitleAbbreviation(@Nullable String titleAbbreviation) {
    this.titleAbbreviation = titleAbbreviation;
  }

  public NodeComplete state(@Nullable StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  
  @Schema(name = "state", example = "Positive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public @Nullable StateEnum getState() {
    return state;
  }

  public void setState(@Nullable StateEnum state) {
    this.state = state;
  }

  public NodeComplete stateText(String stateText) {
    this.stateText = JsonNullable.of(stateText);
    return this;
  }

  /**
   * Get stateText
   * @return stateText
   */
  
  @Schema(name = "state_text", example = "Finished", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state_text")
  public JsonNullable<String> getStateText() {
    return stateText;
  }

  public void setStateText(JsonNullable<String> stateText) {
    this.stateText = stateText;
  }

  public NodeComplete focused(@Nullable Boolean focused) {
    this.focused = focused;
    return this;
  }

  /**
   * Get focused
   * @return focused
   */
  
  @Schema(name = "focused", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("focused")
  public @Nullable Boolean getFocused() {
    return focused;
  }

  public void setFocused(@Nullable Boolean focused) {
    this.focused = focused;
  }

  public NodeComplete createdAt(@Nullable OffsetDateTime createdAt) {
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

  public NodeComplete updatedAt(@Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @Valid 
  @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public @Nullable OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public NodeComplete lane(@Nullable Lane lane) {
    this.lane = lane;
    return this;
  }

  /**
   * Get lane
   * @return lane
   */
  @Valid 
  @Schema(name = "lane", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lane")
  public @Nullable Lane getLane() {
    return lane;
  }

  public void setLane(@Nullable Lane lane) {
    this.lane = lane;
  }

  public NodeComplete texts(List<@Valid NodeText> texts) {
    this.texts = texts;
    return this;
  }

  public NodeComplete addTextsItem(NodeText textsItem) {
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
  @Valid 
  @Schema(name = "texts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("texts")
  public List<@Valid NodeText> getTexts() {
    return texts;
  }

  public void setTexts(List<@Valid NodeText> texts) {
    this.texts = texts;
  }

  public NodeComplete children(List<String> children) {
    this.children = children;
    return this;
  }

  public NodeComplete addChildrenItem(String childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Get children
   * @return children
   */
  
  @Schema(name = "children", example = "[\"20\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("children")
  public List<String> getChildren() {
    return children;
  }

  public void setChildren(List<String> children) {
    this.children = children;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeComplete nodeComplete = (NodeComplete) o;
    return Objects.equals(this.id, nodeComplete.id) &&
        Objects.equals(this.laneId, nodeComplete.laneId) &&
        Objects.equals(this.title, nodeComplete.title) &&
        Objects.equals(this.titleAbbreviation, nodeComplete.titleAbbreviation) &&
        Objects.equals(this.state, nodeComplete.state) &&
        equalsNullable(this.stateText, nodeComplete.stateText) &&
        Objects.equals(this.focused, nodeComplete.focused) &&
        Objects.equals(this.createdAt, nodeComplete.createdAt) &&
        Objects.equals(this.updatedAt, nodeComplete.updatedAt) &&
        Objects.equals(this.lane, nodeComplete.lane) &&
        Objects.equals(this.texts, nodeComplete.texts) &&
        Objects.equals(this.children, nodeComplete.children);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, laneId, title, titleAbbreviation, state, hashCodeNullable(stateText), focused, createdAt, updatedAt, lane, texts, children);
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
    sb.append("class NodeComplete {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    laneId: ").append(toIndentedString(laneId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAbbreviation: ").append(toIndentedString(titleAbbreviation)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateText: ").append(toIndentedString(stateText)).append("\n");
    sb.append("    focused: ").append(toIndentedString(focused)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    lane: ").append(toIndentedString(lane)).append("\n");
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

