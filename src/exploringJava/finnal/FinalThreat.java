package exploringJava.finnal;

/**
 * Is the threat of changing a final variable enough for the compiler to complain?
 */
public class FinalThreat {
    private final int finalInt = 0;
    public static void main(String[] args) {
        FinalThreat fthreat = new FinalThreat();
        fthreat.doSomethingUnsuspicious();
    }

    private void doSomethingUnsuspicious() {
        System.out.println("whistle... whistle... [look nervously around]");
    }

    public void setFinalInt(int howAboutThis){
        // this.finalInt = howAboutThis;
        // Error:(18, 13) java: cannot assign a value to final variable finalInt
        // indeed, just this threat is enough, you don't have to go through with it.
    }
}
