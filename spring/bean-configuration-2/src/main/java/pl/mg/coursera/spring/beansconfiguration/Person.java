package pl.mg.coursera.spring.beansconfiguration;

public class Person {

    private int id;
    private String name;
    private int taxId;

    public Person(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Person() {

    }

    public String speak() {
        return "Hello";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + "]";
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }
}
