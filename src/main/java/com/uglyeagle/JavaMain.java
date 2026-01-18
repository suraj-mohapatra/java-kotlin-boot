package com.uglyeagle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaMain {

    public static void main(String[] args) {
        SpringApplication.run(JavaMain.class, args);
        System.out.println("started in JavaMain");
    }

}
