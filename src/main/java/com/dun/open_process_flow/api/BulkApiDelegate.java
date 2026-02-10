package com.dun.open_process_flow.api;

import com.dun.open_process_flow.model.BulkImportPost201Response;
import com.dun.open_process_flow.model.Error;
import com.dun.open_process_flow.model.ProcessFlowExport;
import com.dun.open_process_flow.model.ProcessFlowImport;
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
 * A delegate to be called by the {@link BulkApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:15.048460300+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
public interface BulkApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /bulk/export : Bulk export process flow
     * Exports the complete process flow in JSON format
     *
     * @return Export successful (status code 200)
     *         or Internal server error (status code 500)
     * @see BulkApi#bulkExportGet
     */
    default ResponseEntity<ProcessFlowExport> bulkExportGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Lanes\" : [ \"{}\", \"{}\" ], \"Nodes\" : [ \"{}\", \"{}\" ] }";
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
     * POST /bulk/import : Bulk import process flow
     * Imports a complete process flow from JSON format. This endpoint accepts the same JSON structure as your original file and populates all tables accordingly. 
     *
     * @param processFlowImport  (required)
     * @return Import successful (status code 201)
     *         or Bad request - invalid input (status code 400)
     *         or Internal server error (status code 500)
     * @see BulkApi#bulkImportPost
     */
    default ResponseEntity<BulkImportPost201Response> bulkImportPost(ProcessFlowImport processFlowImport) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"summary\" : { \"lanes_created\" : 6, \"texts_created\" : 14, \"nodes_created\" : 14, \"relationships_created\" : 15 }, \"success\" : true, \"message\" : \"Process flow imported successfully\" }";
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
