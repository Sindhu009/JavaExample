package xworkz.com.sorting.collectionconcept;

import java.util.ArrayList;
import java.util.Collections;
public class StudentTester {
	
     public static void main(String args[]) {
		
		
		Student  s1=new Student(16,"Rohan"," j p nagar");
		Student s2=new Student(16,"Rahul","RR nagar");
		Student s3=new Student(18,"Rekha", "Rajajinagar");
		Student s4=new Student(14,"rahi", "jaynagar");

		ArrayList<Student> StudentArrayList= new ArrayList<Student>();
		{
		StudentArrayList.add(s1);
		StudentArrayList.add(s2);
		StudentArrayList.add(s3);
		StudentArrayList.add(s4);
		
		
		System.out.println(StudentArrayList);
		}

		
		for( Student s: StudentArrayList) {
			System.out.println(" Printing Array in the list using foreach loop:" +StudentArrayList);

	}
		
		
		
		Collections.sort(StudentArrayList, new AgeSorter());
		 
        // Sorted by age
        System.out.println(StudentArrayList);
     }	

}
