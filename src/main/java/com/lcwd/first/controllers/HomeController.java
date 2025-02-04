package com.lcwd.first.controllers;

import com.lcwd.first.config.LCWDConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// we can send data directly in response by using  @RestController
@RestController
public class HomeController {

    @Value("${lcwd.profile.image.path}")
    private String profilePath;

    @Autowired
    private LCWDConfig lcwdConfig;

    //when this url will be fired method will be called
    @RequestMapping("/todos")
    public List<String> justTest() {
        List<String> todos = Arrays.asList("React", "Spring boot", "Develope project");
        return todos;
    }

    @RequestMapping("/profile-path")
    public String getProfilePath() {
        return this.profilePath;
    }

    @RequestMapping("/lcwd-config")
    public LCWDConfig getLcwdConfig() {
        System.out.println(this.lcwdConfig);
        return this.lcwdConfig;
    }
}
