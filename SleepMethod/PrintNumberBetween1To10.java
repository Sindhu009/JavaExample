package xworkz.com.SleepMethod;

public class PrintNumberBetween1To10 implements Runnable {
	public void run() {

		System.out.println("Thread details: " + Thread.currentThread().getName());
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);   //delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("End Thread: " + Thread.currentThread().getName());

	}

}
