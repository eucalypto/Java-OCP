package exploringJava.dataTypes;

public class Primitives {
    public static void main(String[] args) {
        Double d = new Double(3.14);
        System.out.println(d.isInfinite());
        System.out.println(d.isNaN());
        d = 3.0;
        System.out.println(d.isNaN());
        d = Double.valueOf("Infinity");
        System.out.println("d = " + d);
        d = Double.valueOf("NaN");
        System.out.println("d = " + d);
        System.out.println(d.isNaN());
        Double.isInfinite(d);


        // Character c = new Character("c");
        // Error: incompatible types: java.lang.String cannot be converted to char
        Integer i = new Integer("1324"); // This works


    }
}
