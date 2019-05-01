package day27_Arrays05;

import java.util.*;

public class Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int hours = 0; // 0-23
		int minutes = 0; // 0-59
		//
		// int[]time1=new int[2];
		// int time2[]=new int[2];

		int[] time1 = { scan.nextInt(), scan.nextInt() };
		int[] time2 = { scan.nextInt(), scan.nextInt() };

		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time 1 has Invalid time");
			return;
		}
		
		 if (time1[1] < 0 || time1[1]> 59) {
			System.out.println("Time 1 has Invalid minute");
			return;
		}

		 if (time2[0] < 0 || time2[0] > 23) {
				System.out.println("Time2 has Invalid time");
				return;
			}
			
			 if (time2[1] < 0 || time2[1]> 59) {
				System.out.println(" time 2 has Invalid minute");
				return;
			}
			 
			 
		if (time1[0] < time2[0]) {
			System.out.println("time 1 is earlier");
		} else if (time1[0] > time2[0]) {
			System.out.println("time 2 is earlier");
		} else {//hours are equal we need to check minutes
			if (time1[1] < time2[1]) {
				System.out.println("time 1 is earlier");
			} else if (time1[1] > time2[1]) {
				System.out.println("time 2 is earlier");
			} else {
				System.out.println("equal times");
		}
		
	}

}}
