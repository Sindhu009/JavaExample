package ExceptionHandling;

public class NullPointerException{
	public static void main(String args[]) {
	String s="name";
	
	foo(null);
	bar(null);
}
static void foo(String x){
	try{
		System.out.println(" first character:" +x.charAt(0));
	}
	catch(NullPointerException e) {
		System.out.println(" NullPointerException thrown!");
	}
}
static void bar(String x){
	if(x==null)
		System.out.println("first character:" +x.charAt(0));
	else
		System.out.println("NullPointerException thrown!");
	}

}
