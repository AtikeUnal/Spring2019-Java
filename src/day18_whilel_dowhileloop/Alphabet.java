package day18_whilel_dowhileloop;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letter = 'a';
		// System.out.println(letter);
		// letter++;
		// System.out.println(letter);

		while (letter <= 'z') {
			System.out.print(letter + " ");
			letter++;
		}
		System.out.println();// new line

		char capitals = 'A';
		while (capitals <= 'Z') {
			System.out.print(capitals + " ");
			capitals++;
		}
		System.out.println();

		char reverse = 'z';
		while (reverse >= 'a') {
			System.out.print(reverse + " ");
			reverse--;
		}
		System.out.println();
		
		
		
		String letters="";
		letters=letters+'a';
		System.out.println(letters);
		
		letters=letters+'b';
		System.out.println(letters);
		
		letters=letters+'c';
		System.out.println(letters);
		
		char myletters='a';
		
		while(myletters<='z') {
			letters=letters+myletters;
			System.out.println(letters);
			myletters++;
		}
		
		
		
		
		

	}

}
