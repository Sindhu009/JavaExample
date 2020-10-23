package xworkz.com.FunctionalinterfaceExamplde;

public class NoArgumentFiTester {

		public static void main(String[] args) {

			NoArgumentFI noarg=new NoArgumentFI() {

				//@Override
				public void PrintHello() {
					System.out.println("Hello world");

				}

			};
			noarg.PrintHello();

			NoArgumentFI noargu=()->{
				System.out.println("Hello world");
				
			};
			noargu.PrintHello();
		}
}
