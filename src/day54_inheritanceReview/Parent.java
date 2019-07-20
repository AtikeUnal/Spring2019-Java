package day54_inheritanceReview;

public class Parent {

	static int num1; // inherited
	int num2; // instance variable

	public void method1() {

	}

	Parent() {

		System.out.println("");
	}

	static {
		System.out.println("Static block");
	}

	{
		System.out.println("Init block");
	}
private void methodB() {  //private is not inheritable cannot be visible outside of the class
	/*
	 * features that cannot be inherited 
	 * 1.constructor
	 * 2.features that are not visible
	 * a-private AM
	 * b-default AM(when sub class and super class are not in same class.
	 * 3. abstract method (if sub class is not abstract)
	 */
}
	public static class InheritedReview extends Parent {
/*
 sub class can only have one super class
 super class can have multiple sub classes 
 final class cannot be extended
 */
		
		private int students=100;
		
		
		
		public static void main(String[] args) {
			System.out.println(num1);
			System.out.println(new InheritedReview().num2);
			new InheritedReview();
		}
	}
}