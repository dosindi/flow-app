package com.dun.open_process_flow.api;

import com.dun.open_process_flow.model.Error;
import com.dun.open_process_flow.model.LaneInput;
import com.dun.open_process_flow.model.LanesGet200Response;
import com.dun.open_process_flow.model.LanesIdDelete200Response;
import com.dun.open_process_flow.model.LanesIdGet200Response;
import com.dun.open_process_flow.model.LanesIdPut200Response;
import com.dun.open_process_flow.model.LanesPost201Response;
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
 * A delegate to be called by the {@link LanesApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public interface LanesApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /lanes : Get all lanes
     * Retrieves a list of all lanes ordered by position
     *
     * @param sort Field to sort by (optional, default to position)
     * @return Successful response (status code 200)
     *         or Internal server error (status code 500)
     * @see LanesApi#lanesGet
     */
    default ResponseEntity<LanesGet200Response> lanesGet(String sort) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ { \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"icon\" : \"sap-icon://cart-3\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"0\", \"label\" : \"Order\", \"position\" : 0 }, { \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"icon\" : \"sap-icon://cart-3\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"0\", \"label\" : \"Order\", \"position\" : 0 } ], \"success\" : true, \"count\" : 6 }";
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
     * DELETE /lanes/{id} : Delete lane
     * Deletes a lane and all associated nodes (cascade)
     *
     * @param id Lane ID (required)
     * @return Lane deleted successfully (status code 200)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see LanesApi#lanesIdDelete
     */
    default ResponseEntity<LanesIdDelete200Response> lanesIdDelete(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"success\" : true, \"message\" : \"Lane deleted successfully\" }";
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
     * GET /lanes/{id} : Get lane by ID
     * Retrieves a specific lane by its ID
     *
     * @param id Lane ID (required)
     * @return Successful response (status code 200)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see LanesApi#lanesIdGet
     */
    default ResponseEntity<LanesIdGet200Response> lanesIdGet(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"icon\" : \"sap-icon://cart-3\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"0\", \"label\" : \"Order\", \"position\" : 0 }, \"success\" : true }";
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
     * PUT /lanes/{id} : Update lane
     * Updates an existing lane
     *
     * @param id Lane ID (required)
     * @param laneInput  (required)
     * @return Lane updated successfully (status code 200)
     *         or Bad request - invalid input (status code 400)
     *         or Resource not found (status code 404)
     *         or Internal server error (status code 500)
     * @see LanesApi#lanesIdPut
     */
    default ResponseEntity<LanesIdPut200Response> lanesIdPut(String id,
        LaneInput laneInput) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"icon\" : \"sap-icon://cart-3\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"0\", \"label\" : \"Order\", \"position\" : 0 }, \"success\" : true, \"message\" : \"Lane updated successfully\" }";
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
     * POST /lanes : Create a new lane
     * Creates a new process lane
     *
     * @param laneInput  (required)
     * @return Lane created successfully (status code 201)
     *         or Bad request - invalid input (status code 400)
     *         or Conflict - resource already exists (status code 409)
     *         or Internal server error (status code 500)
     * @see LanesApi#lanesPost
     */
    default ResponseEntity<LanesPost201Response> lanesPost(LaneInput laneInput) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"icon\" : \"sap-icon://cart-3\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"0\", \"label\" : \"Order\", \"position\" : 0 }, \"success\" : true, \"message\" : \"Lane created successfully\" }";
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
