package day19_whilel_dowhileloops;

import java.util.*;

public class GuessANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random random= new Random();
System.out.println("#####WELCOME TO GUESS A NUMBER GAME######");
		int secretNumber=random.nextInt(101);//1-100
		int guessNumber;
		
		do {
			System.out.println("What is secret number:");
			guessNumber=scan.nextInt();// is used to generate random numbers
			if(guessNumber<secretNumber) {
				System.out.println("Your number is too small");
			}else if(guessNumber>secretNumber) {
				System.out.println("Your number is too large");
			}
		}while(guessNumber!=secretNumber);
		System.out.println("CONGRATS YOU WON!!!!");
		
		
		
		
		
		
		
		
		
	}

}
