package pl.mg.coursera.spring.autowiringannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Logger {

    private ConsoleWriter consoleWriter;
    private FileWriter fileWriter;

    public ConsoleWriter getConsoleWriter() {
        return consoleWriter;
    }

    @Autowired
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    @Autowired
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        consoleWriter.write(text);
    }
    
    @PostConstruct
    public void init() {
        System.out.println("init");
    }
    
    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}
