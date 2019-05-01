package day24_Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []cities= {"Washington DC.","Kyiev","Annandale","Moscow","Istanbul","Baku","Miami","Silver Spring","McLean"};

		
		
		for(String city:cities) {
			if(city.startsWith("M")) {
				System.out.println(city);
			}
		}
		String str="Wooden Spoon";
		char[] chars =str.toCharArray();
		for(char c:chars) {
			System.out.print(c+"_");
		}
	System.out.println();
	str="";
	for(int i=chars.length-1; i>=0; i--) {
		str+=chars[i];
		System.out.print(chars[i]);
	}
	System.out.println();
	for(char c :chars) {
		if(c=='o') {
		System.out.print("*");
		
	}else {
		System.out.print(c);
	}
	}
	
	
	}

}
