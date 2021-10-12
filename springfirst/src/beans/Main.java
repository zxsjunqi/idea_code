package beans;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("first.xml");
        helloWorld helloWorld=(helloWorld)context.getBean("helloWorld");
        helloWorld.sayHello();
    }
}
