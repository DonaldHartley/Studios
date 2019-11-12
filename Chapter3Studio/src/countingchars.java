import java.util.HashMap;

public class countingchars {
  
  public static void main(String[] args) {
    String allLetters = "abcdefghijklmnopqrstuvwxyz";
    String movieQuote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
    movieQuote = movieQuote.toLowerCase();
    movieQuote = movieQuote.replaceAll("\\s","");
    movieQuote = movieQuote.replaceAll("\\.","");
    movieQuote = movieQuote.replaceAll(",","");
    movieQuote = movieQuote.replaceAll("\'","");
    movieQuote = movieQuote.replaceAll("’","");
    HashMap<String, Integer> countChars = new HashMap<>();
    for (int i = 0; i<allLetters.length(); i++) {
      countChars.put(String.valueOf(allLetters.charAt(i)),0);
    }
    
    for (int i = 0; i<movieQuote.length(); i++) {
      countChars.put(String.valueOf(movieQuote.charAt(i)), countChars.get(String.valueOf(movieQuote.charAt(i)))+1);
    }
    
    System.out.println(countChars);
    
  }
  
}
