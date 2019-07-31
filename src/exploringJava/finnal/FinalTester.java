package exploringJava.finnal;

/**
 * What things can we make final until the compiler complains?
 */
public class FinalTester {
    public static void main(String[] args) {
        System.out.println("hello finally");
        System.out.println("3 + 4 = " + addints(3,4));
    }

    /**
     * This final declaration is fine by the compiler. The inspector suggests it be removed. But it also says
     * that this final would prevent subclasses from definining the same static method "hiding".
     */
//    public final static int addints(int i1, int i2) {
    public static int addints(int i1, int i2) {
        return i1+i2;
    }
}

class FinalTesterTester extends FinalTester {
    public final static int addints(int i1, int i2) {
        return i1+i2;
    }
}
