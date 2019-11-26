import java.util.ArrayList;

public class MultipleSelectionQuestion extends Question{
  private ArrayList<String> incorrectAnswers;
  private ArrayList<String> correctAnswers;
  
  public MultipleSelectionQuestion(String aQuestionText, ArrayList<String> aIncorrectAnswers, ArrayList<String> aCorrectAnswers){
    super(aQuestionText);
    incorrectAnswers = aIncorrectAnswers;
    correctAnswers = aCorrectAnswers;
  }
  
  public void buildAnswersList(){
    for (String iAns : incorrectAnswers){
      answersList.add(new Answer(iAns, false));
    }
    for (String cAns : correctAnswers){
      answersList.add(new Answer(cAns, true));
    }
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
  
  public boolean checkAllAnswers(ArrayList<Integer> answersChosen) {
    for (int ans: answersChosen){
      if (!checkAnswer(ans)){
        return false;
      }
    }
    return true;
  }
  
}