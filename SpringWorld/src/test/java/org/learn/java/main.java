package org.learn.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {

        /*ClassB b = new ClassB();
        ClassA a = new ClassA();
        b.setA(a);
        System.out.println(b.getA().msg());*/

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        ClassB b = context.getBean(ClassB.class);   // Getting bean by class...
        System.out.println(b.getA().msg());

        ClassB b1 = (ClassB) context.getBean("ourBestBean");    // Getting bean by name...
        System.out.println(b1.getId());


        /*System.out.println(b.getId());

        ClassB b1 = context.getBean(ClassB.class);
        b1.setId(2020);
        System.out.println(b1.getId());
        System.out.println(b.getId());*/

        ((AnnotationConfigApplicationContext) context).close();
    }
}
