package com.dun.open_process_flow.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ProcessFlowExport
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class ProcessFlowExport {

  @Valid
  private List<Object> nodes = new ArrayList<>();

  @Valid
  private List<Object> lanes = new ArrayList<>();

  public ProcessFlowExport nodes(List<Object> nodes) {
    this.nodes = nodes;
    return this;
  }

  public ProcessFlowExport addNodesItem(Object nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

  /**
   * Get nodes
   * @return nodes
   */
  
  @Schema(name = "Nodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Nodes")
  public List<Object> getNodes() {
    return nodes;
  }

  public void setNodes(List<Object> nodes) {
    this.nodes = nodes;
  }

  public ProcessFlowExport lanes(List<Object> lanes) {
    this.lanes = lanes;
    return this;
  }

  public ProcessFlowExport addLanesItem(Object lanesItem) {
    if (this.lanes == null) {
      this.lanes = new ArrayList<>();
    }
    this.lanes.add(lanesItem);
    return this;
  }

  /**
   * Get lanes
   * @return lanes
   */
  
  @Schema(name = "Lanes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Lanes")
  public List<Object> getLanes() {
    return lanes;
  }

  public void setLanes(List<Object> lanes) {
    this.lanes = lanes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessFlowExport processFlowExport = (ProcessFlowExport) o;
    return Objects.equals(this.nodes, processFlowExport.nodes) &&
        Objects.equals(this.lanes, processFlowExport.lanes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, lanes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessFlowExport {\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    lanes: ").append(toIndentedString(lanes)).append("\n");
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

