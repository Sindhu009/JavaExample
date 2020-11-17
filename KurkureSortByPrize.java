import java.util.Comparator;

public class KurkureSortByPrize  implements Comparator<Kurkure>{
	
	


		public static void main(String[] args) {


		}


		@Override
		public int compare(Kurkure o1, Kurkure o2) {

			return (int) (o1.getCost()-o2.getCost());
		}
	
	
	
}

	