package challenges._08_22;

import challenges._08_20.pre_generics.bottles.BeerBottle;
import challenges._08_20.pre_generics.bottles.WaterBottle;

public class CrateTester {
    public static void main(String[] args) {
        Crate<BeerBottle> beercrate = new Crate<>(24);
        System.out.println(beercrate.getCapacity());

        beercrate.put(new BeerBottle());
        System.out.println(beercrate.take());
        // System.out.println(beercrate.take()); // throws CrateEmpty

        // beercrate.put(new WaterBottle());
          // Compiler error: can't convert WaterBottle to BeerBottle

    }
}
