package daily._08_26;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Objects;

public class Appartment implements Serializable, Comparable<Appartment> {
    private double area;
    private double price;
    private int numberOfRooms;
    private String zipcode;


    public Appartment(double area, double price, int numberOfRooms, String zipcode) {
        this.area = area;
        this.price = price;
        this.numberOfRooms = numberOfRooms;
        this.zipcode = zipcode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appartment)) return false;
        Appartment that = (Appartment) o;
        return Double.compare(that.area, area) == 0 &&
                Double.compare(that.price, price) == 0 &&
                numberOfRooms == that.numberOfRooms &&
                Objects.equals(zipcode, that.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipcode);
    }

    // Getters:
    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public String getZipcode() {
        return zipcode;
    }

    @Override
    public int compareTo(@NotNull Appartment o) {
        double thisArea = this.getArea();
        double otherArea = o.getArea();

        // if (thisArea < otherArea ) return

        return 1;
    }
}
