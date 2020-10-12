package xworkz.com.Exceptionhandling.CoustomException;
import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		int n,c,f=1;
		System.out.println(" enter a numberto calculate its factorial");
		Scanner in= new Scanner(System.in);
		n=in.nextInt();
		if(n<0)
			System.out.println(" number should be positive");
		else
			for(c=1;c<=n;c++)
				f=f*c;
		System.out.println("Factorial of " +n+" is= " +f);
	}

}
