package _07_23;

import java.util.*;

abstract class Question {
    private int points;
    private String text;
    private Array<String> answers = new ArrayList<>();
    private int correctAnswer;

    public Question(int points, String text) {
        this.points = points;
        this.text = text;
    }

    public int getPoints() { return points; }
    public String getText() { return text; }
}
