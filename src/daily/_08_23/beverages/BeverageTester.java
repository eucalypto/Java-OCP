package daily._08_23.beverages;

public class BeverageTester {
    public static void main(String[] args) {
        Beverage beer = new Beer("Paulaner", false, true, "Weißbier");
        System.out.println("beer = " + beer);

        Beverage wine = new Wine("Goldkäppchen", true, true, "Provence du Champagne", "red wine");
        System.out.println("wine = " + wine);

    }
}
