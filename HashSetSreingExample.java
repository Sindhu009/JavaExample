import java.util.HashSet;
import java.util.Iterator;

public class HashSetSreingExample {
	public static void main(String[] args) {

		HashSet<String> domesticanimal=new HashSet<String>();
		domesticanimal.add("Dog");
		domesticanimal.add("Cat");
		domesticanimal.add("Cow");
		domesticanimal.add("Ox");
		domesticanimal.add("Goat");

			System.out.println(domesticanimal);

		for(String ref:domesticanimal) {
			System.out.println(ref);
		}
		System.out.println(" ");

		System.out.println("-----Iterator-----");
		Iterator<String> ref=domesticanimal.iterator();
         while(ref.hasNext()) {
        	 System.out.println(ref.next());
         }

	}

}
