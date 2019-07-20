package day63_Exceptions;

import java.io.IOException;

import day62_Exceptions.RunTimeError;

public class ThrowAndThrows {
public static void main(String[] args) {
	System.out.println("hello world");
	//throw new RuntimeException("this is thrown using throw keyword");
	
	String username="";
	
	if(username.isEmpty()) {
		throw new RuntimeException("Username  cannot be empty");
	}else {
		System.out.println("Valid username");
	}
	
	
	try {
		throw new IOException();
		
	}catch(IOException e) {
		e.printStackTrace();
	}
	try {
	sleep(2);
	}catch(InterruptedException e) {
		
	}
}




public static void sleep(int seconds) throws InterruptedException {
	Thread.sleep(seconds*1000);
}
public static void sleep2(int seconds) throws InterruptedException {
	sleep(2);
}

}
