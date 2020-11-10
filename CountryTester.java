package xworkz.com.sorting.collectionconcept;

import java.util.ArrayList;
import java.util.Collections;

public class CountryTester {
	public static void main(String args[]) {
		
		
		Country c1=new Country(28, "Karnataka", "KA");
		Country c2=new Country(34, "AndraPradesh", "AP");
		Country c3=new Country(37, "TamilNadu", "TN");
		Country c4=new Country(22, "Maharastra", "MH");
		
		ArrayList<Country> CountryArrayList= new ArrayList<Country>();

		CountryArrayList.add(c1);
		CountryArrayList.add(c2);
		CountryArrayList.add(c3);
		CountryArrayList.add(c4);
		
		System.out.println(CountryArrayList);


		
		for( Country c: CountryArrayList) {
			System.out.println(" Printing Array in the list using foreach loop:" +CountryArrayList);

		}
		
        Collections.sort(CountryArrayList);		
		System.out.println(" Printing Array in the list acending order:" +CountryArrayList);

		  // Collections.sort(CountryArrayList, Collections.reverseOrder());
		Collections.reverse(CountryArrayList);

			System.out.println(" Printing Array in the list decending order:" +CountryArrayList);

	}

}
