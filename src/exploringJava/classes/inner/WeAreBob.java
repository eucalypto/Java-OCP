package exploringJava.classes.inner;

/**
 * This class explores what happens if you try to name every class "Bob"
 * and how to call each one of them.
 * <p>
 * <p>
 * I really like the new science fiction novel "We are legion (We are Bob)"
 * by Dennis E. Taylor. If you have read it, you understand why I'm connecting
 * it with this example.
 */
public class WeAreBob {
    public static void main(String[] args) {
        // Bob bob1 = new Bob();
        // Error: java: non-static variable this cannot be referenced from
        // a static context
        // Apparently, Bob() references the inner class as a member of
        // WeAreBob

        WeAreBob weAreLegion = new WeAreBob();
        Bob bob1 = weAreLegion.new Bob();

        exploringJava.classes.inner.Bob bob2 = new exploringJava.classes.inner.Bob();
        // When your mom calls you by your full name, you know you're
        // in trouble.

        class Bob {
            Bob() {
                System.out.println("This is method-local Bob created!");
            }
        }

        // What now? Luckily, IDEA helps me with its context-sensitive code
        // completion and does the following when I type "Bob":
        Bob bob3 = new Bob(); // Local class
        WeAreBob.Bob bob4 = new WeAreBob().new Bob(); // inner class
        exploringJava.classes.inner.Bob bob5 = new exploringJava.classes.inner.Bob();

    }

    WeAreBob() {
        System.out.println("A new WeAreBob is created!");
    }

    class Bob {
        Bob() {
            System.out.println("A new inner Bob is created: [...].WeAreBob.Bob");
        }

        // class Bob {}
        // Error:java: class exploringJava.classes.inner.WeAreBob.Bob is
        // already defined in class exploringJava.classes.inner.WeAreBob
    }

}


class Bob {
    Bob() {
        System.out.println("A new independent Bob is created: [...].Bob");
    }
}
