package day23_LoopAndArrays;

public class PrintNumbersWithLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0;i<=10;i++) {
			//inner loop
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=10;i>=1;i--) {
			//inner loop
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		
		}
		
		
		
		
		
	}

}
