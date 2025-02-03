package com.lcwd.first.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Person")
public class Person {

    Animal animal;
    Student student;

    public Animal getAnimal() {
        return animal;
    }

//    using autowired on setter: animal
    @Autowired
    public void setAnimal(Animal animal) {
        System.out.println("Setting animal");
        this.animal = animal;
    }

    public Student getStudent() {
        return student;
    }

    //    using autowired on setter: student
    @Autowired
    public void setStudent(Student student) {
        System.out.println("Setting student");
        this.student = student;
    }

    public void playWithAnimal() {
        //using animal
        animal.play();
        student.detail();
    }
}
