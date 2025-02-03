package com.lcwd.first.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Person")
public class Person {

//    Property based injection
    @Autowired
    Animal animal;
    @Autowired
    Student student;
    @Autowired
    @Qualifier("samosa2")
    Samosa samosa;


    public void playWithAnimal() {
        //using animal
        animal.play();
        student.detail();
        samosa.eat();
    }
}
