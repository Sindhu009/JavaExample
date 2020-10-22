package xworkz.com.multipleinterface;

public interface pillow {
	public void soft();

	default void Sleeping() {
		System.out.println("Sleeping with pillow more comfortable");
	}
	

}
