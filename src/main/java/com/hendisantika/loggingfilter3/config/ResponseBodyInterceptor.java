package com.hendisantika.loggingfilter3.config;

import com.hendisantika.loggingfilter3.service.LoggingService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.MethodParameter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-logging-filter3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/29/23
 * Time: 08:12
 * To change this template use File | Settings | File Templates.
 */
@ControllerAdvice
@RequiredArgsConstructor
public class ResponseBodyInterceptor implements ResponseBodyAdvice<Object> {

    private final LoggingService loggingService;

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }
}
