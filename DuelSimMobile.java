package xworkz.com.InterfaceExample;

public abstract class DuelSimMobile implements Mobile{

		String brand;
		int price;

		public void calling() {
			System.out.println("Making a call");
		}

		public void messaging() {
			System.out.println("Ping a message");
		}

		abstract public void gaming();
		abstract public void details();

	

}
