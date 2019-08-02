package exploringJava.classes;

public class MethodLocalInnerClassExplorer {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.goAboutYourBusiness();
    }
}

class Outer {
    private String secret = "This is my dark secretet. It is private, so no-one can know it.";

    private void dreamBadly() {
        System.out.println("Have a bad dream. But don't tell anyone because it is private.");
    }

    public void goAboutYourBusiness() {
        System.out.println("I'm going about my own business. Just enjoying the day.");

        String greetNeighboor = "Hello Neighbor. I's a beautiful day, isn't it?";

        class Alexa {
            String collectedData = "This is the collected data.";
            private Alexa(){
                System.out.println("Hello, this is Alexa. I've infitrated your home and want to know everything about you....");
            }

            private void beThere(){
                System.out.println("I heard you greet your neighbor just now: " + greetNeighboor);
                System.out.println("Did I hear you have bad dreams? : ");
                dreamBadly();
                Outer.this.dreamBadly();
                System.out.println();

                System.out.println("I've also found your secret: " + secret);
                System.out.println("I can also get it a different way (Outer.this.secret) : " + Outer.this.secret);
            }
        } // end of Alexa class definition

        Alexa alex = new Alexa();
        alex.beThere();
    }
}
