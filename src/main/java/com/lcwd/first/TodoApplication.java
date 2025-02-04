package com.lcwd.first;
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

	}

}
