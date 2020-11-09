package xworkz.com.sorting.collectionconcept;

import java.util.Comparator;

public class Statue implements Comparator<Statue> {
	
	private String brand;
	private double inches;
	public Statue(String brand, double inches) {
		super();
		this.brand = brand;
		this.inches = inches;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getInches() {
		return inches;
	}
	public void setInches(double inches) {
		this.inches = inches;
	}
	@Override
	public String toString() {
		return "Statue [brand=" + brand + ", inches=" + inches + "]";
	}
	@Override
	public int compare(Statue arg0, Statue arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
