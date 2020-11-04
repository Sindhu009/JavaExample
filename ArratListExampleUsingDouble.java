package xworkz.com.CollectionConcept;

import java.util.ArrayList;

public class ArratListExampleUsingDouble {
	public static void  main(String rgs[]) {
		ArrayList<Double>printnumber= new ArrayList<Double>();
		printnumber.add(1.00);
		printnumber.add(2.00);
		printnumber.add(3.00);
		printnumber.add(4.00);
		printnumber.add(5.00);
		printnumber.add(6.00);
		printnumber.add(6,7.00);
		
		System.out.println("to print number an ArrayList: "  +printnumber);
	printnumber.remove(new Double(10.00));
	System.out.println(" now print the number in ArrayList after remove :" +printnumber);// dont have 10th index so no matter here
	
	
	
	
	//traversal using foreach 
	for (Double d : printnumber) {
		System.out.println(d);
	}
    
	
		
	}


}
