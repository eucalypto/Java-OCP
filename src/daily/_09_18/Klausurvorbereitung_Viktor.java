package daily._09_18;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1.1. Nenne alle Regeln , die beim überschreiben einer Methode zu beachten sind
 * <p>
 * - signatur gleich:
 * - methoden-name
 * - parameterliste
 * - keine engere zugriffsberechtigung (private, ...)
 * - keine neue oder höhere checked Exception
 * - kovarianter Rückgabewert: er muss selbe oder extended klasse vom originalen sein
 * <p>
 * 1.2.  Wenn eine Klasse eine Methode mehr mals definiert hat (Overloading), welche schritte geht der Compiler
 * um die richtige Methode auszuführen für einen gegebenen Methodenaufruf (Overload Resolution)?
 * <p>
 * - exakter match
 * - primitive widening byte -> int
 * - widening um geringsten betrag:
 * byte -> int VOR byte -> long
 * - nächste polymorphische oberklasse (widening)
 * - autoboxing (kam erst in später java version)
 * - unboxing Integer to int BEFORE widening Integer -> Object
 * - widening byte -> int BEFORE autoboxing byte -> Byte
 * - varargs
 * <p>
 * 1.3. Gebe vereinfachte Codefragmente, die folgende RuntimeException / Error auslösen
 * <p>
 * a. IllegalThreadStateExcetion
 * b. StackOverflowError
 * c. IllegalMonitorStateException
 * D. AssertionError
 * <p>
 * 1.4. Erstelle eine demonstrative generische Klasse mit Typ-Einschränkung und ermittle den zugehörigen
 * "Raw-Type" durch "type erasure". Außerdem gebe ein beispielhafter Aufruf!
 * <p>
 * -Die Klasse soll mindestens ein Attribute haben, die durch den Parametertyp typisiert ist
 * <p>
 * siehe DogDayCare
 * <p>
 * <p>
 * 1.5 Erstelle eine generische Methode (Hier geht es nur um die Notation)
 * <p>
 * public static <T> T genericMethod(T input) {return input;}
 * <p>
 * 1.6 Erstelle eine Funktionale Interface. Die Schnittstelle soll sowohl statische als auch default Methode
 * besitzen. Außerdem Instanziere den Interface mittels Lambda Expression
 * <p>
 * Siehe GuardingTester, Guarding
 */
public class Klausurvorbereitung_Viktor {

    public static void main(String[] args) {
        // throwIllegalThreadStateException();
        // throwStackOverflowError();
        // throwIllegalMonitorStateException();
        // throwAssertionError();
        TestDogDayCare.run();
        // GuardingTester.run();
    }

    static void throwIllegalThreadStateException() {
        Thread thread = new Thread();
        thread.start();
        thread.start();
    }

    static void throwStackOverflowError() {
        class Recursive {
            void oneMoreTime() {
                oneMoreTime();
            }
        }

        new Recursive().oneMoreTime();
    }


    static void throwIllegalMonitorStateException() {
        Lock lock = new ReentrantLock();
        lock.unlock();
    }

    static void throwAssertionError() {
        assert (false);
    }


    public static <T> T genericMethod(T input) {
        T tempObject = input;
        // Do something with tempobject....

        return tempObject;
    }
}


class TestDogDayCare {
    static void run() {
        Mammal mammal = new Mammal();
        Dog dog = new Dog();
        GoldenRetriever goldenRetriever = new GoldenRetriever();
        Husky husky = new Husky();
        HuskyPuppy huskyPuppy = new HuskyPuppy();

        DogDayCare<Husky> dogDayCareHuskies = new DogDayCare<>(husky);
        System.out.println(dogDayCareHuskies.getDog());
        dogDayCareHuskies.setDog(huskyPuppy);
        System.out.println(dogDayCareHuskies.getDog());
        // dogDayCareHuskies.setDog(goldenRetriever);
        // Error: java: incompatible types: daily._09_18.GoldenRetriever cannot be converted to daily._09_18.Husky


        DogDayCare dogDayCare = new DogDayCare(husky);
        System.out.println(dogDayCare.getClass());
        System.out.println(dogDayCare.getDog());
        dogDayCare.setDog(goldenRetriever);
        System.out.println(dogDayCare.getDog());

        // DogDayCare<Cat> dogDayCareCat = new DogDayCare<Cat>();
        // java: type argument daily._09_18.Cat is not within bounds of type-variable T
    }
}


/**
 * This class takes care of Dogs
 */
class DogDayCare<T extends Dog> {
    private T dog;

    DogDayCare(T dog) {
        this.dog = dog;
    }

    T getDog() {
        return dog;
    }

    void setDog(T dog) {
        this.dog = dog;
    }
}

class Mammal {
}

class Dog extends Mammal {
}

class GoldenRetriever extends Dog {
}

class Husky extends Dog {
}

class HuskyPuppy extends Husky {
}

class Cat extends Mammal {
}

class Kitten extends Cat {
}

// -----------------------------------------------------------------------
// Functional interface

class GuardingTester {
    static void run() {
        class GuardDog extends Dog implements Guarding {

            @Override
            public void barkAtStrangers() {
                System.out.println("Woof, Woof!");
            }
        }

        GuardDog guardDog1 = new GuardDog();
        guardDog1.patrolTheArea();
        guardDog1.barkAtStrangers();

        Guarding guardDog2 = () -> System.out.println("Bark, Bark!");
        guardDog2.patrolTheArea();
        guardDog2.barkAtStrangers();

        Guarding.joinForces(guardDog1, guardDog2);


    }
}

@FunctionalInterface
interface Guarding {
    void barkAtStrangers();

    default void patrolTheArea() {
        System.out.println("I'm patrolling the area to look for burglars.");
    }

    default String getname() {
        return "I have no name because I am just a guarding dog.";
    }

    static void joinForces(Guarding guard1, Guarding guard2) {
        System.out.println("We , " + guard1.getname() + ", and " + guard2.getname() + ", are joining forces and make a team");
    }
}


