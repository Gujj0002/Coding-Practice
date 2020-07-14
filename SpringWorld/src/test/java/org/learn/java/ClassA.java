package org.learn.java;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*@Component*/
public class ClassA {
    @PostConstruct
    public void init() {
        System.out.println("Init method of class A get called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Destroy method of class A get called");
    }

    public String msg() {

        return "Welcome to spring world";
    }
}
