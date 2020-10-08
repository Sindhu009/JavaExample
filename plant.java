package xworkz.com.array1;

public class plant {
	String type;
	int price;
	int life;
	
	plant()
	{
		System.out.println(" no details");
		
	}
	plant(String inType, int inPrice, int inLife)
	{
		type=inType;
		price=inPrice;
		life=inLife;
		System.out.println(" get details");
		
	}
	void viewDetails() {
		System.out.println(" type:" +type+"\n "  + " price: "+price+"\n" + "life: "+life);
	}

}
