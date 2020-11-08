package xworkz.com.CollectionConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class SwitchTester {
	public static void main(String args[]) {
		Switches s1=new Switches("roman",200.00, true);
		Switches s2=new Switches("northwest",800.00, true);
		Switches s3=new Switches("phillips",500.00, true);
		Switches s4=new Switches("chroma",100.00, false);
		
		ArrayList<Switches> switchArrayList= new ArrayList<Switches>();
		switchArrayList.add(s1);
		switchArrayList.add(s2);
		switchArrayList.add(s3);
		switchArrayList.add(s4);
		
		System.out.println(switchArrayList);
		
		//using foreach loop
		for(Switches s: switchArrayList) {
			System.out.println(" printing from foreach loop:" +s);
			
			
		}
            System.out.println("---Traverse using iterator---");
        
        Iterator<Switches> itr=switchArrayList.iterator();
        while(itr.hasNext()) {
        	Switches s=itr.next();
        	System.out.println(s);
        }
        
        System.out.println("---Traverse using list iterator---");
        
        ListIterator <Switches> lstitr= switchArrayList .listIterator();
        while(lstitr.hasNext()) {
        	Switches s=lstitr.next();
        	System.out.println(s);
        }
        System.out.println("using has previous list iterator");
        while(lstitr.hasPrevious()) {
        	Switches p=lstitr.previous();
        	System.out.println(p);
	} 
}	}
