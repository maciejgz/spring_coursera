package pl.mg.coursera.spring.beansconfiguration;

public class PersonFactory {

    public Person createPerson(int id, String name){
        System.out.println("using bean factory to create person");
        return new Person(id, name);
    }
    
}
