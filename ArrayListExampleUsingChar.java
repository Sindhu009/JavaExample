package xworkz.com.CollectionConcept;

import java.util.ArrayList;

public class ArrayListExampleUsingChar {
	public static void  main(String rgs[]) {
		ArrayList<Character>printvowels= new ArrayList<Character>();
		printvowels.add('a');
		printvowels.add('e');
		printvowels.add('i');
		printvowels.add('o');

		printvowels.add('u');
		
		System.out.println("to print vowels in  ArrayList: "  +printvowels);
	printvowels.remove(new Character('u'));
	System.out.println(" now print the vowels in ArrayList after remove  'u':" +printvowels);
	
	
	
	
	//traversal using foreach 
	for (Character c : printvowels) {
		System.out.println(c);
	}
    
	
		
	}





}
