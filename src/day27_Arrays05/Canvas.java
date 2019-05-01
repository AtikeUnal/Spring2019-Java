package day27_Arrays05;

import java.util.Arrays;

public class Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		https://learn.cybertekschool.com/courses/147 Java Programming

String url = "https://learn.cybertekschool.com/courses/149";
//147 -> Java programming
//204 -> Mentoring sessions
//149 -> SDLC
//152 -> QA Testing
//144 -> Team activity
//143 -> Welcome Kit
//--> split by "/" and get the last value from array
//--> convert it to integer. Integer.parseInt(...) -> int value
//--> switch statement and find the matching
	
String[]url1=url.split("/");

//System.out.println(url1[4]);

		int courseId=Integer.parseInt(url1[4]); //[url1.length-1] da koyabilirsin.
		System.out.println(Arrays.toString(url1));
		switch(courseId) {
		case 147:
			System.out.println("Java programming");
			break;
		case 204:
			System.out.println("Mentoring sessions");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("QA Testing");
			break;
		case 144:
			System.out.println(" Team activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
			default:
				System.out.println("invalid number for the course");
		}
			
	}

}
