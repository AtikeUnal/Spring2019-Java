package day31_method03;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(5, 6);
		substarct(6, 5);
		multiply(5, 6);
		divide(12, 7);
		remainder(30, 6.9);
		
		// using scanner pass 2 numbers
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double numInput = scan.nextDouble();
		double num2Input = scan.nextDouble();
		System.out.println("Select operation: '+','-','*','/','%' ");
		String operator = scan.next();

		switch (operator) {
		case "+":
			add(numInput, num2Input);
			break;
		case "-":
			substarct(numInput, num2Input);
			break;
		case "*":
			multiply(numInput, num2Input);
			break;
		case "/":
			divide(numInput, num2Input);
			break;
		case "%":
			remainder(numInput, num2Input);
			break;
		default:
			System.out.println("Invalid operator!");
		}

		

		
	}

	public static void add(double num1, double num2) {

		double result = num1 + num2;
		System.out.println("Result: " + result);

	}

	public static void substarct(double num1, double num2) {

		double result = num1 - num2;
		System.out.println("Result: " + result);

	}

	public static void multiply(double num1, double num2) {

		double result = num1 * num2;
		System.out.println("Result: " + result);

	}

	public static void divide(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("cannot / by zero");
			return;
		}
		double result = num1 / num2;
		System.out.println("Result: " + result);

	}

	public static void remainder(double num1, double num2) {

		double result = num1 % num2;
		System.out.println("Result: " + result);

	}
}