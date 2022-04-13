package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
@Scope("singleton")
public class Dog implements Pet {
    public void say() {
        System.out.println("Bow-bow");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Class dog: init method");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Class dog: destroy method");
//    }

    public Dog() {
        System.out.println("Dog bean is created");
    }
}