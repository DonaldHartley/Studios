import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question{
  private ArrayList<String> incorrectAnswers;
  private String correctAnswer;
  
  public MultipleChoiceQuestion(String aQuestionText, ArrayList<String> aIncorrectAnswers, String aCorrectAnswer) {
    super(aQuestionText);
    incorrectAnswers = aIncorrectAnswers;
    correctAnswer = aCorrectAnswer;
  }
  
  public void buildAnswersList(){
    for (String iAns : incorrectAnswers){
      answersList.add(new Answer(iAns, false));
    }
    answersList.add(new Answer(correctAnswer, true));
  }
  
  public void buildQAndAString() {
    int idx = 0;
    qAndAString = questionText + "\n";
    for (Answer ans: answersList) {
      qAndAString = qAndAString + idx +") " + ans.getAnswerText() + "\n";
      idx++;
    }
  }
  
  public String printQuestionAndAnswers() {
    buildAnswersList();
    buildQAndAString();
    return qAndAString;
  }
  
  public boolean checkAnswer(int answerChosen) {
    return answersList.get(answerChosen).getAnswerCorrectness();
  }

}
