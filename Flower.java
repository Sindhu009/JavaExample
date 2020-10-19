package xworkz.com.InterfaceExample;

public class Flower extends Bud{
	@Override
	 public void growing() {
		System.out.println("plants strats to grow");
	}
	@Override
	void yeilding(){
		System.out.println("After growing plants produce buds");
	}

	void looks(){
		System.out.println("and the flower looks so attractive");
	}
	


}
