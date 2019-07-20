package day61_polymorphism03;

import day60_polymorphism02.*;

public class DownCasting {

	public static void main(String[] args) {

		AppleDevice appDev = new Ipad();
		appDev.use();

		Ipad i2 = (Ipad) appDev;
		i2.use();
		i2.draw();
		AppleDevice dev2= new Mac();
		dev2.use();
		
		//using another reference variable
		
		
		Mac mac =(Mac)dev2;
		mac.code();
		System.out.println(mac.model);
		
		
		
		//cast and call in single statement
		((Mac)dev2).code();
		
		System.out.println( ((Mac)dev2).model);
	}

}
