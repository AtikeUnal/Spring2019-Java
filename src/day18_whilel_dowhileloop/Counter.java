package day18_whilel_dowhileloop;

public class Counter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		int num=1;
		while(num<=10) {
			System.out.print(num+", ");
			++num;
			Thread.sleep(1000);//1 seconds 
		}
		
		System.out.println("\nNum value after loop: "+num);
		
		
	
			int num2=11;
		while(num2>=1) {
			System.out.print(num2+", ");
			num2--;
			Thread.sleep(465);
		}
	
	
	
	
	
	
	
	}	
}
