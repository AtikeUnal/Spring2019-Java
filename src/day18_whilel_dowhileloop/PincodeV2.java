package day18_whilel_dowhileloop;

import java.util.*;

public class PincodeV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int secretPincode = 4321;

		int pincode = 0;
		int attemps = 0;

		while (pincode != secretPincode && attemps <= 3) {
		System.out.println("Enter pincode");
			pincode=scan.nextInt();
			attemps++;
		
		if(attemps== 3 && pincode!=secretPincode) {
			System.out.println("card is blocked");
			return;
			
		}
		}
		
		System.out.println("acces granted,select operation");
		
	}

}
