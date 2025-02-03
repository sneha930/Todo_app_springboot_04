package com.lcwd.first;

import com.lcwd.first.couple.Animal;
import com.lcwd.first.couple.Person;
import com.lcwd.first.couple.Samosa;
import com.lcwd.first.scope.Pepsi;
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
//		1st request
		Pepsi pepsiBean1 = context.getBean(Pepsi.class);
		System.out.println(pepsiBean1);
//		2nd request
		Pepsi pepsiBean2 = context.getBean(Pepsi.class);
		System.out.println(pepsiBean2);
		pepsiBean1.drink();

	}

}
