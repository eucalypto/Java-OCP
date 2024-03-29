package daily._08_20.pre_generics;

import daily._08_20.pre_generics.bottles.BeerBottle;
import daily._08_20.pre_generics.bottles.WaterBottle;

public class BottleTester {
    public static void main(String[] args) {
        BeerBottle beerBottle = new BeerBottle();
        beerBottle.fill();
        beerBottle.empty();

        System.out.println();

        WaterBottle waterBottle = new WaterBottle();
        waterBottle.fill();
        waterBottle.empty();
    }
}
