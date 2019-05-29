package day41_customClasses_methods02;

public class BankAccount {

	double balance;
	String accountHolder;
	int accountNum;
	 
	public void deposit(double amount) {
		System.out.println("Depositing $ "+amount+ " to "+accountNum);
		balance+=amount;
		
	}
	
	public void withdraw (double amount) {
		System.out.println("Withdrawing $ "+amount+" from "+accountNum);
		balance-=amount;
		if(balance<0) {
			balance-=35;
		}
	}
	
	public void showBalance () {
		System.out.println("===================");
		System.out.println("account holder: "+accountHolder);
		System.out.println("Account Number: "+accountNum);
		System.out.println("balance $ "+balance);
	}
	
	public void charge(double price, String item) {
		
		if(balance>= price) {
			System.out.println("You can buy "+item+" to this "+price+" from this "+accountNum);
		}else {
			System.out.println("insufficient funds to purchase " +item+" to this "+price+" from this "+accountNum);
		}
	}
	
}
