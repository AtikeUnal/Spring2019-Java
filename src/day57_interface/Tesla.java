package day57_interface;

public class Tesla extends Vehicle implements Electric,Automonous {

	@Override
	public void charge() {
		System.out.println("Tesla is charging at charging station");
		
	}

	@Override
	public void selfDrive() {
		// TODO Auto-generated method stub
		System.out.println("Tesla is in aouto pilot mode.Driving autonomously");
	}
	

}
