package pl.mg.coursera.spring.autowiringannotations;

public class ConsoleWriter implements LogWriter {

    public void write(String text) {
        System.out.println("console writer: " + text);
    }

}
