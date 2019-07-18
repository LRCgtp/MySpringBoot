package com.hand.exam1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class Exam1Application {

    public static void main(String[] args) {
        SpringApplication.run(Exam1Application.class, args);
    }

}
