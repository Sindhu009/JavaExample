package ExceptionHandling;

public class NumberFormatException {
	String s1="12";
	int i1=Integer.parseInt(s1);
	
	String s2="7L";
	long l1=Long.parseLong(s1);
	System.out.println(i1*l1);
	try {
		int i3=Integer.parseInt(s2);
	}
	catch(NumberFormatException e) {
		System.err.println("unablr to format" +e);
	}

	

}
