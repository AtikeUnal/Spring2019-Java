package day51_inheritance04;

public class GoldGym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise ex = new Exercise();

		System.out.println(ex.perform(30));

		Running run = new Running();
		System.out.println(run.perform(40));

		Swimming swim = new Swimming();
		System.out.println(swim.perform(45));

		Yoga y1 = new Yoga();
		System.out.println(y1.perform(60));

		JuiJitsu jui = new JuiJitsu();

		System.out.println(jui.perform(60));

		Sprinting sp = new Sprinting();
		System.out.println(sp.perform(25));
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
		Snowboarding sn =new Snowboarding ();
		System.out.println(sn.perform(100));
	}

}
