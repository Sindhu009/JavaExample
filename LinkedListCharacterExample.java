import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedListCharacterExample {
	public static void main(String[] args) {

		LinkedHashSet<Character> alphabet=new LinkedHashSet<Character>();
		 alphabet.add('s');
		 alphabet.add('y');

		 alphabet.add('o');

		 alphabet.add('x');


		System.out.println( alphabet);

		for(Character ref: alphabet) {
			System.out.println(ref);
		}
		System.out.println(" ");

		System.out.println("-----Iterator-----");
		Iterator<Character> ref= alphabet.iterator();
         while(ref.hasNext()) {
        	 System.out.println(ref.next());
         }


	}

}
