package day54_inheritanceReview;
class data1{
	
	private String password="123456";
	private final int age= 32;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public int getAge() {
		return age;
	}
	
}
public class FinalKeyword {
/*
 final; value cannot be changed 
 used  in variable ,class and method
 */
	
	final String name;
//	{
//		name="Batch11";
//	}
//	
	public FinalKeyword() {
		name="Batch10";
	}
	final static String school;
	
	static {
		school="Cyberek";
	}
	
	public static void main(String[] args) {
		final boolean result=false;
		
		//result =true; if final you cannot assign again
	}
	
	
}
