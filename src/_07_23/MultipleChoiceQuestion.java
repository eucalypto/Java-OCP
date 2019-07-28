package _07_23;

import Prog1Tools.IOTools;

class MultipleChoiceQuestion extends Question {


    public MultipleChoiceQuestion(int points, String text) {
        super(points, text);
    }

    public static MultipleChoiceQuestion fromCommandLine() {
        String questionText = IOTools.readString("Please give the text of the question: ");
        int points = IOTools.readInt("Please provide the number of points: ");
        return new MultipleChoiceQuestion(0, "hello");
    }
}
