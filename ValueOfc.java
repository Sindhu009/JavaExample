class ValueOfc{
	public static void main(String arg[]){
		System.out.println("To find value of c");
		 int a=5,b=10,c;
		 c=a + b + a++ + b++ + ++a + ++b;
		System.out.println("The value of c is: "+c);
	}
}