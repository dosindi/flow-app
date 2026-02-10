package com.dun.open_process_flow.api;

import com.dun.open_process_flow.model.HealthGet200Response;


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
public class HealthApiController implements HealthApi {

    private final HealthApiDelegate delegate;

    public HealthApiController(@Autowired(required = false) HealthApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new HealthApiDelegate() {});
    }

    @Override
    public HealthApiDelegate getDelegate() {
        return delegate;
    }

}
