package xworkz.com.SleepMethod;

public class PrintNumberTester {
	public static void main(String[] args) {

		System.out.println("Thread details: " + Thread.currentThread().getName());

		PrintNumberBetween1To10 between1to10 = new PrintNumberBetween1To10();
		Thread t1 = new Thread(between1to10);
		t1.start();

		PrintNumberBetween11To20 between11to20 = new PrintNumberBetween11To20();
		Thread t2 = new Thread(between11to20);
		t2.start();

		System.out.println("End Thread: " + Thread.currentThread().getName());
	}




}
