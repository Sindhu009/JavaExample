package xworkz.com.StringConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommaSeparation {
	public static void main(String args[]) 
    { 
  
        // Get the List of String 
        List<String> 
            list = new ArrayList<>( 
                
                   Arrays.asList("welcom", "to","xworkz","we","are","learning","string","method")); 
                            
                            
  
        // Print the List of String 
        System.out.println("List of String: " + list); 
  
        // Convert the List of String to String 
        String string = String.join(", ", list); 
  
        // Print the comma separated String 
        System.out.println("Comma separated String: "+string);
                          
    } 

}
