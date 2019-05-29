package day52_inheritance05;

public class FinalMethods {

	public final void method1() {
		System.out.println("final method 1");

	}
	
	@Overload
	public final void method1(String str) {
		System.out.println("final method 1"+str);

	}
	
	public static void staticMethod(String word) {
		System.out.println("Static method "+word);
		Object o;
	}
	
	
	
}

class Sub extends FinalMethods {

	
	// cannot ovverride since it is a final method.
//	public void method1() {
//		System.out.println("final method 1");
//
//	}
	
	

}