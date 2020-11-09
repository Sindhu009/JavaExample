package xworkz.com.sorting.collectionconcept;

public class Country implements Comparable<Country> {
	private int numberofStates;
	private String name;
	private String code;
	private Object numberofStrates;
	public Country(int numberofStrates, String name, String string) {
		super();
		this.numberofStrates = numberofStrates;
		this.name = name;
		this.code = code;
	}
	public int getNumberofStrates() {
		return numberofStates;
	}
	public void setNumberofStates(int numberofStrates) {
		this.numberofStrates = numberofStrates;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getcode() {
		return code;
	}
	public void setCountrycode(long countrycode) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Country [numberofStates=" + numberofStrates + ", name=" + name + ", code=" + code + "]";
	}
	@Override
	public int compareTo(Country o) {
		int result =this.numberofStates-o.numberofStates;
		return result;
	}
	
	
	

}
