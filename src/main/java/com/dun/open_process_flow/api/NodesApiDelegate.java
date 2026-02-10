package com.dun.open_process_flow.api;

import com.dun.open_process_flow.model.Error;
import com.dun.open_process_flow.model.NodeInput;
import com.dun.open_process_flow.model.NodesGet200Response;
import com.dun.open_process_flow.model.NodesIdChildrenChildIdDelete200Response;
import com.dun.open_process_flow.model.NodesIdChildrenGet200Response;
import com.dun.open_process_flow.model.NodesIdChildrenPost201Response;
import com.dun.open_process_flow.model.NodesIdChildrenPostRequest;
import com.dun.open_process_flow.model.NodesIdDelete200Response;
import com.dun.open_process_flow.model.NodesIdGet200Response;
import com.dun.open_process_flow.model.NodesIdPatchRequest;
import com.dun.open_process_flow.model.NodesIdPut200Response;
import com.dun.open_process_flow.model.NodesIdTextsGet200Response;
import com.dun.open_process_flow.model.NodesIdTextsPost201Response;
import com.dun.open_process_flow.model.NodesIdTextsPostRequest;
import com.dun.open_process_flow.model.NodesIdTextsPut200Response;
import com.dun.open_process_flow.model.NodesIdTextsPutRequest;
import com.dun.open_process_flow.model.NodesIdTextsTextIdDelete200Response;
import com.dun.open_process_flow.model.NodesIdTextsTextIdPut200Response;
import com.dun.open_process_flow.model.NodesIdTextsTextIdPutRequest;
import com.dun.open_process_flow.model.NodesPost201Response;
import org.springframework.lang.Nullable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link NodesApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public interface NodesApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /nodes : Get all nodes
     * Retrieves all nodes with optional filtering
     *
     * @param laneId Filter by lane ID (optional)
     * @param state Filter by state (optional)
     * @param focused Filter by focused status (optional)
     * @param includeTexts Include node texts in response (optional, default to false)
     * @param includeChildren Include children relationships (optional, default to false)
     * @return Successful response (status code 200)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesGet
     */
    default ResponseEntity<NodesGet200Response> nodesGet(String laneId,
        String state,
        Boolean focused,
        Boolean includeTexts,
        Boolean includeChildren) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ { \"state_text\" : \"Finished\", \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"title_abbreviation\" : \"MAF\", \"focused\" : false, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"lane_id\" : \"1\", \"id\" : \"10\", \"state\" : \"Positive\", \"title\" : \"Manufacturing: Freezer\" }, { \"state_text\" : \"Finished\", \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"title_abbreviation\" : \"MAF\", \"focused\" : false, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"lane_id\" : \"1\", \"id\" : \"10\", \"state\" : \"Positive\", \"title\" : \"Manufacturing: Freezer\" } ], \"success\" : true, \"count\" : 14 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /nodes/{id}/children/{child_id} : Remove child from node
     * Removes a parent-child relationship
     *
     * @param id Node ID (required)
     * @param childId Child node ID (required)
     * @return Child relationship removed successfully (status code 200)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesIdChildrenChildIdDelete
     */
    default ResponseEntity<NodesIdChildrenChildIdDelete200Response> nodesIdChildrenChildIdDelete(String id,
        String childId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : true, \"message\" : \"Child relationship removed successfully\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /nodes/{id}/children : Get node children
     * Retrieves all children of a specific node
     *
     * @param id Node ID (required)
     * @return Successful response (status code 200)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesIdChildrenGet
     */
    default ResponseEntity<NodesIdChildrenGet200Response> nodesIdChildrenGet(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ { \"child_id\" : \"20\", \"parent_id\" : \"10\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"sequence_order\" : 1 }, { \"child_id\" : \"20\", \"parent_id\" : \"10\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"sequence_order\" : 1 } ], \"success\" : true, \"count\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /nodes/{id}/children : Add child to node
     * Creates a parent-child relationship between nodes
     *
     * @param id Node ID (required)
     * @param nodesIdChildrenPostRequest  (required)
     * @return Child relationship created successfully (status code 201)
     *         or Bad request - invalid input (status code 400)
     *         or Resource not found (status code 404)
     *         or Conflict - resource already exists (status code 409)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesIdChildrenPost
     */
    default ResponseEntity<NodesIdChildrenPost201Response> nodesIdChildrenPost(String id,
        NodesIdChildrenPostRequest nodesIdChildrenPostRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"child_id\" : \"20\", \"parent_id\" : \"10\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"sequence_order\" : 1 }, \"success\" : true, \"message\" : \"Child relationship created successfully\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /nodes/{id}/complete : Get complete node data
     * Retrieves a node with all related data (lane, texts, children)
     *
     * @param id Node ID (required)
     * @return Successful response (status code 200)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesIdCompleteGet
     */
    default ResponseEntity<NodesIdGet200Response> nodesIdCompleteGet(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"state_text\" : \"Finished\", \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"texts\" : [ { \"text_content\" : \"Vaporizer\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 1, \"sequence_order\" : 1, \"node_id\" : \"10\" }, { \"text_content\" : \"Vaporizer\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 1, \"sequence_order\" : 1, \"node_id\" : \"10\" } ], \"children\" : [ \"20\" ], \"title_abbreviation\" : \"MAF\", \"focused\" : false, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"lane_id\" : \"1\", \"id\" : \"10\", \"state\" : \"Positive\", \"title\" : \"Manufacturing: Freezer\", \"lane\" : { \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"icon\" : \"sap-icon://cart-3\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"0\", \"label\" : \"Order\", \"position\" : 0 } }, \"success\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /nodes/{id} : Delete node
     * Deletes a node and all associated data
     *
     * @param id Node ID (required)
     * @return Node deleted successfully (status code 200)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesIdDelete
     */
    default ResponseEntity<NodesIdDelete200Response> nodesIdDelete(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : true, \"message\" : \"Node deleted successfully\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /nodes/{id} : Get node by ID
     * Retrieves a specific node with optional related data
     *
     * @param id Node ID (required)
     * @param includeTexts Include node texts (optional, default to true)
     * @param includeChildren Include children relationships (optional, default to true)
     * @return Successful response (status code 200)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesIdGet
     */
    default ResponseEntity<NodesIdGet200Response> nodesIdGet(String id,
        Boolean includeTexts,
        Boolean includeChildren) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"state_text\" : \"Finished\", \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"texts\" : [ { \"text_content\" : \"Vaporizer\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 1, \"sequence_order\" : 1, \"node_id\" : \"10\" }, { \"text_content\" : \"Vaporizer\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 1, \"sequence_order\" : 1, \"node_id\" : \"10\" } ], \"children\" : [ \"20\" ], \"title_abbreviation\" : \"MAF\", \"focused\" : false, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"lane_id\" : \"1\", \"id\" : \"10\", \"state\" : \"Positive\", \"title\" : \"Manufacturing: Freezer\", \"lane\" : { \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"icon\" : \"sap-icon://cart-3\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"0\", \"label\" : \"Order\", \"position\" : 0 } }, \"success\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /nodes/{id} : Partially update node
     * Updates specific fields of a node
     *
     * @param id Node ID (required)
     * @param nodesIdPatchRequest  (required)
     * @return Node updated successfully (status code 200)
     *         or Bad request - invalid input (status code 400)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesIdPatch
     */
    default ResponseEntity<NodesIdPut200Response> nodesIdPatch(String id,
        NodesIdPatchRequest nodesIdPatchRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"state_text\" : \"Finished\", \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"title_abbreviation\" : \"MAF\", \"focused\" : false, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"lane_id\" : \"1\", \"id\" : \"10\", \"state\" : \"Positive\", \"title\" : \"Manufacturing: Freezer\" }, \"success\" : true, \"message\" : \"Node updated successfully\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /nodes/{id} : Update node
     * Updates an existing node
     *
     * @param id Node ID (required)
     * @param nodeInput  (required)
     * @return Node updated successfully (status code 200)
     *         or Bad request - invalid input (status code 400)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesIdPut
     */
    default ResponseEntity<NodesIdPut200Response> nodesIdPut(String id,
        NodeInput nodeInput) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"state_text\" : \"Finished\", \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"title_abbreviation\" : \"MAF\", \"focused\" : false, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"lane_id\" : \"1\", \"id\" : \"10\", \"state\" : \"Positive\", \"title\" : \"Manufacturing: Freezer\" }, \"success\" : true, \"message\" : \"Node updated successfully\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /nodes/{id}/texts : Get node texts
     * Retrieves all text descriptions for a node
     *
     * @param id Node ID (required)
     * @return Successful response (status code 200)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesIdTextsGet
     */
    default ResponseEntity<NodesIdTextsGet200Response> nodesIdTextsGet(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ { \"text_content\" : \"Vaporizer\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 1, \"sequence_order\" : 1, \"node_id\" : \"10\" }, { \"text_content\" : \"Vaporizer\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 1, \"sequence_order\" : 1, \"node_id\" : \"10\" } ], \"success\" : true, \"count\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /nodes/{id}/texts : Add text to node
     * Adds a new text description to a node
     *
     * @param id Node ID (required)
     * @param nodesIdTextsPostRequest  (required)
     * @return Text added successfully (status code 201)
     *         or Bad request - invalid input (status code 400)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesIdTextsPost
     */
    default ResponseEntity<NodesIdTextsPost201Response> nodesIdTextsPost(String id,
        NodesIdTextsPostRequest nodesIdTextsPostRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"text_content\" : \"Vaporizer\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 1, \"sequence_order\" : 1, \"node_id\" : \"10\" }, \"success\" : true, \"message\" : \"Text added successfully\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /nodes/{id}/texts : Replace all node texts
     * Replaces all existing texts for a node with new ones
     *
     * @param id Node ID (required)
     * @param nodesIdTextsPutRequest  (required)
     * @return Texts replaced successfully (status code 200)
     *         or Bad request - invalid input (status code 400)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesIdTextsPut
     */
    default ResponseEntity<NodesIdTextsPut200Response> nodesIdTextsPut(String id,
        NodesIdTextsPutRequest nodesIdTextsPutRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ { \"text_content\" : \"Vaporizer\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 1, \"sequence_order\" : 1, \"node_id\" : \"10\" }, { \"text_content\" : \"Vaporizer\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 1, \"sequence_order\" : 1, \"node_id\" : \"10\" } ], \"success\" : true, \"message\" : \"Texts replaced successfully\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /nodes/{id}/texts/{text_id} : Delete text
     * Deletes a specific text entry
     *
     * @param id Node ID (required)
     * @param textId Text ID (required)
     * @return Text deleted successfully (status code 200)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesIdTextsTextIdDelete
     */
    default ResponseEntity<NodesIdTextsTextIdDelete200Response> nodesIdTextsTextIdDelete(String id,
        Integer textId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : true, \"message\" : \"Text deleted successfully\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /nodes/{id}/texts/{text_id} : Update text
     * Updates a specific text entry
     *
     * @param id Node ID (required)
     * @param textId Text ID (required)
     * @param nodesIdTextsTextIdPutRequest  (required)
     * @return Text updated successfully (status code 200)
     *         or Bad request - invalid input (status code 400)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesIdTextsTextIdPut
     */
    default ResponseEntity<NodesIdTextsTextIdPut200Response> nodesIdTextsTextIdPut(String id,
        Integer textId,
        NodesIdTextsTextIdPutRequest nodesIdTextsTextIdPutRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"text_content\" : \"Vaporizer\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 1, \"sequence_order\" : 1, \"node_id\" : \"10\" }, \"success\" : true, \"message\" : \"Text updated successfully\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /nodes : Create a new node
     * Creates a new process node
     *
     * @param nodeInput  (required)
     * @return Node created successfully (status code 201)
     *         or Bad request - invalid input (status code 400)
     *         or Conflict - resource already exists (status code 409)
     *         or Internal server error (status code 500)
     * @see NodesApi#nodesPost
     */
    default ResponseEntity<NodesPost201Response> nodesPost(NodeInput nodeInput) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"state_text\" : \"Finished\", \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"title_abbreviation\" : \"MAF\", \"focused\" : false, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"lane_id\" : \"1\", \"id\" : \"10\", \"state\" : \"Positive\", \"title\" : \"Manufacturing: Freezer\" }, \"success\" : true, \"message\" : \"Node created successfully\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : false, \"error\" : { \"code\" : \"VALIDATION_ERROR\", \"details\" : [ \"details\", \"details\" ], \"message\" : \"Invalid input data\" }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
