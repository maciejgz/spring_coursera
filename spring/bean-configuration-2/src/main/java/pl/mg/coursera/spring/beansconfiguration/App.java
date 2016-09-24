package pl.mg.coursera.spring.beansconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person1 = (Person) context.getBean("person1");
        Person person2 = (Person) context.getBean("person2");

        System.out.println(person1.toString());
        System.out.println(person2.toString());

        ((ClassPathXmlApplicationContext) context).close();

    }
}
