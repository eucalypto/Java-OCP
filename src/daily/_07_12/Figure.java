package daily._07_12;

public abstract class Figure {
    private Point center = new Point();
    double area;

    public Figure(Point center) {
        this.center.setX(center.getX());
        this.center.setY(center.getY());
    }

    public Figure(double x, double y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    public Point getCenter() {
        return center;
    }

    abstract double getArea();
}
