package com.lcwd.first.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Person")
public class Person {

    @Autowired
    @Qualifier("Cat")
    Animal animal;

//    @Autowired
//    public Person(@Qualifier("Dog") Animal animal) {
//        this.animal = animal;
//    }

    public void playWithAnimal() {
        //using animal
        animal.play();
    }
}
