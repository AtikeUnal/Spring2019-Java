package day15_String_manipulation;

public class StartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String word1="eclipse";
	
		System.out.println(word1.startsWith("e"));//true
		System.out.println(word1.startsWith("ec"));//true
		System.out.println(word1.startsWith("ecli"));
		System.out.println(word1.startsWith("Ec"));//false
		
		System.out.println(word1.endsWith("e"));//true
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.toUpperCase().endsWith("PSE"));
		
		
		String word2="Dr. Jackson";
		
		if(word2.startsWith("Mr.")) {
			System.out.println("man");
		}else if(word2.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if(word2.startsWith("Ms.")) {
			System.out.println("some woman");
		}else if(word2.startsWith("Dr.")) {
			System.out.println("Doctor");
		}else {
			System.out.println("UNKNOWN ");
		}
		
		
		
	}

}
