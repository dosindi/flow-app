package com.dun.open_process_flow.model;

import java.net.URI;
import java.util.Objects;
import com.dun.open_process_flow.model.ProcessFlowImportLanesInner;
import com.dun.open_process_flow.model.ProcessFlowImportNodesInner;
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
 * ProcessFlowImport
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public class ProcessFlowImport {

  @Valid
  private List<@Valid ProcessFlowImportNodesInner> nodes = new ArrayList<>();

  @Valid
  private List<@Valid ProcessFlowImportLanesInner> lanes = new ArrayList<>();

  public ProcessFlowImport() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProcessFlowImport(List<@Valid ProcessFlowImportNodesInner> nodes, List<@Valid ProcessFlowImportLanesInner> lanes) {
    this.nodes = nodes;
    this.lanes = lanes;
  }

  public ProcessFlowImport nodes(List<@Valid ProcessFlowImportNodesInner> nodes) {
    this.nodes = nodes;
    return this;
  }

  public ProcessFlowImport addNodesItem(ProcessFlowImportNodesInner nodesItem) {
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
  @NotNull @Valid 
  @Schema(name = "Nodes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Nodes")
  public List<@Valid ProcessFlowImportNodesInner> getNodes() {
    return nodes;
  }

  public void setNodes(List<@Valid ProcessFlowImportNodesInner> nodes) {
    this.nodes = nodes;
  }

  public ProcessFlowImport lanes(List<@Valid ProcessFlowImportLanesInner> lanes) {
    this.lanes = lanes;
    return this;
  }

  public ProcessFlowImport addLanesItem(ProcessFlowImportLanesInner lanesItem) {
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
  @NotNull @Valid 
  @Schema(name = "Lanes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Lanes")
  public List<@Valid ProcessFlowImportLanesInner> getLanes() {
    return lanes;
  }

  public void setLanes(List<@Valid ProcessFlowImportLanesInner> lanes) {
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
    ProcessFlowImport processFlowImport = (ProcessFlowImport) o;
    return Objects.equals(this.nodes, processFlowImport.nodes) &&
        Objects.equals(this.lanes, processFlowImport.lanes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, lanes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessFlowImport {\n");
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

