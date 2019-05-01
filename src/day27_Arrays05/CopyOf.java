package day27_Arrays05;

import java.util.Arrays;

public class CopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] d1 = { 2.2, 3.89, 12.4 };
		
		double[]d2=d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		
		d1[0]=1000.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		
		d2[1]=3.4;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		
		
		double []d3=Arrays.copyOf(d2, d2.length);  // it doesn't effects copied array just copies the values
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3));
		
		
		d2[0]=1;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3));//independent
		
		
		
		
		
		
		
		
	}

}
