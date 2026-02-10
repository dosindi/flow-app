package com.dun.open_process_flow.api;

import com.dun.open_process_flow.model.Error;
import com.dun.open_process_flow.model.LaneInput;
import com.dun.open_process_flow.model.LanesGet200Response;
import com.dun.open_process_flow.model.LanesIdDelete200Response;
import com.dun.open_process_flow.model.LanesIdGet200Response;
import com.dun.open_process_flow.model.LanesIdPut200Response;
import com.dun.open_process_flow.model.LanesPost201Response;
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
public class LanesApiController implements LanesApi {

    private final LanesApiDelegate delegate;

    public LanesApiController(@Autowired(required = false) LanesApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new LanesApiDelegate() {});
    }

    @Override
    public LanesApiDelegate getDelegate() {
        return delegate;
    }

}
