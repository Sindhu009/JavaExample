package xworkz.com.sorting.collectionconcept;

import java.util.ArrayList;

public class DollTester {
	public static void main(String args[]) {
		 
		
		Doll d1=new Doll("Teddy", "orange", 789.00, false);
		Doll d2=new Doll("oggy", "blue", 678.00, false);
		Doll d3=new Doll("MickeyMouse", "Red", 1234.00, true);
		Doll d4=new Doll("monkey", "gray", 799.00, false);
		
		ArrayList<Doll> dollArrayList= new ArrayList<Doll>();
		
		System.out.println(" Arrays in the list:" + dollArrayList);
		
		
		System.out.println(" printing Arrays in the list using Enanced for loop:" + dollArrayList);
			for(Doll d: dollArrayList) {
				System.out.println(d);
				
			}
			dollArrayList.lastIndexOf(dollArrayList);
			System.out.println(" here printing the last element in the ArrayList :" +dollArrayList);
			
			
			//dollArrayList.set(2, new String("Dog"));
			//System.out.println(" after updating 3rd index:" + dollArrayList);


	}
	

}
