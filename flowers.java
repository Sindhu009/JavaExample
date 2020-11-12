package xworkz.com.queue.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class flowers {
	public static void main(String args[]) {
		
		LinkedList<String> flower=new LinkedList<String>();
	    
		 flower.add("Rose");
		 flower.add("Jasmin");
		 flower.add("Lotus");
		 flower.add("lilly");
		 flower.add("sunflower");
		 		 
		 
		 System.out.println(flower);
		 
		 
		 
		 System.out.println("===== printing using for each loop=======");
		 for(String llse : flower);
		System.out.println(flower);
		
	    System.out.println("======printing using Iterator=====:");

		Iterator it = flower.iterator();
		 
	    while(it.hasNext()){
	       System.out.println(it.next());
	       
	    }
	       
		    System.out.println("======printing using listIterator=====:");

		
	       ListIterator listIt = flower.listIterator();
	       
	       System.out.println(" priting Forward iteration :");
	       while(listIt.hasNext()){
	          System.out.println(listIt.next());
	       }

	       System.out.println("printing Backward iteration:");
	       while(listIt.hasPrevious()){
	          System.out.println(listIt.previous());
	       }
	    
		
		System.out.println("======removing operation=====");
		
		
		 System.out.println("remove first element :" +flower.remove());//remove first element
		 System.out.println(flower.pollFirst());// print last one first
		 System.out.println(flower.pollLast());
		 System.out.println(flower.pop());
		 //System.out.println(linkedlist.push("good"));
		 System.out.println(flower.pollLast());
		 System.out.println(flower.removeAll(flower));
		 System.out.println("print now:" +flower);//list is empty now

		
		
		
		
	}

}
