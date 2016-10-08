package pl.mg.coursera.spring.autowiring;

public class ConsoleWriter implements LogWriter {

    public void write(String text) {
        System.out.println("console writer: " + text);
    }

}
