package day31_method03;

import java.util.Arrays;

public class MethodWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countWords("Java is fun");
		countWords("this is method with strings");
		
	}
public static void countWords(String sentence) {
	
	//String s="Java is fun";
	String str[]=sentence.split(" ");
	
	
	System.out.println(Arrays.toString(str));
	System.out.println("Number of words: "+str.length);
	
	
	
	
	
}
}
