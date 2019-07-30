package exploringJava.tryWithResources;

public class TeachMe {
    public static void main(String[] args) {
        withResources();
    }

    public static void withoutResources() {

    }

    public static void withResources() {
        try (Wood woody = new Wood(); Stones stony = new Stones()) {
            System.out.println("Try to build something");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Finished building, let's go home");
    }
}

class Wood implements AutoCloseable {

    public Wood() {
        System.out.println("Collect wood.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Put leftover wood away.");
    }
}

class Stones implements AutoCloseable {

    public Stones() {
        System.out.println("Collect Stones");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Put leftover stones away into storage.");
    }
}
