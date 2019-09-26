package daily._08_23.beverages;

public abstract class Beverage {
    String brand;
    boolean isSweet;
    boolean hasAlcohol;

    public Beverage(String brand, boolean isSweet, boolean hasAlcohol) {
        this.brand = brand;
        this.isSweet = isSweet;
        this.hasAlcohol = hasAlcohol;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
