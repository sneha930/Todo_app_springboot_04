package com.lcwd.first.couple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("Cat")
@Component
public class Cat implements Animal {
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
