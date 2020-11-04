package xworkz.com.CollectionConcept;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
	 public static void main(String[] args)  { 
	        List<String> strList = new ArrayList<String>();           // Creating a list 
	        strList.add("java");  
	        strList.add("Example");  
	        //print the list
	        System.out.println("List after adding two elements:" + strList);  
	        System.out.println("Is the ArrayList empty: "+ strList.isEmpty());//false
	       strList.clear(); 
	       System.out.println("Here i cleard ArrayList is: " + strList); 


        // Check if ArrayList is empty 
        // using isEmpty() method 
	       	System.out.println("After clearing is  ArrayList empty: " + strList.isEmpty()); //true
	       	List<Integer> strList1 = new ArrayList<Integer>();
	       	strList.add("java");
	       	
	        strList.remove(strList);
	        System.out.println("after removing  java in the list element remaining is  :" + strList);
	        


	        }

}
