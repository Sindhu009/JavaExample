package xworkz.com.CollectionConcept;

import java.util.ArrayList;

public class PhoneTester {
	private static final ArrayList<Phone> PhoneArrayList = null;

	public static void main(String args[]) {
		Phone p1=new Phone("Redmi", true, 12000.00);
		Phone p2=new Phone("Realme", true, 13000.00);
		Phone p3=new Phone("iphone", false, 33000.00);
		Phone p4=new Phone("onePlus", true, 34000.00);
		
		ArrayList<Phone> phoneArrayList= new ArrayList<Phone>();
		phoneArrayList.add(p1);
		phoneArrayList.add(p2);
		phoneArrayList.add(p3);
		phoneArrayList.add(p4);
		
		System.out.println(phoneArrayList);
		
		//using foreach loop
		for(Phone p: phoneArrayList) {
			System.out.println(" printing from foreach loop:" +p);
			
			
		}
		//using for loop
		for(int i=0; i<phoneArrayList.size() ;i++) {
			//Phone p=PhoneArrayList.get(i);
			//double cost=p.getCost();
			System.out.println("printing using for loop:"+phoneArrayList);
			
		}
			
			phoneArrayList.lastIndexOf(phoneArrayList);
			System.out.println(" here printing the last element in the ArrayList :" +phoneArrayList);
			
			 phoneArrayList.get(0);		
			System.out.println(phoneArrayList);
			
			
			
			
			System.out.println(phoneArrayList.get(3));
			//System.out.println(framelist.set(2,plastic));
			System.out.println("updating the 3rd element with new object");
			for(int i=0;i<phoneArrayList.size();i++) {
				Phone p = phoneArrayList.get(i);
				System.out.println("updating index value");

				

				 double getcost=p.getCost();
				 p.setName("Redmi8");
				 System.out.println(p);
			}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	
}
