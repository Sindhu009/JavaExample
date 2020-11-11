package xworkz.com.queue.Collection;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class StringQueueExample {
	
	
	public static void main (String args[]) {
	ArrayList<String> AL=new ArrayList<String>();	
	AL.add("kumar");
	AL.add("vinay");
	AL.add("manu");
	
	
	
	
	PriorityQueue<String> queue =new PriorityQueue<String>();
	queue.add("sindhu");
	queue.add("bindu");
	queue.add("chaitra");
	queue.add("vedha");
	queue.add("suchitra");
	queue.add("sangeetha");
	
	System.out.println(queue);
	   System.out.println(" printing first element:"+ queue.peek());
	   System.out.println(" printing first element using poll:"+ queue.poll());// remove after print
	   System.out.println(" adding new  element:"+ queue.offer("pankaja"));
	   System.out.println(" printing first element using element method:"+ queue.element()); //thows an exception if empty
	   System.out.println(" remove first element:"+ queue.remove());
	   System.out.println(" removing  name sindhu in list:"+ queue.remove("sindhu"));
	   System.out.println(" printing all element in the list:"+ queue.addAll(AL));
	   System.out.println(" removing all elements in list:"+ queue.removeAll(AL));
	  // System.out.println("clear all element:" +queue.clear());



	   
	   


	   

	   

	   
	   
		
	}

}
