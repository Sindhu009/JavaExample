package xworkz.com.runnableinterface;

public class MultipleOf12And6Tester {
	public static void main(String[] args) {

		System.out.println("Thread details are: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());

		MultipleOf6 multipleOf6 = new MultipleOf6();
		Thread t1 = new Thread(multipleOf6);
		t1.start();

		MultipleOf12 multipleOf12 = new MultipleOf12();
		Thread t2 = new Thread(multipleOf12);
		t2.start();

		//Annonymous class
		Runnable multipleOf7 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread details are: " + Thread.currentThread().getId() + 
						" Name: "+ Thread.currentThread().getName());

				int num = 7;
				for(int i=1; i<=10; i++) {
					System.out.println(num + " * " + i + " = " +(num*i));
				}

				System.out.println("End od Thread: " + Thread.currentThread().getId() + 
						" Name: "+ Thread.currentThread().getName());

			}	
		};

		Thread t3 = new Thread(multipleOf7);
		t3.start();

		//Lambdha Expression
				Runnable multipleOf88 = () -> {

						System.out.println("Thread details are: " + Thread.currentThread().getId() + 
								" Name: "+ Thread.currentThread().getName());

						int num = 88;
						for(int i=1; i<=10; i++) {
							System.out.println(num + " * " + i + " = " +(num*i));
						}

						System.out.println("End od Thread: " + Thread.currentThread().getId() + 
								" Name: "+ Thread.currentThread().getName());

				};

				Thread t4 = new Thread(multipleOf88);
				t4.start();


		System.out.println("End od Thread: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());

	}


}
