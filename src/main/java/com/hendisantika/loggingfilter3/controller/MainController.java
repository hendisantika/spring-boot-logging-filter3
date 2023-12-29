package com.hendisantika.loggingfilter3.controller;

import com.hendisantika.loggingfilter3.entity.Student;
import com.hendisantika.loggingfilter3.repository.StudentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@Slf4j
@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
@Transactional(Transactional.TxType.SUPPORTS)
public class MainController {

    private final StudentRepository studentRepository;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        log.info("Student: " + student);
        return studentRepository.save(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @PutMapping
    @Transactional(rollbackOn = Exception.class)
    public Student updateStudentAddress(@RequestParam("address") String address, @RequestParam("id") Integer id) {
        studentRepository.updateAddressById(address, id);
        return studentRepository.getById(id);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteStudent(@RequestParam("Id") Integer Id) {
        studentRepository.deleteById(Id);
        Boolean studentExists = studentRepository.existsById(Id);
        if (!studentExists) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
