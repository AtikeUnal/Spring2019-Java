package day46_static_keyword;

public class CalcTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double result=Calculator.plus(3, 4);    //this calling is static way no need to create an object.
		
		System.out.println(result);
		
		result =Calculator.minus(44,14);
		System.out.println(result);
		
		
		Calculator c =new Calculator();
		System.out.println(c.multiply(4, 2));
		
		int i =Integer.parseInt("33");
	boolean cd=	Character.isDigit('5');
	
	System.out.println(cd);
	
	
	}

}
