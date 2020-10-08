package xworkz.com.array1;

public class Missingnumbermain {
	public static void main(String args[]) {
		int[] array1= {1,2,3,4,6,7,8,10};
		System.out.println("missing number from array "+array1 );
	}
	public static int findnumber(int[] arr) {
		
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for(int i=0;i<arr.length;i++)
		{
			restSum+=arr[i];
			
			
		}
		int findnumber=sum-restSum;
		return findnumber;
		
		
	}

}
