package day57_interface;

public interface Pet {

	public static final boolean friendly =true;
	
	public abstract void keepAsPet();
	public default void play() {
	
	System.out.println("Playing hide and seek with pet");
}
	//static methods in interface are not inherited to other classes
	public static void feed(String food) {
		System.out.println("Feeding a pet with "+food);
	}
}