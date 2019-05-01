package day23_LoopAndArrays;
import java.util.*;
public class SixWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
	
		String words="";
		String concat="";
		for(int i=1;i<6;i++) {
			 System.out.println("Enter " + i + " words");
	            words = scan.next();
			if((words.equals("java"))) {
				continue;	
			}
		concat+=words+",";
		}
	
	System.out.println(concat.substring(0, concat.length()-1));
}
}
