package day19_whilel_dowhileloops;

public class DoWhileRunOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;// it has to be outside the do part othervise we are not able to see this
			//in this example do while loop body code will run once then test the condition.
		    //then exit the loop as condition is false	
		do {
			System.out.println("Count: "+ count);
			count++;
		}while(count<=5);
	}

}
