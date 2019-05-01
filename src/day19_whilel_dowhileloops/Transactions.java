package day19_whilel_dowhileloops;

import java.util.*;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int count = 0;
		System.out.println("What is your current balance ?");
		double balance = scan.nextDouble();

		while (balance > 0) {
			count++;
			System.out.println("What is transaction #" + count + " amount?");
			double transaction = scan.nextDouble();
			//balance = balance - transaction; // balance-=transactions;

			if (transaction > balance) {
				System.out.println("Your balance is about to be negative due to this transaction");
				continue;
			}
			balance -= transaction;
			System.out.println("Current balance: " + balance);

		}

		System.out.println(" You are insufficent funds for any more transactions,your balance is: " + balance);
		System.out.println("Transaction total count: " + count);

	}

}
