package daily._07_23;

import java.util.ArrayList;
import java.util.List;

abstract class Question {
    private int points;
    private String text;
    private List<String> answers = new ArrayList<>();
    private int correctAnswer;

    Question(int points, String text) {
        this.points = points;
        this.text = text;
    }

    public int getPoints() { return points; }
    public String getText() { return text; }
}
