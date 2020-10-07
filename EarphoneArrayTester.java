package xworkz.com.arrayexample;

public class EarphoneArrayTester {

	public static void main(String args[]) {
		
	EarphoneArray[] Earphone = new EarphoneArray[3];
	
	EarphoneArray Boat = new EarphoneArray();
	
		Boat.color = "black";
	 	Boat.brand = "Boat";
	 	Boat.price = 1200.00;
		Earphone[0]=Boat;
		
	EarphoneArray Samsung = new EarphoneArray();
		
		Samsung.color = "red";
		Samsung.brand = "Samsung";
		Samsung.price = 1500.00;
			Earphone[1]=Samsung;
			
			for(int i=0 ; i<Earphone.length ; i++) {
				if(Earphone[i]!=null) {
					EarphoneArray e= Earphone[i];
					e.displayCarity();
				
				}
				
			}
			}

}