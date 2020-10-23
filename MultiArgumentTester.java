package xworkz.com.FunctionalinterfaceExamplde;

public class MultiArgumentTester {
	public static void main(String[] args) {

		MultiArgument multi=(String str1,String str2)->{
			System.out.println("Concatinate two strings :" +(str1+str2));
			return null;
		};
		multi.ConcatTwoString("Sindhu"," Kumar");

	}

}
