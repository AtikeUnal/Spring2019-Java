package day31_method03;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		googleSearchResults("About 124,000,000 results (0.93 seconds) ");
		
		
	}

	
	public static void googleSearchResults(String google) {
		
		
		String googleSearchResults="About 124,000,000 results (0.93 seconds) ";
	
		googleSearchResults=	googleSearchResults.replace(",", "");
		googleSearchResults=googleSearchResults.replace("(","");
		String resultcount[]=googleSearchResults.split(" ");
		
		
		
		
		System.out.println(resultcount[1]+" "+resultcount[3]);
		
		
	}
	
	
	
	
}
