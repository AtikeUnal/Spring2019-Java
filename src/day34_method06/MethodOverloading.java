package day34_method06;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add(3, 5);
add(5.6, 6.9);
add("8","9");
	}
public static void add(int num1,int num2) {
	int result =num1+num2;
	System.out.println("Result: "+result);
}


public static void add(double num1, double num2) {
	double result= num1+num2;
	System.out.println("Result: "+result);
}


public static void add(String num1, String num2) {
	String result= num1+num2;
	System.out.println("Result: "+result);
}


}
