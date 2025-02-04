package com.lcwd.first.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "lcwd.config")
@Component
public class LCWDConfig {
    private String name;
    private String email;
    private String password;
    private String emailExpTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailExpTime() {
        return emailExpTime;
    }

    public void setEmailExpTime(String emailExpTime) {
        this.emailExpTime = emailExpTime;
    }

    @Override
    public String toString() {
        return "LCWDConfig{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", emailExpTime='" + emailExpTime + '\'' +
                '}';
    }
}
