package pl.mg.coursera.spring.autowiring;

public class FileWriter implements LogWriter {

    public void write(String text) {
        System.out.println("file writer: " + text);
    }

}
