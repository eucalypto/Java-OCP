package daily._09_06.pizza;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Pizza> orders = new ArrayList<>();


    public void takeOrder(Pizza pizza) {
        System.out.println("Taking order for " + pizza);
    }

    void giveOrderToChef(Cook cook, Pizza pizza) {

    }

    public void procrastinate() {
        System.out.println("Manager is enjoying their time.");
    }
}
