package xworkz.com.array1;

public class InteractionOfTwoArrays {
	public static void main(String args[]) {
		int array1[]= {21,34,41,22,35};
		int array2[]= {61,34,45,21,11};
		System.out.println(" interaction of two array::");
		
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					System.out.println("array2[j]");
				}
		}
	}
		
	}
}
