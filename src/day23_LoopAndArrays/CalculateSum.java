package day23_LoopAndArrays;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calculate 6 nums if nums less or equals to 0 ignore this number
		//int count=0;	
		int sum = 0;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println("Enter a number:");
			num=scan.nextInt();
			if(num<=0) {
			//	count++;
				continue;
			}
			sum+=num;
		}
		System.out.println("Total sum: "+sum);
	}

}
