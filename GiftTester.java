import java.util.HashSet;
import java.util.Iterator;

public class GiftTester {
	
	public static void main(String[] args) {

		HashSet<Gift> gift=new HashSet<Gift>();
		gift.add(new Gift("glass","bdy", 999.00));
		gift.add(new Gift("frame","anniversary", 899.00));
		gift.add(new Gift("Doll","love", 678.00));
		gift.add(new Gift("dress","festival", 1099.00));

		System.out.println(gift);

		for(Gift ref: gift) {
			System.out.println(ref);
		}
		System.out.println(" ");

		System.out.println("-----Iterator-----");
		Iterator<Gift> ref= gift.iterator();
         while(ref.hasNext()) {
        	 System.out.println(ref.next());
         }

	}

}
