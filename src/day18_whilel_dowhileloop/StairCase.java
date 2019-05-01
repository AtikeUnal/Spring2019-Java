package day18_whilel_dowhileloop;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stairs = "*";
		//System.out.println(stairs);
		//stairs = stairs + "*";
		//System.out.println(stairs);
		//stairs += "*";
		//System.out.println(stairs);

		int number = 1;

		//while (number <= 10) {
		//	System.out.println(stairs);
		//	stairs += "*";
		//	number++;
		
			while(stairs.length()<=10) {
			System.out.println(stairs);
			stairs+="*";
			
			int num=10;
			
			while(num>=1) {
				System.out.println(stairs);
				stairs+="*";
				num--;
			}
			}
			
		}

	}


