
public class Kurkure {
	
	
	private String flavor;
	private String color;
	private int cost;
	public Kurkure(String flavor, String color, int cost) {
		super();
		this.flavor = flavor;
		this.color = color;
		this.cost = cost;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
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
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "kurkure [flavor=" + flavor + ", color=" + color + ", cost=" + cost + "]";
	}
	
	
	

}
