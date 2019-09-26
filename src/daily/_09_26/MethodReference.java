package daily._09_26;

public class MethodReference {
    public static void main(String[] args) {
        DoSomething something1 = Mammal::breathe;
        something1.something();

        // DoSomething something2 = Mammal::makeNoise;
        // Does not work: makeNoise is called from static context


    }
}

class Mammal {
    void makeNoise() {
        System.out.println("Make indistinct noise");
    }

    static void breathe() {
        System.out.println("Mammal Breathing");
    }

    static void doSomething(DoSomething doSomething) {
        doSomething.something();
    }
}


@FunctionalInterface
interface DoSomething {
    void something();
}
