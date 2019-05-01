package day19_whilel_dowhileloops;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//bob,madam,civic,racecar,anna,javaj
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter word to test:");
		String word=scan.next();
		String reversed="";
		
		
		int reverse = word.length()-1;
		 while(reverse>=0) {
			 reversed=reversed+word.charAt(reverse);
			 reverse--;
		 }
		
			System.out.println(reversed);	 
				 if(reversed.equalsIgnoreCase(word)) {
					 System.out.println("It is Palindrome");
				 }else {
					 System.out.println("It is not Palindrome");
				 }
		
	}

}
