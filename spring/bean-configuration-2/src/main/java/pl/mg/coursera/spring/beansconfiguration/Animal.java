package pl.mg.coursera.spring.beansconfiguration;

public class Animal {

    private String name;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String namel) {
        this.name = namel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal [namel=" + name + ", type=" + type + "]";
    }

}
