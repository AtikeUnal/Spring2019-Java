package day23_LoopAndArrays;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			for(int i=1;i<=100;i++) {
				if(i%2>0) {
					continue;
				}
				System.out.println("Number"+i);
			}
		
		for(int a=1; a<=20;a++) {
			if(a>=5 && a<=10) {
				
				continue;
			}
			System.out.println(a);
		}
		
		
		
	}

}
