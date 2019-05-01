package day33_method05;

import day31_method03.Calculator;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CalculatorMethod.add(3, 1));
		System.out.println(CalculatorMethod.multiply(5, 7));
		System.out.println(CalculatorMethod.minus(5, 2));
		System.out.println(CalculatorMethod.divide(6, 9));

		int addResult = CalculatorMethod.add(21, 12);
		double mResult = CalculatorMethod.multiply(21, 12);
		int miResult = CalculatorMethod.minus(21, 12);
		int dResult = CalculatorMethod.divide(21, 12);

		System.out.println(addResult);
		System.out.println(mResult);
		System.out.println(miResult);
		System.out.println(dResult);
		
		
		double a = 10.0, b=5.0;
		double myResult= CalculatorMethod.multiply(a, b);
		System.out.println(myResult);
		
		
		int []dNum= {2,4};
		int result=CalculatorMethod.minus(dNum[0], dNum[1]);
		System.out.println(result);

	if (CalculatorMethod.add(10,16)==26) {
		System.out.println("Add Unit Test Passed");
	}else {
		System.out.println("Add Unit test failed");
	}
	
	
	
	
	
	
	
	
	}

}
