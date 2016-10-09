package pl.mg.coursera.spring.spel;

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

    // ? - w SPEL oznacza, ze parametr moze byc nullem
    @Autowired
    public void setId(@Value("#{randomText.getText()?.length()}") String id) {
        this.id = id;
    }

    public String getSpeech() {
        return speech;
    }

    @Autowired
    public void setSpeech(@Value("#{randomText.getText()}") String speech) {
        this.speech = speech;
    }
}
