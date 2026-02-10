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


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-10T17:34:09.792938700+03:00[Africa/Nairobi]", comments = "Generator version: 7.18.0")
@Controller
@RequestMapping("${openapi.processFlow.base-path:/v1}")
public class NodesApiController implements NodesApi {

    private final NodesApiDelegate delegate;

    public NodesApiController(@Autowired(required = false) NodesApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new NodesApiDelegate() {});
    }

    @Override
    public NodesApiDelegate getDelegate() {
        return delegate;
    }

}
