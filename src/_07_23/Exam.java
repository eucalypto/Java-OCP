// This program helps preparing an exam, executing it with subjects and
// presents the scores

package _07_23;

import Prog1Tools.IOTools;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Exam {
    private List questions = new ArrayList<Question>();
    private List examTakers = new ArrayList<ExamTaker>();

    private void setUpQuestionnaire() {
        System.out.println("Teacher, Please Set up the Questions.");

        while (true) {
            String questionType = IOTools.readString("Which kind of question do you want? (type 'quit' or 'q' to stop the set-up): ");

            getQuestion(questionType).ifPresent(question -> questions.add(question));
        }


    }

    private Optional<Question> getQuestion(String questionType) {
        switch (questionType) {
            case "quit":
            case "q":
                return Optional.empty();
            case "MultipleChoiceQuestion":
                return Optional.of(MultipleChoiceQuestion.fromCommandLine());
            case "YesNoQuestion":
                return Optional.of(YesNoQuestion.fromCommandLine());
            default:
                System.out.println("We're sorry. The question type '" + questionType + "' doesn't exist.");
                return Optional.empty();
        }
    }

    private void executeExam() {

    }

    private void evaluation() {

    }

    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.setUpQuestionnaire();
        exam.executeExam();
        exam.evaluation();

    }
}
