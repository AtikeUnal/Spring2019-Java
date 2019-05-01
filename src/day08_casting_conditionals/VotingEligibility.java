package day08_casting_conditionals;
import java.util.*;
public class VotingEligibility {

	public static void main(String[] args) {

int votingAge=18;
Scanner scan=new Scanner(System.in);
System.out.println("How old are you?");

int yourAge= scan.nextInt();
int years= yourAge-votingAge;
//int moreYears=votingAge-yourAge;
	if (yourAge>= votingAge) {
	
				System.out.println("You are eligible to vote");
				System.out.println("you are eligible for "+years+ " years");
	
	}else {
				System.out.println("you are not eligable to vote");
				System.out.println("You still have "+(-years)+" more years to go");
				//System.out.println("You still have"+(votingAge-yourAge)+"more years to go");
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
