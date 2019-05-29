package day47_blocks;

public class AppsFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IphoneApp iphone =new IphoneApp();
		
		IphoneApp iphone2 =new IphoneApp("Uber");
		
		
		AndroidApp andrApp =new AndroidApp();
		AndroidApp andrApp2 =new AndroidApp("Lyft");
		
		
		System.out.println(iphone.getName());
		System.out.println(iphone2.getName());
		
		System.out.println(andrApp.getName());
		System.out.println(andrApp2.getName());
		
		
		App.count=33;
		System.out.println(IphoneApp.count);
		
		AndroidApp.count=100;
		
		System.out.println(IphoneApp.count);
		System.out.println(App.count);
		System.out.println(AndroidApp.count);
		
		
		
		App.build("Swift");
		
		IphoneApp.build("Objective C");
		AndroidApp.build("Java");
		andrApp2.build("JS");
		
		
		
	}

}
