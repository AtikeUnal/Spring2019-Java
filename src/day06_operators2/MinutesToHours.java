package day06_operators2;

public class MinutesToHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//5 hours and 10 minutes
	//2 hours 5 minutes
		int minutes= 150;

		int hours= minutes/60;
		
		int remainingMinutes=minutes % 60;
		
		System.out.println(remainingMinutes);
		System.out.println(hours);
		System.out.print(minutes+ " minutes is ");
		System.out.println(hours+" hours and "+remainingMinutes+ " minutes" );
		
	}

}
