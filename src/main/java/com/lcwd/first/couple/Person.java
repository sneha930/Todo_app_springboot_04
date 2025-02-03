package com.lcwd.first.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Person")
public class Person {

    Animal animal;
    Student student;

//    Constructor based injection
    @Autowired
    public Person(Animal animal, Student student) {
        System.out.println("Calling constructor autowiring");
        this.animal = animal;
        this.student = student;
    }

    public void playWithAnimal() {
        //using animal
        animal.play();
        student.detail();
    }
}
