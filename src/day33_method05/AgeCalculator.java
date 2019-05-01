package day33_method05;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(calculateAge(1987));
		int age2 = calculateAge(1983);
		System.out.println(age2);
		System.out.println(calculateAge(2020));
		System.out.println(calculateAge(2013));
		System.out.println(calculateAge(2016));
	}

	public static int calculateAge(int year) {

		int age = 2019 - year;

		if (age < 0) {
			System.out.println("Invalid age");
			return 0;
		}

		if (age >= 1 && age < 15) {
			System.out.println("child");
		} else if (age > 15 && age < 25) {
			System.out.println("youngster");
		} else if (age > 26 && age < 64) {
			System.out.println("adult");
		} else {
			System.out.println("senior");
		}

		return age;
	}

}
