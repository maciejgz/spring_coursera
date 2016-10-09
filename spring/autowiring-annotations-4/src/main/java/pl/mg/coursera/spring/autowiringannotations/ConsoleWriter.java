package pl.mg.coursera.spring.autowiringannotations;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {

    public void write(String text) {
        System.out.println("console writer: " + text);
    }

}
