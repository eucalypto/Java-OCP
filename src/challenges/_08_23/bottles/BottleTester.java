package challenges._08_23.bottles;

import challenges._08_23.beverages.Beer;
import challenges._08_23.beverages.Wine;

public class BottleTester {
    public static void main(String[] args) {
        Beer paulaner = new Beer("Pulaner", false, true, "Helles");
        Bottle<Beer> beerbottle = new Bottle<>(paulaner, 0.5);
        System.out.println(beerbottle);

        Wine wine1 = new Wine("Generic Brand", false, true, "generic region", "white wine");
        Bottle<Wine> wineBottle = new Bottle<>(wine1, 0.75);
        System.out.println(wineBottle);

        Beer augustiner = new Beer("Augustiner", false, true, "Helles");
        beerbottle.fill(augustiner);
        System.out.println(beerbottle);
        // beerbottle.fill(wine1);
        // Error:(19, 25) java: incompatible types: challenges._08_23.beverages.Wine cannot be converted to challenges._08_23.beverages.Beer


    }
}
