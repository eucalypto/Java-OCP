package daily._08_23.beverages;

public class Beer extends Beverage {
    String beerType;

    public Beer(String brand, boolean isSweet, boolean hasAlcohol, String beerType) {
        super(brand, isSweet, hasAlcohol);
        this.beerType = beerType;
    }

}
