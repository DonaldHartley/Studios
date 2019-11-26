public class TrueFalseQuestion extends Question{
  private boolean correctAnswer;
  
  
  public TrueFalseQuestion(String aQuestionText, boolean aCorrectAnswer) {
    super(aQuestionText);
    correctAnswer = aCorrectAnswer;
  }
  
  public void buildAnswersList(){
    answersList.add(new Answer("True", correctAnswer));
    answersList.add(new Answer("False", !correctAnswer));
  }
  
  public void buildQAndAString(){
    int idx = 0;
    qAndAString = questionText + "\n";
    for (Answer ans: answersList) {
      qAndAString = qAndAString + idx +") " + ans.getAnswerText() + "\n";
      idx++;
    }
  }
  
  public String printQuestionAndAnswers(){
    buildAnswersList();
    buildQAndAString();
    return qAndAString;
  }
  
  public boolean checkAnswer(int answerChosen){
    return answersList.get(answerChosen).getAnswerCorrectness();
  }
}