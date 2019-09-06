package challenges._09_06.pizza;

public class Day {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Chef chef = new Chef();

        Thread managerThread = new Thread(() ->
        {
            Pizza pizzaOrder = new Pizza("Pepperoni with extra cheese");
            manager.takeOrder(pizzaOrder);
            manager.giveOrderToChef(chef, pizzaOrder);
            manager.procrastinate();
        });


        Thread chefThread = new Thread(() ->
        {

        });

    }
}
