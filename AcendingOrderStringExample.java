package xworkz.com.sorting.collectionconcept;
import java.util.*; 


public class AcendingOrderStringExample {


		public static void main(String args[]) 
		{ 

			// Get the ArrayList 
			ArrayList<String> list = new ArrayList<String>(); 


			list.add("Hi"); 
			list.add("Hello"); 
			list.add("How"); 
			list.add("Are"); 
			list.add("You"); 

			System.out.println("Unsorted ArrayList: "+ list);// print unsorted
							 

			// using Collection.sort() method 
			Collections.sort(list); 

			System.out.println("Sorted ArrayList "+ "in Ascending order : "+ list); //ptint sorted array
							
		} 
	


}
