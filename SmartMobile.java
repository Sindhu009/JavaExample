package xworkz.com.InterfaceExample;

public class SmartMobile extends DuelSimMobile {
	String storage;

	@Override
	public void calling() {
		System.out.println("calling and vedio calling can b done");
	}

	@Override
	public void messaging() {
		System.out.println("messaging can be using apps");
	}

	public void gaming() {
		System.out.println("Used for gaming purpose");
	}

	public void details() {
		System.out.println("brand :" +brand+"||" + "price :"  +price+"||"+ "storage :" +storage );
	}


}
