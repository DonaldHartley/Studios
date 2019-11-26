import java.util.ArrayList;

public abstract class Question{
  String questionText;
  ArrayList<Answer> answersList;
  String qAndAString;
  
  Question(String aQuestionText) {
    questionText = aQuestionText;
  }
  
  public abstract void buildAnswersList();
  public abstract void buildQAndAString();
  public abstract String printQuestionAndAnswers();
  public abstract boolean checkAnswer(int answerChosen);

}
