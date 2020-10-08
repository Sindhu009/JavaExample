package ExceptionHandling;

public class ArithmeticException {
	public static void main(String args[]) {
		try {
			int num1=90,num2=0;
			int output=num1/num2;
			System.out.println(" result:" +output );			
		}
			catch(ArithmeticException e) 
			{
				System.out.println(" you cant devide number by zero");
			}
		
	}

}
