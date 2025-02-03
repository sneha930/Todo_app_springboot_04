package com.lcwd.first.config;

import com.lcwd.first.couple.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//using @configuration annotation so that we can create beans using @Bean annotation and create our own configurations
public class MyConfig {
    //	declaring the bean using @Bean
    @Bean(name = "samosa1")
//	@Primary
    public Samosa getSamosa1() {
        return new Samosa("Simple samosa");
    }

    @Bean(name = "samosa2")
    public Samosa getSamosa2() {
        return new Samosa("Tandoori samosa");
    }
}
