package day20_forLoop;

public class ForLoop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			System.out.println("Love Java");
		}

		for (int i = 5; i <= 15; i++) {
			System.out.print(i+" ");
		}
//for loop 20-10
		System.out.println();
		
		for(int num = 20; num>=10; num-- ) {
			System.out.print(num+" ");
			Thread.sleep(546);;
		}
	}

}
