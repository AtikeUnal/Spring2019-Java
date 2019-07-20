package day63_Exceptions;

public class OrCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abc";
		try {
			System.out.println(str.charAt(10));
			String str2 =null;
			System.out.println(str2.toUpperCase());
		}catch(IndexOutOfBoundsException | NullPointerException e) { // we can group two kind of sibling exception in the same line with a single pipe)
			System.out.println("exception happened");
			
		
			
		}finally {
			System.out.println("Finally");
			
		}
		
		
	}

}
