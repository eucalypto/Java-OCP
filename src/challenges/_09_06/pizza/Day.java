package challenges._09_06.pizza;

public class Day {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Cook cook = new Cook();

        Thread managerThread = new Thread(() ->
        {
            Pizza pizzaOrder = new Pizza("Pepperoni with extra cheese");
            manager.takeOrder(pizzaOrder);
            manager.giveOrderToChef(cook, pizzaOrder);
            manager.procrastinate();
        });


        Thread chefThread = new Thread(() ->
        {

        });

    }
}
