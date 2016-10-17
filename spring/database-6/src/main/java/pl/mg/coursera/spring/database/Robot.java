package pl.mg.coursera.spring.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

    private String id = "Default robot";
    private String speech = "hello";

    public void speak() {
        System.out.println(id + ": " + speech);
    }

    public String getId() {
        return id;
    }

    @Autowired
    public void setId(String id) {
        this.id = id;
    }

    public String getSpeech() {
        return speech;
    }

    @Autowired
    public void setSpeech(String speech) {
        this.speech = speech;
    }
}
