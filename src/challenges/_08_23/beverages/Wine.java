package challenges._08_23.beverages;

public class Wine extends Beverage {
    String region;
    String sort;

    public Wine(String brand, boolean isSweet, boolean hasAlcohol, String region, String sort) {
        super(brand, isSweet, hasAlcohol);
        this.region = region;
        this.sort = sort;
    }
}
