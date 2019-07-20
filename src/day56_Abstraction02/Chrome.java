package day56_Abstraction02;

public class Chrome extends Browser{
	
	
	
	public Chrome(String name ,int id) {
		super(name,id);
	}
	@Override
	public  void navigate(String url) {
		System.out.println("Chrome-navigating to "+url);
	}
	
	@Override
	public  void displayWebPage() {
		System.out.println("Chrome -displaying webpage");
	}
	
	@Override
	public boolean launch() {
		
		System.out.println("Chrome is launching");
		System.out.println("1-2-3");
		return true;
	}
	
	
	@Override
	public void close() {
		super.close();
		System.out.println("Exitting Chrome.");
	}
}
