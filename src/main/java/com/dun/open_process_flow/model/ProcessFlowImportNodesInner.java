package com.dun.open_process_flow.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ProcessFlowImportNodesInner
 */

@JsonTypeName("ProcessFlowImport_Nodes_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class ProcessFlowImportNodesInner {

  private String id;

  private String lane;

  private String title;

  private String titleAbbreviation;

  @Valid
  private JsonNullable<List<Integer>> children = JsonNullable.<List<Integer>>undefined();

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

  private JsonNullable<String> stateText = JsonNullable.<String>undefined();

  private @Nullable Boolean focused;

  @Valid
  private List<String> texts = new ArrayList<>();

  public ProcessFlowImportNodesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProcessFlowImportNodesInner(String id, String lane, String title, String titleAbbreviation, StateEnum state) {
    this.id = id;
    this.lane = lane;
    this.title = title;
    this.titleAbbreviation = titleAbbreviation;
    this.state = state;
  }

  public ProcessFlowImportNodesInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessFlowImportNodesInner lane(String lane) {
    this.lane = lane;
    return this;
  }

  /**
   * Get lane
   * @return lane
   */
  @NotNull 
  @Schema(name = "lane", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lane")
  public String getLane() {
    return lane;
  }

  public void setLane(String lane) {
    this.lane = lane;
  }

  public ProcessFlowImportNodesInner title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProcessFlowImportNodesInner titleAbbreviation(String titleAbbreviation) {
    this.titleAbbreviation = titleAbbreviation;
    return this;
  }

  /**
   * Get titleAbbreviation
   * @return titleAbbreviation
   */
  @NotNull 
  @Schema(name = "titleAbbreviation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("titleAbbreviation")
  public String getTitleAbbreviation() {
    return titleAbbreviation;
  }

  public void setTitleAbbreviation(String titleAbbreviation) {
    this.titleAbbreviation = titleAbbreviation;
  }

  public ProcessFlowImportNodesInner children(List<Integer> children) {
    this.children = JsonNullable.of(children);
    return this;
  }

  public ProcessFlowImportNodesInner addChildrenItem(Integer childrenItem) {
    if (this.children == null || !this.children.isPresent()) {
      this.children = JsonNullable.of(new ArrayList<>());
    }
    this.children.get().add(childrenItem);
    return this;
  }

  /**
   * Get children
   * @return children
   */
  
  @Schema(name = "children", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("children")
  public JsonNullable<List<Integer>> getChildren() {
    return children;
  }

  public void setChildren(JsonNullable<List<Integer>> children) {
    this.children = children;
  }

  public ProcessFlowImportNodesInner state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @NotNull 
  @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ProcessFlowImportNodesInner stateText(String stateText) {
    this.stateText = JsonNullable.of(stateText);
    return this;
  }

  /**
   * Get stateText
   * @return stateText
   */
  
  @Schema(name = "stateText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateText")
  public JsonNullable<String> getStateText() {
    return stateText;
  }

  public void setStateText(JsonNullable<String> stateText) {
    this.stateText = stateText;
  }

  public ProcessFlowImportNodesInner focused(@Nullable Boolean focused) {
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

  public ProcessFlowImportNodesInner texts(List<String> texts) {
    this.texts = texts;
    return this;
  }

  public ProcessFlowImportNodesInner addTextsItem(String textsItem) {
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
  
  @Schema(name = "texts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProcessFlowImportNodesInner processFlowImportNodesInner = (ProcessFlowImportNodesInner) o;
    return Objects.equals(this.id, processFlowImportNodesInner.id) &&
        Objects.equals(this.lane, processFlowImportNodesInner.lane) &&
        Objects.equals(this.title, processFlowImportNodesInner.title) &&
        Objects.equals(this.titleAbbreviation, processFlowImportNodesInner.titleAbbreviation) &&
        equalsNullable(this.children, processFlowImportNodesInner.children) &&
        Objects.equals(this.state, processFlowImportNodesInner.state) &&
        equalsNullable(this.stateText, processFlowImportNodesInner.stateText) &&
        Objects.equals(this.focused, processFlowImportNodesInner.focused) &&
        Objects.equals(this.texts, processFlowImportNodesInner.texts);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lane, title, titleAbbreviation, hashCodeNullable(children), state, hashCodeNullable(stateText), focused, texts);
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
    sb.append("class ProcessFlowImportNodesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lane: ").append(toIndentedString(lane)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAbbreviation: ").append(toIndentedString(titleAbbreviation)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateText: ").append(toIndentedString(stateText)).append("\n");
    sb.append("    focused: ").append(toIndentedString(focused)).append("\n");
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

