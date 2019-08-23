package challenges._08_22.beverages;

public class Water extends Beverage {
    boolean isSparkly;

    public Water(String brand, boolean isSweet, boolean hasAlcohol, boolean isSparkly) {
        super(brand, isSweet, hasAlcohol);
        this.isSparkly = isSparkly;
    }
}
