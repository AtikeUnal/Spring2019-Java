package day61_polymorphism03;

import java.util.Scanner;

import day49_inheritance02.TV;
import day57_interface.Tesla;
import day60_polymorphism02.*;

public class MethodUsingPolymorphism {

	public static void purchase(AppleDevice ap) {
		System.out.println("purchasing: " + ap.getClass().getSimpleName());

	}

	public static void giveAnyObject(Object object) {
		System.out.println("You gave me : " + object.getClass().getSimpleName());
	}
	
	
public static AppleDevice buildAppleDevice() {
	
	AppleDevice devices= new  AppleWatch();
	//AppleWatch watch =(AppleWatch)devices;
	
	//return new Mac();
	return devices;
	// you need to know inheritance hierarchy
	//AppleStore
	//Ipad
	//watch
	//mac
	
	//by looking at hiearchy above it means we can write methods
	
	
}

public static  AppleDevice buildDevice(String type) {
	
	if(type.equals("ipad")) {
		return new Ipad();
		
	}else if(type.equals("mac")) {
		return new Mac();
	}else if(type.equals("applewatch")) {
		return new AppleWatch();
	}else {
		return null;
	}
}
	public static void main(String[] args) {

		purchase(new Mac());

		AppleDevice dev = new AppleWatch();
		purchase(dev);
		giveAnyObject(new String("Hi"));
		giveAnyObject(new Scanner(System.in));
		giveAnyObject(new TV());
		giveAnyObject(new Tesla());
		giveAnyObject(55);// auto box to Integer
		int n=33;
		giveAnyObject(n);
		
		AppleDevice retdev=buildAppleDevice();
		retdev.use();
	}
}
