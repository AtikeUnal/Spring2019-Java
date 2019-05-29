package day49_inheritance02_2;

import day49_inheritance02.*;
//ipad is a sub class in a different package
public class Ipad extends Device {

	public void readEbook(String title) {
		
		
		System.out.println("Reading a book "+title+" using "+brand+"tablet");
		
		System.out.println("Model- "+model);
		
	//	System.out.println("Price"+price);  not visible not inherited bcs it is default.
		
	//	System.out.println("made in "+country);
	}
}
