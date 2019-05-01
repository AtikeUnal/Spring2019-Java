package day09_stringequals_conditionals;
import java.util.*;
public class Canada {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	
		System.out.println("What is the capital of Canada?");

		Scanner keyword=new Scanner(System.in);
		
		String capital=keyword.nextLine();
		
		if(capital.equalsIgnoreCase("Ottawa")) {//capital.equalsIgnorcase("Ottawa");
			System.out.println("Your answer is correct!");
		}else {
			System.out.println("your answer is incorrect! "+capital+ " is not capital of Canada");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
