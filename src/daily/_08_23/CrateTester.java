package daily._08_23;

import daily._08_23.beverages.Beer;
import daily._08_23.bottles.Bottle;

public class CrateTester {
    public static void main(String[] args) {
        Crate<Bottle<Beer>> beercrate = new Crate<>(24);
        System.out.println(beercrate);
    }
}
