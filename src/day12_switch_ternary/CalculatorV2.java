package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1, num2;
		Scanner scan = new Scanner(System.in);
		String operator;

		System.out.println("Enter number 1:");
		num1 = scan.nextDouble();

		System.out.println("Enter number 2:");
		num2 = scan.nextDouble();
		System.out.println("Select Operator: +, -, *, /,%");
		operator = scan.next();
		double result = 0.0;

		switch (operator) {
		case "+":
			result = num1 + num2;

			break;
		case "-":
			result = num1 - num2;
			System.out.println(result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println(result);
			break;
		case "/":
			result = num1 / num2;
			System.out.println(result);
			break;
		case "%":
			result = num1 % num2;
			System.out.println(result);
			break;

		default:

			System.out.println("Not a number");

		}

		/*
		 * if(operator.equals("+")) { result=num1+num2; }else if(operator.equals("-")) {
		 * result=num1-num2; }else if(operator.equals("*")) { result=num1*num2; }else
		 * if(operator.equals("/")) { result=num1/num2; //if(num==0.0); }else if
		 * (operator.equals("%")) { result=num1%num2;
		 * 
		 */

	}

}
