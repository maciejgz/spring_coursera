package pl.mg.coursera.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Logger logger = (Logger) context.getBean("logger");
        logger.writeConsole("test");
        logger.writeFile("test");
        
        ((ClassPathXmlApplicationContext) context).close();
    }
}
