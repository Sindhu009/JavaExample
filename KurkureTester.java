import java.util.Iterator;
import java.util.TreeSet;

public class KurkureTester {
	public static void main(String[] args) {

		TreeSet<Kurkure> kk=new TreeSet<Kurkure>();
		kk.add(new Kurkure("chilly","red",5));
		kk.add(new Kurkure("buttur","green",5));
		kk.add(new Kurkure("hydrabadi","meroon",5));
		kk.add(new Kurkure("spices","blue",5));

		System.out.println(kk);

	

		for(Kurkure ref: kk) {
			System.out.println(ref);
		}
		System.out.println(" ");

		System.out.println("-----Iterator-----");
		Iterator<Kurkure> ref= kk.iterator();
         while(ref.hasNext()) {
        	 System.out.println(ref.next());
         }

	}
	
	
	
	
	
	
	

}
