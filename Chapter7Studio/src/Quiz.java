import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
  private ArrayList<Question> questionsList;
  private ArrayList<Boolean> gradedAnswers;
  private static Scanner input = new Scanner(System.in);
  
  public void addQuestion(){
    boolean addMore = true;
    while (addMore) {
      int selection;
      System.out.println("What kind of question would you like to add?\n0)True False\n1)Multiple Choice\n2)Multiple Selection\n3)Or Stop");
      selection = input.nextInt();
      if (selection==0){
        addTFQuestion();
      } else if (selection==1){
        addMCQuestion();
      } else if (selection==2){
        addMSQuestion();
      } else if (selection==3){
        addMore = false;
      } else {
        System.out.println("Invalid entry choose again.");
      }
    }
  }
  
  private void addTFQuestion(){
    ;
  }
  
  private void addMCQuestion(){
    ;
  }
  
  private void addMSQuestion(){
    ;
  }
  
  private void gradeQuiz(){
    ;
  }
  
  private void takeQuiz(){
    ;
  }
  
  
}
