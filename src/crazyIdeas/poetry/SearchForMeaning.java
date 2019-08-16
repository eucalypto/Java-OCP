package crazyIdeas.poetry;

/**
 * This is a poem in code form. Maybe more a short story than a poem.
 * Either way, it's about struggling to find meaning in your life.
 */
public class SearchForMeaning {
    public static void main(String[] args) {
        Human human = new Human();
        human.wakeUp();
        human.think("Is there a meaning to my life?");
        human.searchForMeaning();
        human.think("What else can I do? Other than...");
        do {
            human.wakeUp();
            human.searchForMeaning();
            human.goToSleep();
        } while (!human.foundMeaning);

    }
}

class Human {
    boolean foundMeaning = false;

    void searchForMeaning() {
        System.out.println("There must be a meaning to my life. Even if it is to find a meaning.");
    }

    void think(String thought) {
        System.out.println(thought);
    }

    void wakeUp() {
        System.out.println("Yawn... A new day begins");
    }

    void goToSleep() {
        System.out.println("The day is already over. And I have done nothing of importance");
    }

}
