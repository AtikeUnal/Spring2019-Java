package day28_multiD_Arrays;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Reversing sentence.
//		 Create a class ReverseSentence
//		 Create a String variable sentence and assign value
//		 - find out and print number of words
//		 - reverse the sentence and assign to new String called reversed
//		 - print the reversed
//
//		 String sentence = "you are very interesting person";
//		 5 words
//		 person interesting very are you
//
//		 "you love java"
//		 "java love you"
	
		
		String sentence = "you are very interesting person";
		String[]str=sentence.split(" ");
		System.out.println(Arrays.toString(str));
		String reversed="";
		for(int i=str.length-1; i>=0; i--) {
			
			reversed+=str[i]+" ";
			
		}
		
		System.out.println(reversed);
	}

}
