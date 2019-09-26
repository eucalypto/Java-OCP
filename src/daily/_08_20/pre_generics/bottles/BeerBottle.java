package daily._08_20.pre_generics.bottles;

import daily._08_20.pre_generics.liquids.Beer;

public class BeerBottle extends Bottle {
    public BeerBottle() {
        super(0.5, new Beer());
    }
}
