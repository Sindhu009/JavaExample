package xworkz.com.queue.Collection;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListStringExample {
	public static void main(String args[]) {
		
		LinkedList<String> linkedlist=new LinkedList<String>();
    
		 linkedlist.add("hi");
		 linkedlist.add("hello");
		 linkedlist.add("good");
		 linkedlist.add("morning");
		 linkedlist.add("what");
		 linkedlist.add("are");
		 linkedlist.add("you");
		 linkedlist.add("doing");
		 
		 
		 System.out.println(linkedlist);
		 
		 System.out.println(linkedlist.offer("sindhu"));//return true if it is string
		 System.out.println(linkedlist.add("bindu"));
		// System.out.println(linkedlist.addLast("kamala"));
		// System.out.println(linkedlist.addLast("kumar"));
		 
		 System.out.println("===== printing using for each loop=======");
		 for(String llse : linkedlist);
		System.out.println(linkedlist);
		
		
		Iterator it = linkedlist.iterator();
		 
	    System.out.println("======printing using Iterator=====:");
	    while(it.hasNext()){
	       System.out.println(it.next());
	       
	    }
	       
		    System.out.println("======printing using listIterator=====:");

		
	       ListIterator listIt = linkedlist.listIterator();
	       
	       System.out.println(" priting Forward iteration :");
	       while(listIt.hasNext()){
	          System.out.println(listIt.next());
	       }

	       System.out.println("printing Backward iteration:");
	       while(listIt.hasPrevious()){
	          System.out.println(listIt.previous());
	       }
	    
			 System.out.println("printing first element using peek:" +linkedlist.peek());//print first element 
			 System.out.println("printing first element using  poll:" +linkedlist.poll());//here it print first element later remove tat element for next
			 System.out.println("printing first element using getfirst:" +linkedlist.getFirst());
			 System.out.println("printing first element using getlast:" +linkedlist.getLast());
			 System.out.println("printing first element using get index:" +linkedlist.get(0));
			 
			 System.out.println("remove first element :" +linkedlist.remove());//remove first element
			 System.out.println(linkedlist.pollFirst());// print last one first
			 System.out.println(linkedlist.pollLast());
			 System.out.println(linkedlist.pop());
			 //System.out.println(linkedlist.push("good"));
			 System.out.println(linkedlist.pollLast());
			 System.out.println(linkedlist.removeAll(linkedlist));
			 System.out.println("print now:" +linkedlist);//list is empty now

			 
;

			 
			 
			 
			 
			 
			 


			 
			 
			 
			 
			 



	       
	}
}