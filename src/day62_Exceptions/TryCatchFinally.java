package day62_Exceptions;

public class TryCatchFinally {
public static void main(String[] args) {
	
	String str="selenium";
	try {
		System.out.println(str.length());
		System.out.println(str.charAt(100));
	}catch (Exception e) {
		System.out.println("Enter correct index");
		return;
	}finally {
		System.out.println("Finally Block");	
		
	}
	System.out.println("After try catch block");
	
}
}
