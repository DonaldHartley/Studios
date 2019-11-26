public class Answer {
  private String answerText;
  private Boolean answerCorrectness;
  public Answer (String aAnswerText, Boolean aAnswerCorrectness){
    answerText = aAnswerText;
    answerCorrectness = aAnswerCorrectness;
  }
  
  @Override
  public String toString(){
    if (answerCorrectness) {
      return "Answer: " + answerText + ", is correct.";
    } else {
      return "Answer: " + answerText + ", is incorrect.";
    }
  }
  
  public Boolean getAnswerCorrectness() {
    return answerCorrectness;
  }
  
  public String getAnswerText(){
    return answerText;
  }
  
}
