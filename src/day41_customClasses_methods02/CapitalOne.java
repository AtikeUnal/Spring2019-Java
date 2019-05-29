package day41_customClasses_methods02;

public class CapitalOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount bank1=new BankAccount();
		bank1.accountHolder="Atike Ilhan";
		bank1.accountNum=123123123;
		bank1.deposit(100);
		bank1.withdraw(20.2);
	
		bank1.showBalance();
		bank1.charge(10, "Scarf");
		bank1.showBalance();
	}

}
