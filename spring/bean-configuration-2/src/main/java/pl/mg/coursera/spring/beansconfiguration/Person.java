package pl.mg.coursera.spring.beansconfiguration;

public class Person {

    private int id;
    private String name;
    private int taxId;
    private Address address;

    public Person(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * factory method
     */
    public static Person getInstance(int id, String name) {
        System.out.println("person factory method creating object...");
        Person person = new Person();
        person.id = id;
        person.name = name;
        return person;
    }

    public void onCreate() {
        System.out.println("person onCreate");
    }

    public void onDestroy() {
        System.out.println("person onDestroy");
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
        return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
