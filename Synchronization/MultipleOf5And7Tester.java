package xworkz.com.Synchronization;

public class MultipleOf5And7Tester {
	public static void main(String[] args) {

		System.out.println("Thread details :" +Thread.currentThread().getName() );

		MultipleOf5 mul=new MultipleOf5();
		mul.printMultipleof5(5);

		MultipleOf7 mul2=new MultipleOf7();
		mul2.printMultipleof7(7);



		System.out.println("End details :" +Thread.currentThread().getName() );

	}


}
