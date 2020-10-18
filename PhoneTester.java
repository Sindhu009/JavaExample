package xworkz.com.Abstract;

public class PhoneTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone smartPhone = new SmartPhone();
		smartPhone.brand="Redmi Note8";
		smartPhone.color="Blue";
		smartPhone.ram = 8;
		smartPhone.rom = 64;
		smartPhone.network="4G";
		smartPhone.camPix = "48MP";
		
		smartPhone.Function();
		smartPhone.calling();
		smartPhone.gaming();
		smartPhone.message();
		smartPhone.displayDetails();
		
		System.out.println("===================================");
		Phone phone = new SmartPhone();//upcasting
		phone.brand="Redmi Note8";
		phone.color="Blue";
		phone.Function();
		phone.displayDetails();
		phone.Gaming();
	}

}


