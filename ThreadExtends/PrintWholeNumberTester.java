package xworkz.com.ThreadExtends;

public class PrintWholeNumberTester {
	public static void main(String[] args)
	{	
		System.out.println("Main Thread program started");
	System.out.println("Thread details are: " + Thread.currentThread().getId() + 
						" Name: "+ Thread.currentThread().getName());

	PrintWholeNumber t1 = new PrintWholeNumber();
	t1.start();

		System.out.println("Thread program ended");
	System.out.println("End of Thread: " + Thread.currentThread().getId() + 
			" Name: "+ Thread.currentThread().getName());



}}
