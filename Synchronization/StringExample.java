package xworkz.com.Synchronization;

import java.util.ArrayList;

public class StringExample extends Thread{
	 @Override
	   public void run() {

		   System.out.println("Thread details :"+Thread.currentThread().getName());

			ArrayList<String> str=new ArrayList<String>();
			str.add("mon");
			str.add("tue");
			str.add("wed");
			str.add("thur");
			str.add("fri");
			str.add("sat");
			str.add("sun");

			//System.out.println(str);

			str.forEach((a)->System.out.println(a));

		 System.out.println("Thread details :"+Thread.currentThread().getName());



		}


}
