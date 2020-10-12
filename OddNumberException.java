package xworkz.com.Exceptionhandling.CoustomException;
import java.util.Scanner;

public class OddNumberException extends Exception{
	OddNumberException()
	{
		super("OddNumberException");
		
	}
	OddNumberException(String msg)
	{
		super(msg);
	}

}
class UndefinedException{
	public static void main(String args[]) {
		int num;
		Scanner Sc=new Scanner(System.in);
		System.out.println("\n\t Enter any number:");
		num=Integer.parseInt(Sc.nextLine());
		try
		{
			if(num%2!=0)
				throw(new OddNumberException());
			else
				System.out.println("\n\t" +num+ " is an even number");
			
		}
		catch(OddNumberException Ex)
		{
			System.out.println("\n\t Error:" +Ex.getMessage());
			
		}
	}

}
