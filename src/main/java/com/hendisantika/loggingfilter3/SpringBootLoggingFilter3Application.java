package com.hendisantika.loggingfilter3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringBootLoggingFilter3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLoggingFilter3Application.class, args);
    }

}
