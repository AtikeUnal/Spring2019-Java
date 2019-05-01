package day24_Arrays;

import java.util.Arrays;

public class SumPfTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[3];

		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 20;

		// System.out.println(numbers[1]);
		System.out.println(Arrays.toString(numbers));
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

		}
		System.out.println("sum: " + sum);
		// find largest value in the array

		int max = Integer.MIN_VALUE;

		for (int a = 0; a <numbers.length; a++) {
			if (numbers[a] > max) {
				max = numbers[a];
			}

		}
		System.out.println("Max value " + max);

		
		int min=Integer.MAX_VALUE;
		for(int k=0; k<numbers.length;k++) {
			if(numbers[k]<min) {
				min=numbers[k];
			}
		}
		System.out.println("min value: "+min);
	}

}
