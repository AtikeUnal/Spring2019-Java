package day62_Exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedVSUnchecked {
public static void main(String[] args) {
	
	//checked exception - Interupted Exception
	//handle or declare
	try {
		System.out.println("Sleeping");
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		System.out.println("Thread is interrupted!");
	}
	
System.out.println("Woke up");	
	
	try {
		URL url= new URL("google.com");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
	
		System.out.println("Invalid URL");
	}
	
}
}
