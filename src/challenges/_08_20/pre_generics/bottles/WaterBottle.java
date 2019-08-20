package challenges._08_20.pre_generics.bottles;

import challenges._08_20.pre_generics.liquids.Water;

public class WaterBottle extends Bottle {
    public WaterBottle() {
        super(1.0, new Water());
    }
}
