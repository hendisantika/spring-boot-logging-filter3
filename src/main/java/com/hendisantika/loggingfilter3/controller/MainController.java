package com.hendisantika.loggingfilter3.controller;

import com.hendisantika.loggingfilter3.repository.StudentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-logging-filter3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/29/23
 * Time: 08:16
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
@Transactional(Transactional.TxType.SUPPORTS)
public class MainController {

    private final StudentRepository studentRepository;
}
