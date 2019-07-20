package day63_Exceptions;

public class CustomExceptionsTest {
public static void main(String[] args) throws NeedSomeCoffeeException {
	
	double balance=2000;
	double transaction =210;
	
	if (transaction >balance) {
		throw new InsufficentFundsException();
	}else {
		System.out.println("Purchase succesful.");
		balance-=transaction;
	}
	
	
	
	
	throw new NeedSomeCoffeeException("getting sleepy");
	
}





}
