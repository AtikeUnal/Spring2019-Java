package day62_Exceptions;

public class TryCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			 int []nums= {32,3,5,76};
//handle if any issues with below line if any excepton happens print wrong Index
			 System.out.println(nums[7]);
			 
		}catch(Exception e) {
			System.out.println("Wrong Index");
		}
		
		System.out.println("Some code after array");
		try {
		int j=100;
		int n=j/0;
		}catch(ArithmeticException e) {
		System.out.println("cannot divide / zero");
		//e.printStackTrace();
		e.getMessage();
		}
		
		System.out.println("after try catch");
	}

}
