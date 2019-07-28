package _07_23;

public class YesNoQuestion extends Question {

    public YesNoQuestion(int points, String text) {
        super(points, text);
    }

    public static YesNoQuestion fromCommandLine() {
        return new YesNoQuestion(1, "spam");
    }
}
