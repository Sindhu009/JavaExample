class ValueOfk{
	public static void main(String arg[]){
		System.out.println("To find value of k");
		 int i=36,j=19,k;
		 k=i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
		System.out.println("The value of k is: "+k);
	}
}