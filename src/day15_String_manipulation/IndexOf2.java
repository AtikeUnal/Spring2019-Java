package day15_String_manipulation;

public class IndexOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstdash = list.indexOf("-");
		System.out.println("first dash: "+firstdash);
		
		int secondDash = list.indexOf("-",5);
		System.out.println("second dash: "+secondDash);
		
		int thirdDash = list.indexOf("-",secondDash+1);
		System.out.println("third dash: "+thirdDash);
		
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last dash is: "+lastDash);
		
		
		
		
		
		
		
		
	}

}
