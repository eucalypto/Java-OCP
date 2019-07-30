package exploringJava.exceptions;

public class HowManyExceptions {
    public static void main(String[] args) {
        System.out.println("oustide of try");
        try {
            System.out.println("inside of try");
            throw new IllegalArgumentException();
        } finally {
            System.out.println("We don't catch no Exceptions!");
            if (true) throw new NullPointerException();
            throw new StackOverflowError();
            // Compiler error: unreachable statement. The compiler sees that a NullPointerException is thrown above so that this Exception can never be thrown.
            // But we can trick the compiler with if (true) ;D


            // Result: You can throw as many Exceptions (Throwables) as you like but only the last thrown counts!
        }
    }
}
