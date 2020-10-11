package ExceptionHandling;

public class FinallyBlock {
	public static void main(String args[]) {
		try {
			int data=25/5;
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println("number shold not be divide by zero");
		}
		finally {
			System.out.println(" finally block is alwys executed");
		}
		System.out.println(" rest of the code......");
	}

}
