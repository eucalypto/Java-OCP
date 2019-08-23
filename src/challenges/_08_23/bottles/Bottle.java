package challenges._08_23.bottles;

import challenges._08_23.beverages.Beverage;

public class Bottle<BeverageT extends Beverage> {
    private BeverageT content;
    private double capactiy;

    public Bottle(BeverageT content, double capactiy) {
        this.content = content;
        this.capactiy = capactiy;
    }

    public void fill(BeverageT beverage) {
        this.content = beverage;
        System.out.println("Filled Bottle with " + beverage);
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "content=" + content +
                ", capactiy=" + capactiy +
                '}';
    }
}
