package com.lcwd.first.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("student5")
public class Student {
    public Student() {
        System.out.println("Creating student");
    }

    @PostConstruct
    public void created() {
        System.out.println("Student bean is created()");
    }

    @PreDestroy
    public void predestroy() {
        System.out.println("bye. have a great future");
    }
}
