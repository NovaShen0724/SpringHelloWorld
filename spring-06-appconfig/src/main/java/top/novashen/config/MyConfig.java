package top.novashen.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import top.novashen.pojo.User;

@ComponentScan("top.novashen.pojo")
public class MyConfig {
//    @Bean
    public User getUser(){
        return new User();
    }
}
