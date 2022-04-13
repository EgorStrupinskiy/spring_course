package spring_introduction;
import org.springframework.stereotype.Component;


public class Dog implements Pet {
    public void say() {
        System.out.println("Bow-bow");
    }
    public Dog() {
        System.out.println("Dog bean is created");
    }
}