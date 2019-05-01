package day12_switch_ternary;

public class OrLogicWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade='F';
		//A or B or C-->pass  D or E-->fail  other than-->invalid grade
		switch(grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		case'D':
		case 'E':
			System.out.println("Fail");
			break;
			default:
				System.out.println("Invalid grade");
		}
		
		
		
	}

}
