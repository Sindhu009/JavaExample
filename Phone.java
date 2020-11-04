package xworkz.com.CollectionConcept;

public class Phone {// coustom example
	private String name;
	private boolean isAndroid;
	private double cost;
	public Phone(String name, boolean isAndroid, double cost) {
		super();
		this.name = name;
		this.isAndroid = isAndroid;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAndroid() {
		return isAndroid;
	}
	public void setAndroid(boolean isAndroid) {
		this.isAndroid = isAndroid;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", isAndroid=" + isAndroid + ", cost=" + cost + "]";
	}
	
	

}
