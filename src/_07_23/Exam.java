// This program helps preparing an exam, executing it with subjects and
// presents the scores

package _07_23;

import java.util.*;
import Prog1Tools.IOTools;

public class Exam {
    List questions = new ArrayList<Question>();
    List examTakers = new ArrayList<ExamTaker>();

    void setUpQuestionnaire() {
        System.out.println("Teacher, Please Set up the Questions.");

        while (true) {
            Question question;
            String questionType = IOTools.readString("Which kind of question do you want? (type 'quit' or 'q' to stop the set-up): ");

            if ( questionType.equals("quit") || questionType.equals("q") )
                break;

            if (questionType.equals("MultipleChoiceQuestion") ) {
                question = MultipleChoiceQuestion.fromCommandLine();
            } else if (questionType.equals("YesNoQuestion")) {
                question = YesNoQuestion.fromCommandLine();
            } else {
                System.out.println("We're sorry. The question type '" + questionType + "' doesn't exist.");
            }

            questions.add(question);
        }

    }

    void executeExam(){

    }

    void evaluation(){

    }

    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.setUpQuestionnaire();
        exam.executeExam();
        exam.evaluation();

    }
}
