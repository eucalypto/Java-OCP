package exploringJava.classes.interfaces;


/**
 * This file is trying to find out if a default implementation of a method in an
 * interface will be accepted by an abstract class that requires the same method to
 * be implemented.
 * <p>
 * Turns out: no. If an abstract class requires a method to be overwritten by making it
 * abstract, the concrete class must implement this method even if it implements an
 * interface that already gives a default implementation.
 */
public class IsDefaultSatisfying {
    public static void main(String[] args) {
        LetsSee see = new LetsSee();
        see.makeNoise();
    }
}


interface IsThisEnough {
    default void makeNoise() {
        System.out.println("Is this enough to satisfy your abstract needs?");
    }
}

abstract class NeedToMakeNoise {
    abstract void makeNoise();
}

// class LetsSee extends NeedToMakeNoise implements IsThisEnough {}
// Error:(21, 1) java: exploringJava.classes.interfaces.LetsSee is not abstract and
// does not override abstract method makeNoise() in exploringJava.classes.interfaces
// .NeedToMakeNoise

class LetsSee extends NeedToMakeNoise implements IsThisEnough {

    @Override
    public void makeNoise() {
        System.out.println("NeedToMakeNoise, if you insist, I will implement this method. Even if it is already implemented in the interface I implement. :(");
    }
}
