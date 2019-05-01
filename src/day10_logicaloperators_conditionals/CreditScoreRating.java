package day10_logicaloperators_conditionals;
import java.util.*;
public class CreditScoreRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		System.out.println("Enter your credit score:");
		int creditScore=800;
		
		//750-850 score
		
		if(creditScore>=750 && creditScore<=850) {
			System.out.println("EXCELLENT");
		}// if two conditions is true it is true
		else if(creditScore>=700 &&creditScore<=749) {
			System.out.println("GOOD");
		}else if(creditScore>=650&& creditScore<=699) {
			
		}else if(creditScore>=550&& creditScore<=649){
			System.out.println("POOR");
		}else if (creditScore >= 0 && creditScore<=549){
			System.out.println("BAD");
		}else {
			System.out.println("Invalid Score!");
		}
		
		
		
		
		
		
		
		
	}

}
