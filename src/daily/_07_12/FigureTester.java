package daily._07_12;

public class FigureTester {
    public static void main(String[] args) {
        Point center = new Point(1.0, 3.0);
        System.out.println(center);

        Circle circle1 = new Circle(center, 1.0);
        System.out.println(circle1);

        Circle circle2 = new Circle(1.0, 3.0, 2.0);

        Circle[] circles = {circle1, circle2};

        System.out.println(areaSum(circles));

    }


    public static double areaSum(Figure... figures) {
        double result = 0;
        for (Figure figure : figures) {
            result += figure.getArea();
        }
        return result;
    }


}
