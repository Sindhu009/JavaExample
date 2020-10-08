package xworkz.com.array1;

public class RemoveDuplicate {
	public static void main(String args[]) {
		int num[]= {1,2,1,2,3,4,5};
		System.out.println(" original array length:" +num.length);
		System.out.println(" array elements are:");
		for(int i=0;i<num.length;i++);
		{
			System.out.println(num+"  ");
		}
		System.out.println("\n the length of the array is: " +array_sort(num));
		
		
		
	}
	public static int array_sort(int[] num) {
		int index=1;
		for(int i=1;i<num.length;i++) {
			if(num[i]!=num[index-1])
				num[index++]=num[i];
		}
		return index;
	}

}
