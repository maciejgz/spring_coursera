package pl.mg.coursera.spring.beansconfiguration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jungle {

    private Animal largest;
    private List<Animal> animals;
    private Map<String, String> foods = new HashMap<String, String>();

    public Animal getLargest() {
        return largest;
    }

    public void setLargest(Animal largest) {
        this.largest = largest;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Jungle [largest=" + largest + ", animals=" + animals + ", foods=" + foods + "]";
    }

    public Map<String, String> getFoods() {
        return foods;
    }

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

}
