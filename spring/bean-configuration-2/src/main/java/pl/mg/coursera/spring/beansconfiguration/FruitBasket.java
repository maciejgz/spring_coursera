package pl.mg.coursera.spring.beansconfiguration;

import java.util.List;

public class FruitBasket {

    private String name;
    private List<String> fruits;

    public FruitBasket(String name, List<String> fruits) {
        this.name = name;
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        StringBuilder sbBuilder = new StringBuilder();

        sbBuilder.append(name);
        sbBuilder.append(" contains:\n");

        for (String fruit : fruits) {
            sbBuilder.append(fruit);
            sbBuilder.append("\n");
        }
        
        return sbBuilder.toString();
    }
}
