package xworkz.com.sorting.collectionconcept;

import java.util.ArrayList;

public class SatueTester {
	public static void main(String args[]) {
		
		
		Statue s1=new Statue("aaa", 67.89);
		Statue s2=new Statue("yyy",98.90);
		Statue s3=new Statue("sss",89.98);
		
		ArrayList<Statue> StatueArrayList= new ArrayList<Statue>();

		StatueArrayList.add(s1);
		StatueArrayList.add(s2);
		StatueArrayList.add(s3);
		
		System.out.println(StatueArrayList);


		
		for( Statue c: StatueArrayList) {
			System.out.println(" Printing Array in the list using foreach loop:" +StatueArrayList);

	}
		
		
		
		
		
		
	}

}
