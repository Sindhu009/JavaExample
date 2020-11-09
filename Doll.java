package xworkz.com.sorting.collectionconcept;

public class Doll {
	private String name;
	private String color;
	private double cost;
	private boolean isMickeyMouse;
	public Doll(String name, String color, double cost, boolean isMickeyMouse) {
		super();
		this.name = name;
		this.color = color;
		this.cost = cost;
		this.isMickeyMouse = isMickeyMouse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public boolean isMickeyMouse() {
		return isMickeyMouse;
	}
	public void setMickeyMouse(boolean isMickeyMouse) {
		this.isMickeyMouse = isMickeyMouse;
	}
	@Override
	public String toString() {
		return "Doll [name=" + name + ", color=" + color + ", cost=" + cost + ", isMickeyMouse=" + isMickeyMouse + "]";
	}
		
	
	

}
