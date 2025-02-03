package com.lcwd.first;

import com.lcwd.first.couple.Animal;
import com.lcwd.first.couple.Person;
import com.lcwd.first.couple.Samosa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
//@ComponentScan(basePackages={"",""})
public class TodoApplication {
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(TodoApplication.class, args);
//		Person personBean = context.getBean(Person.class);
//		you can also get bean with name specified
		Person personBean = context.getBean("Person", Person.class);
		personBean.playWithAnimal();

	}

}
