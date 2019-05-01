package day23_LoopAndArrays;
import java.util.*;
public class WarmUpPrimeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a prime number");
		int prime=scan.nextInt();
		
		
		int count;
		for(int i=2;i<prime;i++) {
			
			if(prime%i==0) {
				System.out.println(prime+" Not a prime number");

				return;
			}
		}
						
			System.out.println(prime+" prime number");
		
		
		
		
	}

}
