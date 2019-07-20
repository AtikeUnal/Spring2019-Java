package day62_Exceptions;

public class ExceptionInCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="10j"; //A
		
		
		try {
			
		int n=Integer.parseInt(str);//B
		System.out.println(n);//C
		}catch(NumberFormatException e) {
			System.out.println(str.charAt(10));//D
			System.out.println("In the Catch"); //E
		}finally {
			System.out.println("Hello From Finally Block ");//F
		}
		System.out.println("Bye Bye!");//Z
		
		
	}

}
