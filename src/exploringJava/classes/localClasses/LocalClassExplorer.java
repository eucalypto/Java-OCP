package exploringJava.classes.localClasses;

public class LocalClassExplorer {
    public static void main(String[] args) {
        // We can define a full class here in main:

        int numberOfPrey = 4;

        class Canine {
            int numberOfLegs = 4;

            void eat() {
                // numberOfPrey--;
                // Error: local variables referenced from an inner class must be final or effectively final
                System.out.println("We would like to eat some prey but their number is low: " + numberOfPrey);
            }
        } // End of class Canine

        // numberOfPrey = 3;
        // Error:(15, 97) java: local variables referenced from an inner class must
        // be final or effectively final
    }
}
