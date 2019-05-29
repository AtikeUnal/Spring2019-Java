package day52_inheritance05;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE;
	public final int MODEL_X_PASSANGERS;
	public final int MODEL_MAX_SPEED=200;
	public final String JAN="January";
	
	public static final String COMPANY_NAME= "CyberTek";
	public static final String ADMIN_USERNAME;
	
	static {
		ADMIN_USERNAME="admin";
	}
	public FinalVariables() {
		
		
		ROADSTER_MAX_RANGE=610;
	}
	
	
	{
		MODEL_X_PASSANGERS=7;
	}

	public static void main(String[] args) {
	
		
		
		
		 final int MAX_PASSANGERS_COUNT;
		
		MAX_PASSANGERS_COUNT=5;
	final	double PI=3.14;
	
	System.out.println(MAX_PASSANGERS_COUNT);
	
	
	System.out.println(PI);
	
	final int SSN= 222222;
	
	
	FinalVariables finalvar =new FinalVariables();
	
		System.out.println("Max Range for roadster "+finalvar.ROADSTER_MAX_RANGE);
		System.out.println("Model X passangers : "+finalvar.MODEL_MAX_SPEED);
		System.out.println("Model X passangers :"+finalvar+MAX_PASSANGERS_COUNT);
		
		
		
		System.out.println(Integer.MAX_VALUE);
		
		
		System.out.println("Company name: "+COMPANY_NAME);
		System.out.println(FinalVariables.COMPANY_NAME);
		
		
		
		
	}
	
	
}
