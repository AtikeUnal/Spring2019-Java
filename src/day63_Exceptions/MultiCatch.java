package day63_Exceptions;

public class MultiCatch {
	public static void main(String[] args) {
		
		
		
		try {
		//	System.out.println(0/0);
		//	String str=null;
		//	System.out.println(str.length());
			
			int []n = {10,4};
			System.out.println(n[2]);
		}catch(ArithmeticException a) {
			System.out.println("Arithmetic Exception Happened");
		}catch(NullPointerException n) {
			System.out.println("NullPointer exception happened");
		}catch(RuntimeException e) {  //  parent must be at the bottom
			
			System.out.println("RuntimeException happend");
		}
		
	}
	

}
