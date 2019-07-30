package exploringJava.exceptions;

public class GracefulException {
    /*
    What parts are executed when we throw an exception?
    */

    private static void print(String str) {
        System.out.println(str);
    }


    /*
    When is the finally block executed?
    */
    private static void whenToFinal() {
        try {
            print("In try block");
            // We throw a RuntimeException
            throw new IndexOutOfBoundsException();
        } catch (RuntimeException e) { // here we catch the exception
            print("Caught RuntimeExcption!");
            // But we throw another RuntimeException in the catch block
            if (true) throw new NullPointerException();
        } finally {
            // Finally is still executed, in spite of a catch block throwing an exception.
            print("This is the finally block");
        }

        // This part is never executed. And the compiler is clever enough to complain when it sees that the catch block always throws a RuntimeException. This is why we had to trick it with if (true).
        print("After try block");
    }

    public static void main(String[] args) {
        whenToFinal();
    }
}
