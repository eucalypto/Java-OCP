package daily._09_06.pizza;

public class Pizza {
    String pizzatype;
    Boolean isBaked = false;
    Boolean isInBox = false;

    public Pizza(String pizzatype) {
        this.pizzatype = pizzatype;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzatype='" + pizzatype + '\'' +
                '}';
    }
}
