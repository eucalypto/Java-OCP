package challenges._09_10;

public class IllegalThreadStateExceptionGenerator {
    public static void main(String[] args) {
            Thread thread = new Thread();
            thread.start();
        try {
            thread.start();
        } catch (IllegalThreadStateException e) {
            e.printStackTrace();
        }
    }
}
