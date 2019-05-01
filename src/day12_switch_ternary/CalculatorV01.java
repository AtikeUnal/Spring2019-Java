package day12_switch_ternary;
import java.util.*;
public class CalculatorV01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1,num2;
		Scanner scan=new Scanner(System.in);
		String operator;
		
		System.out.println("Enter number 1:");
		num1=scan.nextDouble();
		
		System.out.println("Enter number 2:");
		num2=scan.nextDouble();
		System.out.println("Select Operator: +, -, *, /,%");
		operator=scan.next();
		double result=0.0;
		if(operator.equals("+")) {
			result=num1+num2;
		}else if(operator.equals("-")) {
			result=num1-num2;
		}else if(operator.equals("*")) {
			result=num1*num2;
		}else if(operator.equals("/")) {
			result=num1/num2;
			//if(num==0.0);
		}else if (operator.equals("%")) {
			result=num1%num2;
			
		}else {
			System.out.println("Invalid operator selected: "+operator);
			return;//do not execute the remaning code.stop here.
		}
		System.out.println("Result: "+result);
		
		
		
		
	}

}
