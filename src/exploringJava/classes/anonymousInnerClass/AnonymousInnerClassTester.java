package exploringJava.classes.anonymousInnerClass;

public class AnonymousInnerClassTester {
    public static void main(String[] args) {
        Duck duck = new Duck();

        throwInWater(duck);

        System.out.println();

        throwInWater(new Floating() {

            @Override
            public void doFloat() {
                System.out.println("This is an undefined object. But it does float somehow.");
            }
        });

        // The inspector says the previous call of throwInWater() can be replaced with
        // this lambda:
        throwInWater(() -> System.out.println("This is an undefined object. But it does float somehow."));


        System.out.println();

        // throwInWater(new Integer implements Floating (){ });
        // anonymous classes can't "implement" interfaces. But they can inherit from a
        // single class or interface directly
    }

    interface Floating {
        void doFloat();
    }


    private static void throwInWater(Floating fl) {
        System.out.println("Throw object in water, how does it float?");
        fl.doFloat();
    }

    static class Duck implements Floating {

        @Override
        public void doFloat() {
            System.out.println("A duck floats naturally. It has an extraordinary buoyancy.");
        }
    }
}
