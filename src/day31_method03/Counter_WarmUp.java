package day31_method03;
import java.util.*;
public class Counter_WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		create a class Counter
//		
//		1) name: countUp
//		   return type: void
//		   param: int
//		   it prints from 1 to the value of the param
//		   countUp(5);
//		   1 2 3 4 5
//
//		   param value less than 1 then
//		   print "invalid input"
//
//		2) name countDown
//		   return type: void
//		   param: int
//		   it prints from param value till 1
//		   countDown(5);
//		   5 4 3 2 1
//
//	       countDown(0);
//	       "Invalid input"
//		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num to countUp");
		int inputNum=scan.nextInt();
		
		countUp(5);
		countDown(5);
		countUp(inputNum);
	}

	public static void countUp(int num) {

		if (num < 1) {
			System.out.println("invalid input-" + num);
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

	}

	public static void countDown(int num2) {

		if (num2 < 1) {
			System.out.println("invalid input- " + num2);
		} else {
			for (int i = num2; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

}
