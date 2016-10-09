package pl.mg.coursera.spring.autowiringannotations;

import org.springframework.stereotype.Component;

@Component
public class FileWriter implements LogWriter {

    public void write(String text) {
        System.out.println("file writer: " + text);
    }

}
