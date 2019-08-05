package exploringJava.exceptions.smallTests;

public class throwT {
    public static void main(String[] args) {
        try {
            System.out.println("try...");
            throw new RuntimeException("try failed. :(");
        } catch (ArrayIndexOutOfBoundsException aiexception) {
            System.out.println("catch...");
            // throw t; // Error: cannot find symbol
        } finally {
            System.out.println("finally...");
        }
    }
}
