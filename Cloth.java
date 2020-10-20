package xworkz.com.AccessModifierInterface;

public interface Cloth {
	void Cotton();
	 void floral();

	default void fashioning () {
		System.out.println("using from cloth we may style our passion");
	}


}
