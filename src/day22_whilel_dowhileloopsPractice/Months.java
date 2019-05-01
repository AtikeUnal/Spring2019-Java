package day22_whilel_dowhileloopsPractice;
import java.util.*;
public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		
		int month=1;
		
		
		do {
		System.out.println("Enter month: ");	
			 month=scan.nextInt();
			 
		}while(month<=12&& month>=1);
		
		System.out.println("Invalid Month "+month);
		
		
		
		
		
	}

}
