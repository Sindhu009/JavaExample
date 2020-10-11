package ExceptionHandling;

public class ExceptionPropogation {
	void m()
	{
		int data=78/0;
		
	}
	void n() {
		m();
	}
	void o()
	{
		try {
			n();
		}
		catch(Exception e) {
			System.out.println(" Exception handled...");
		}
	}
	public static void main(String args[]) {
		ExceptionPropogation ep=new ExceptionPropogation();
		ep.o();
		System.out.println(" normal flow....");
	}

}
