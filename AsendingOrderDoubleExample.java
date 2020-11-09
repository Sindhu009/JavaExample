package xworkz.com.sorting.collectionconcept;

import java.util.ArrayList;
import java.util.Collections;

public class AsendingOrderDoubleExample {
	public static void main(String args[]) {
		ArrayList<Double> primenumber=new ArrayList<Double>();
		
		primenumber.add(2.00);
		primenumber.add(23.00);
		primenumber.add(51.00);
		primenumber.add(17.00);
		primenumber.add(7.00);
		primenumber.add(103.00);
		primenumber.add(13.00);
		primenumber.add(3.00);
		primenumber.add(1001.00);
		primenumber.add(5.00);
        
		System.out.println("before sorting:" +primenumber);
		
		Collections.sort(primenumber);
		System.out.println("after sorting:"+ primenumber);

	}

}
