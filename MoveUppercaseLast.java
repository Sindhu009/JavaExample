package xworkz.com.StringConcept;

public class MoveUppercaseLast {
	public static void main(String args[]) {
	      String input = "How Are You Folks?"; 
	      
	      String letter = "[A-Z]";
	      String specialChars = "";
	      String inputData = "";
	      for(int i=0; i< input.length(); i++) {
	         char ch = input.charAt(i);
	         if(String.valueOf(ch).matches(letter)) {
	            specialChars = specialChars + ch;
	         } else {
	            inputData = inputData + ch;
	         }
	      }
	      System.out.println("Result: "+inputData+specialChars);
	   }

}
