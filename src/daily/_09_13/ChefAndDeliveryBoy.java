package daily._09_13;

public class ChefAndDeliveryBoy {
    public static void main(String[] args) {
        PizzaPlace workPlace = new PizzaPlace();

        Thread chef = new Chef("Chef", workPlace);
        Thread deliveryBoy = new DeliveryBoy("Delivery Boy", workPlace);

        chef.start();
        deliveryBoy.start();
    }
}

class PizzaPlace {
    Boolean pizzaReadyForDelivery = false; // new Boolean(false);
    final Object pizzaNotifier = new Object();
    int bakedPizzas = 0;
    boolean jobDone = false;
}

class Chef extends Thread {
    private PizzaPlace workPlace;

    Chef(String name, PizzaPlace workPlace) {
        this.workPlace = workPlace;
        this.setName(name);
    }

    @Override
    public void run() {
        while (workPlace.bakedPizzas < 100) { // TODO set lock also for bakedPizzas or PizzaPlace
            // If a pizza is waiting for delivery, the chef is not allowed to bake the next pizza and must wait
            if (workPlace.pizzaReadyForDelivery) {
                synchronized (workPlace.pizzaNotifier) {
                    try {
                        workPlace.pizzaNotifier.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            // When there is no pizza waiting:
            System.out.println(this.getName() + ": baking pizza " + (workPlace.bakedPizzas + 1));
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Make pizza ready and notify all
            synchronized (workPlace.pizzaNotifier) {
                workPlace.pizzaReadyForDelivery = true;
                workPlace.bakedPizzas++;
                workPlace.pizzaNotifier.notifyAll();
                System.out.println(this.getName() + ": Pizza number " + workPlace.bakedPizzas + " is ready for delivery");
            }
        }
    }
}

class DeliveryBoy extends Thread {
    private PizzaPlace workPlace;
    int pizzaNumber;

    DeliveryBoy(String name, PizzaPlace workPlace) {
        this.workPlace = workPlace;
        this.setName(name);
    }

    @Override
    public void run() {
        while (!workPlace.jobDone) {
            // If no pizza is there yet, the delivery boy has to wait
            if (!workPlace.pizzaReadyForDelivery) {
                // TODO WARNING A diferent thread can do stuff here.
                synchronized (workPlace.pizzaNotifier) {
                    try {
                        workPlace.pizzaNotifier.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            // when there is a pizza waiting:
            // Take pizza and notify all
            synchronized (workPlace.pizzaNotifier) {
                pizzaNumber = workPlace.bakedPizzas;
                System.out.println(this.getName() + ": Going out for delivery of pizza " + pizzaNumber);
                workPlace.pizzaNotifier.notifyAll();
                workPlace.pizzaReadyForDelivery = false;
            }
            // Then go out for delivery:
            deliverPizza(pizzaNumber);
            if (pizzaNumber == 100) workPlace.jobDone = true;
        }
    }

    private void deliverPizza(int pizzaNumber) {
        // Delivery may take between 0 and 4 seconds (randomly)
        int deliveryTime = (int) (Math.random() * 400);
        try {
            sleep(deliveryTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + ": Pizza number " + pizzaNumber + " delivered!");
    }
}



