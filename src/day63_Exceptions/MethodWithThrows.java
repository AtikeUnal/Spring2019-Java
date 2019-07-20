package day63_Exceptions;

public class MethodWithThrows {

	
	public static void main(String [] args) {
		playSoccer(); //does not complain bcs it is runtime exception
		
	
	try {
	playWithMatches();
	}catch(Exception e) {
		System.out.println("Stop the fire");
	}
}
	public static void playWithMatches()throws Exception{
		System.out.println("Playing with matches exception ");
	}
	
	
	public static void playSoccer() throws RuntimeException {
		System.out.println("Playing soccer with friends");
	}
	
	
	

}