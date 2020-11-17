
public class Gift {// example of linked hash set coustem object
	private String type;
	private String purpose;
	private double cost;
	public Gift(String type, String purpose, double cost) {
		super();
		this.type = type;
		this.purpose = purpose;
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Gift [type=" + type + ", purpose=" + purpose + ", cost=" + cost + "]";
	}
	
	
	
	
	
	

}
