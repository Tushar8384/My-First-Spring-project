package com.tushar.springpro;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringProApplication {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(SpringProApplication.class, args);

        Student s = context.getBean(Student.class);
        s.study();


    }



}
