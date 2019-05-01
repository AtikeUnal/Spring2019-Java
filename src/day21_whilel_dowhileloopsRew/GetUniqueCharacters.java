package day21_whilel_dowhileloopsRew;

import java.util.*;

public class GetUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter word");
		String word = scan.next();
		String unique = "";
		
//		
//		for(int i =0; i< word.length(); i++) {
//			//System.out.println(i);
//			
//			System.out.println(word.charAt(i));
//		}
//		
		
			for(int i =0; i< word.length(); i++) {
				
				char letter= word.charAt(i);
			//	System.out.println(letter);
			if(!unique.contains(""+letter)) {
				unique= unique+letter;
				
			}	
			}
			
			System.out.println(unique);
		
		
	}

}
