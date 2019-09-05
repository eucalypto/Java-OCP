package exploringJava.classes.interfaces;

public class InstantiateInterfaceWithLambda {
    public static void main(String[] args) {
        MyInterface myinterface = () -> System.out.println("Does this work?");
        myinterface.doStuff();
        System.out.println(myinterface.getClass());
    }
}

@FunctionalInterface
interface MyInterface {
    void doStuff();
}
