package day13_ternary_strings_intro;
import java.util.*;
public class ClassCarSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Which type of car you are interested? ");
System.out.println(" 1) American\n 2) Japanese\n 3) German\n 4) Italina\n 5) Korean");
		Scanner scan=new Scanner(System.in);
		int carType;
		double averagePrice=0.0;
		String carOptions;
		carType= scan.nextInt();
		carOptions="";
		String carOrigin="";
		switch (carType) {
		case 1:
			carOptions="American: Ford, Dodge, Tesla, Chevrolet, Lincoln";
			  averagePrice= 33000.0;
			  carOrigin="American";
			break;
		case 2:
			carOptions= "Japanese: Toyota, Mitsubisi, Honda, Subaru, Mazda";
			averagePrice= 32000.0;
			carOrigin="Japanese";
			break;
		case 3:
			carOptions= "German: Bmw, VW, Audi, Mercedes, Porsche";
			averagePrice= 55000.0;
			carOrigin="German";
			break;
		case 4:
			carOptions="Italian: Alfa Romeo, Ferrari, Lamborghini, Fiat";
			averagePrice= 85000.0;
			carOrigin="Italian";
			break;
		case 5:
			carOptions="Korean: Kia, Hyundai, Daewoo";
			averagePrice= 25000.0;
			carOrigin="Korean";
			break;		
			default:
			System.out.println("Car Type not available");
			return;
		}
		System.out.println("You selected "+carOrigin+" car and your options are "+carOptions+".");
		System.out.println("Average Price: "+ averagePrice);
		
		
		
		
		
		
	}

}
