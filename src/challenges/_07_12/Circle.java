package challenges._07_12;

public class Circle extends Figure {
    private double radius;
    private double area;
    private double circumference;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
        this.area = 3.14 * radius * radius;
        this.circumference = 2 * 3.14 * radius;
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
        this.area = 3.14 * radius * radius;
        this.circumference = 2 * 3.14 * radius;
    }

    public String toString() {
        return new String("[Center: " + getCenter() + ", area: " + area + ", circumference: " + circumference);
    }

    @Override
    public double getArea() {
        return this.area;
    }


}
