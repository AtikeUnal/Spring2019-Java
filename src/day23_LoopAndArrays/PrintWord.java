package day23_LoopAndArrays;

public class PrintWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "java";
		for(int i =0; i<=word.length()-1; i++ ) {
			if(word.substring(i, i+1).equals("a")) {
				continue;
			}
			System.out.println(word.substring(i,i+1));
		}
	}

}
