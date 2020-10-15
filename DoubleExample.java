package xworkz.com.casting;

public class DoubleExample {
	public static void main(String[] args) {
		System.out.println("Start Program");
		double s=33.99;
		
		Double d=new Double(s); //Boxing
		System.out.println("The value of d is " +d);
		
		Double dVal=s;    //AutoBoxing
		System.out.println("The value of double is :" +dVal);
		
		double a=Double.valueOf(d);    //UnBoxing
		System.out.println("The value of a :"+a);
		
		double k=d;  //AutoUnBoxing
		System.out.println("The value of k :" +k);
		
		int b=(int)s;
		System.out.println("The value is " +b);  //narrowing
		
		System.out.println("End program");

	}

}
