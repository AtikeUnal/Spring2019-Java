package day23_LoopAndArrays;

public class PrintRowsOfLetters {

	public static void main(String[] args) {
		// outer loop assigns how many times we want to print 
		//in this case we want to print 3 times
		for (int i = 1; i < 10; i++) {
			//inner loop
			if(i%2==0) {
			for (char a = 'a'; a <= 'z'; a++) {
				System.out.print(a);

			}
			}else { 
				for(char letter ='z';letter>='a';letter--) {
					System.out.print(letter);
			}
			}
			System.out.println();
			System.out.println("***********************************************************");
		}

	}

}
