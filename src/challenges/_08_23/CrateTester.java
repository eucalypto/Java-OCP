package challenges._08_23;

import challenges._08_23.beverages.Beer;
import challenges._08_23.bottles.Bottle;

public class CrateTester {
    public static void main(String[] args) {
        Crate<Bottle<Beer>> beercrate = new Crate<>(24);
        System.out.println(beercrate);
    }
}
