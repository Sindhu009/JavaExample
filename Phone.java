package xworkz.com.Abstract;

public abstract class Phone {
	String brand;
	String color;
	
	abstract void calling();
	abstract void gaming();
	abstract void message();
	
	void Function() {
		System.out.println("Make phone calls");
	}
	
	void displayDetails() {
		System.out.println("brand: "+brand+" , "+"Color: "+color);
		
	}
	void Gaming() {
		System.out.println(" Online games");
	}

}
