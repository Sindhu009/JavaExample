package xworkz.com.Synchronization;

import java.util.Arrays;

public class StringExampleTester {
	public static void main(String[] args) {


		   System.out.println("Thread details :"+Thread.currentThread().getName());

		ArrayString a=new Arrays();
		a.start();

		   System.out.println("End details :"+Thread.currentThread().getName());

	}


}
