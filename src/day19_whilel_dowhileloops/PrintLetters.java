package day19_whilel_dowhileloops;

public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "FAcebook";

		int idx = 0;
		//System.out.println(word.charAt(idx));
		//idx++;
		//System.out.println(word.charAt(idx));
		
		
		
		while(idx<word.length()) {
			System.out.println(word.charAt(idx));// you can also idx++ into the parantesis.
			idx++;
		}
		
			int lastword=word.length()-1;//5
			
			
			while(lastword>=0) {
				System.out.println(word.charAt(lastword));
				lastword--;
			}
			
			
			
		}
	}


