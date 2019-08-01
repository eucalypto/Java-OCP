package exploringJava.classes.extensions;

/**
 * We can access the super class' members via 'super'.
 * But how can we access the members of classes higher up in hierarchy?
 */
public class TheOnesThatCameBeforeUs {
    public static void main(String[] args) {
        new SecondClass().printAllNames();
        new ThirdClass().printAllNames();
    }
}

class FirstClass {
    String name = "FirstClass";
}

class SecondClass extends FirstClass {
    String name = "SecondClass";

    void printAllNames() {
        System.out.println("This name " + this.name);
        System.out.println("Name of super " + super.name);
    }
}

class ThirdClass extends SecondClass {
    String name = "ThirdClass";

    void printAllNames() {
        System.out.println("This name " + this.name);
        System.out.println("Name of super " + super.name);
        // System.out.println("Name of super super class : " + super.super.name);
        // Apparently, accessing the grandparent's field is not possible with super :(

        String abraCadabra = ((FirstClass) this).name;
        System.out.println("Did we achieve this magic trick? : " + abraCadabra);
        // YES!!!
        // Output is: "[...] FirstClass"
        // We can trick the compiler into referencing "this" object with a FirstClass
        // reference that does see the members of the corresponding class!
    }
}
