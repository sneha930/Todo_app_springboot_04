package com.lcwd.first.couple;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student() {
        System.out.println("Creating Student");
    }

    public void detail() {
        System.out.println("Student details");
    }
}
