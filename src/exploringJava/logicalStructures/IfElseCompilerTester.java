package exploringJava.logicalStructures;

public class IfElseCompilerTester {

    /*
     * Let's see if the compiler is clever enough to see through this bamboozle.
     */
    public static void main(String[] args) {
        if (true) System.out.println("This should always be printed");
        else System.out.println("This should never be printed");

        if (false) System.out.println("If you see this, something is wrong.");
    }
    /*
     * Output:
     *   This should always be printed
     *
     * Also, the Inspector of IDEA complains at if(true) and if (false) saying
     * "condition is always false".
     */

}
