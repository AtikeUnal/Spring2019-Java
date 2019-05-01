package day20_forLoop;

import java.util.*;

public class ZombieAttack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int inhabitants = scan.nextInt();
		// System.out.println("inhabitants is "+inhabitants);
		int day = 0;
		while (inhabitants > 0) {
			System.out.println("Day " + day + " [" + inhabitants + "]");
			inhabitants = inhabitants / 2;
			day++;

		}
		System.out.println("---- EXTINCT ----");

	}

}
