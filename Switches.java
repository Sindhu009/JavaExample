package xworkz.com.CollectionConcept;

public class Switches {// example for coustom ArrayList
	private String Company;
	private double cost;
	private boolean is2Way;
	public Switches(String company, double cost, boolean is2Way) {
		super();
		Company = company;
		this.cost = cost;
		this.is2Way = is2Way;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public boolean isIs2Way() {
		return is2Way;
	}
	public void setIs2Way(boolean is2Way) {
		this.is2Way = is2Way;
	}
	@Override
	public String toString() {
		return "Switches [Company=" + Company + ", cost=" + cost + ", is2Way=" + is2Way + "]";
	}
	public boolean hasnext() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}

