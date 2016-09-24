package pl.mg.coursera.spring.beansconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person.speak());

        Address address = (Address) context.getBean("address");
        System.out.println(person.toString());
        
        
        

    }
}
