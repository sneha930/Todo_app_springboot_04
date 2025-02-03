package com.lcwd.first.couple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class Samosa {

    String name;

    public Samosa(String name) {
        this.name= name;
    }

    public void eat() {
        System.out.println("Wow samosa is spicy");
        System.out.println(name);
    }
}
