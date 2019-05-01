package day23_LoopAndArrays;

public class Loopnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num = 50;
		for (int i = 1; i <= 50; i++) {

			if ((i % 5 == 0)&& (i% 20 !=0)){
				continue;
			}
			if (i % 21 == 0) {
				break;
			}
			
			System.out.print(i + ",");
		}

	}

}
