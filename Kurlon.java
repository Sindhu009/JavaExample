package xworkz.com.multipleinterface;

public class Kurlon implements Bed ,pillow {
	@Override
	public void soft() {
		System.out.println("kurlon sense so soft");

	}

	@Override
	public void Sleeping() {
		
		pillow.super.Sleeping();
	}

}
