package com.example.demo1.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) throws IOException {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        UserService userService = context.getBean(UserService.class);
//        User user = userService.login("bob@example.com", "password");
//        System.out.println(user.getName());
        //@Autowired
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
         ReadResourceService readResourceService = applicationContext.getBean(ReadResourceService.class);
        //readResourceService.init();
        readResourceService.print();
    }
}
