package day33_method05;

public class CalculatorMethod {

	public static void main(String[] args) {
		
		addVoid(4,7);// you csnnot store any value in it bcs it is void it just performs the action.
	System.out.println(	add(4,7));
		//int=result=add(4,8);
	//System.out.println(result);
		
	System.out.println(multiply(3,4));	
System.out.println(minus(9,2));
System.out.println(divide(10,2));
	}
public static void addVoid(int num1,int num2) {
	
	int sum=num1+num2;
	System.out.println("Sum:"+sum);
	
}
public static int add(int num1,int num2) {
	int sum=num1+num2;
	return sum;
	
}
public static double multiply(double num1,double num2) {
	double result=num1*num2;
	return result;
	
}
public static int minus(int num1,int num2) {
	int result= num1-num2;
	return result;
}
public static int divide (int num1,int  num2) {
	
	if(num2==0) {
		System.out.println("error cannot /by 0");
		return 0;
		//System.exit(0);
	}else {
	
	int result= num1/num2;
	return result;
}
	}
}
