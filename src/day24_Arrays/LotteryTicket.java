package day24_Arrays;

import java.util.Arrays;

public class LotteryTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[]lotteryNumbers= {12,45,3,62,42,90};
		System.out.println(Arrays.toString(lotteryNumbers));
		Arrays.parallelSort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
		
		
		
	int index=	Arrays.binarySearch(lotteryNumbers, 45);
		
		System.out.println(index);
int index2=	Arrays.binarySearch(lotteryNumbers, 5);// if it is not there it returns as -2
		
		System.out.println(index2);
	}

}
