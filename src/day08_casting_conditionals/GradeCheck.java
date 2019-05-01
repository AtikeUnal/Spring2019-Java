package day08_casting_conditionals;
import java.util.*;
public class GradeCheck {

	public static void main(String[] args) {
//char grade scan.next().charAT(0);
		/*if grade is 'A'=>Excellent Job! Keep it up!
		//else
		 * how many points did you miss for 'A'?
		 * int points =scanner
		 * print "your grade B is not good enough"
		 * "you could earn 10 more points if you studied harder."
		
		
		
		*/
		System.out.println("### START PROGRAM ###");
		Scanner keyboard= new Scanner(System.in);
		System.out.println("What is your grade? ");
			
		char grade= keyboard.next().charAt(0);
		if (grade== 'A') {
			System.out.println("Excellent Job! Keep it up!");
			
		}else { 
			System.out.println("how many points did you miss for 'A'?");
			int points= keyboard.nextInt();
			System.out.println("your grade " +grade+"  is not enough");
			System.out.println("you could earn "+points+" points if you studied harder.");
			
			
			
		}
	}

}
