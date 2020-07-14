package org.learn.java;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.learn.java")
public class SpringConfig {

    @Bean("ourBestBean")
    @Scope("prototype")
    public ClassB classB(){
        return new ClassB();
    }
    @Bean
    public ClassA classA(){
        return new ClassA();
    }
}
