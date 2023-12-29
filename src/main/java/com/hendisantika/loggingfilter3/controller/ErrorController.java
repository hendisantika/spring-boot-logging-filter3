package com.hendisantika.loggingfilter3.controller;

import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
