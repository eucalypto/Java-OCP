package challenges._08_22;

import challenges._08_20.pre_generics.bottles.BeerBottle;
import challenges._08_20.pre_generics.bottles.Bottle;
import challenges._08_20.pre_generics.bottles.WaterBottle;
import challenges._08_20.pre_generics.liquids.Water;

public class BeverageCrateTester {
    public static void main(String[] args) {
        BeverageCrate beverageCrate1 = new BeverageCrate(24);
        System.out.println("Capacity = " + beverageCrate1.getCapacity());
        System.out.println(beverageCrate1);

        try {
            beverageCrate1.take();
        } catch (BeverageCrate.CrateEmpty crateEmpty) {
            System.out.println("We cannot take a bottle. 88Unfortunately, the crate is empty. :(");
            // crateEmpty.printStackTrace();
        }


        try {
            beverageCrate1.put(new WaterBottle());
            beverageCrate1.put(new BeerBottle());
        } catch (BeverageCrate.CrateFull crateFull) {
            System.out.println("Yay, the crate is already full.");
            // crateFull.printStackTrace();
        }
        System.out.println(beverageCrate1);

        Bottle[] bottles_in_hand = new Bottle[3];
        try {
            bottles_in_hand[0] = beverageCrate1.take();
            bottles_in_hand[1] = beverageCrate1.take();
            bottles_in_hand[2] = beverageCrate1.take();
        } catch (BeverageCrate.CrateEmpty crateEmpty) {
            crateEmpty.printStackTrace();
        }

        for (Bottle bttl : bottles_in_hand) System.out.println(bttl);

    }
}
