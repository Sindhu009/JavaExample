package xworkz.com.StringConcept;

public class CountCharacter {
	// Method that returns the count of the given 
    // character in the string 
    public static long count(String s, char ch) 
    { 
  
        return s.chars().filter(c -> c == ch) .count(); 

            
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        String str = "hheeeeellllloooo"; 
        char c = 'e'; 
        System.out.println(count(str, c)); 
    } 

}
