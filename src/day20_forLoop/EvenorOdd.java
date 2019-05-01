package day20_forLoop;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using loop 1-100
		// using all even numbs
		// using odd numbers print same line
		// sum of odd sum of evens calculate them and print

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");

			}
		}
		System.out.println();
		for (int j = 0; j < 100; j++) {
			if (j % 2 !=0) {
				System.out.print(j + " ");

			}
		}
		System.out.println();
		int sumEven = 0;
		int sumOdd = 0;

		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				sumEven += num;
			} else {
				sumOdd += num;
			}
		}
System.out.println("Sum of evens: "+sumEven);
System.out.println("Sum of odds: "+sumOdd);
	}

}
