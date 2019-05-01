package day11_logical_nestrdif;
import java.util.*;
public class Tollcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard=new Scanner(System.in);
		System.out.println(" Enter Vheicle Type: ");
		int carType=keyboard.nextInt();
		
		System.out.println(" Is it rush hours: yes | no");
		String rushHour=keyboard.next();
		//check if rushHour string is yes then assign true to isRushHour
		boolean isRushHour;
		if (rushHour.equalsIgnoreCase("yes")) {
		isRushHour=true;
		}else {
			isRushHour= false;
		}
		System.out.println(isRushHour);
		
		double price=0.0;
		if (carType==1) {
			if(isRushHour) {
			}else {
				price=5.0;}
			}else if(carType==2) {
				if(isRushHour) {
					price=55.30;
					
				}else {
					price=15.99;
					
				}
			}
		
	System.out.println("Toll Price"+price);
	
	
	}
		
		
	}


