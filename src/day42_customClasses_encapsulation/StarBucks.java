package day42_customClasses_encapsulation;
import java.util.*;
public class StarBucks {

	public static void main(String[] args) {
		//declare an array that can store 2 coffee objects
		
		
		
		
		
		//declare coffee array that can store to 2 coffee objects
		WarmUp_Starbucks[] coffeeArray =new WarmUp_Starbucks[2];
		//create coffee object and assign to index 0
		coffeeArray[0]=new WarmUp_Starbucks();
		//access coffee object in index0 and set data
		coffeeArray[0].setCoffeeInfo("ESSPRESSO", "TALL", 2.55, 7);
		coffeeArray[0].getCoffeInfo();
		
		
		
		
		
		//create a single object first 
		// assign data
		WarmUp_Starbucks latte =new WarmUp_Starbucks();
		//assign the late object to index 1 of the array
		latte.setCoffeeInfo("Caffe Latte", "GRAnde", 3.85, 190);
		
		coffeeArray[1]=latte;
		
		coffeeArray[1].getCoffeInfo();
		
	}
	
	
}
