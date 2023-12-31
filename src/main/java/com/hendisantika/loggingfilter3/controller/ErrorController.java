package com.hendisantika.loggingfilter3.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-logging-filter3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/29/23
 * Time: 08:14
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/error")
public class ErrorController extends AbstractErrorController {

    private final ErrorAttributes errorAttributes;

    public ErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes);
        this.errorAttributes = errorAttributes;
    }

    @Override
    protected Map<String, Object> getErrorAttributes(HttpServletRequest request, ErrorAttributeOptions options) {
        return super.getErrorAttributes(request, options);
    }

    @GetMapping
    public ResponseEntity<Map<String, Object>> handleError(HttpServletRequest request, WebRequest webRequest) {
        Map<String, Object> body = getErrorAttributes(webRequest);
        HttpStatus status = getStatus(request);
        return new ResponseEntity<>(body, status);
    }

    private Map<String, Object> getErrorAttributes(WebRequest webRequest) {
        return this.errorAttributes.getErrorAttributes(webRequest,
                ErrorAttributeOptions.defaults());
    }
}
