package day47_blocks;

public class Google extends SearchEngine {

	
   public int search(String item) {  //you can change the item this is the local variable
		
		System.out.println("Google searching for : "+item);
		
		int resultsCount= item.length();
		return resultsCount;
	
}

//can be protected ~ void cannot change ~ name(search ) has to be same it is case sensitive~cannot change the data type if we change it is OVERLOADING
   public void search(String item, String item2) {
	   System.out.println("Serarching for 2 times: "+item+","+item2);
	   		
	   		int resultsCount= item.length()+item2.length();
	   		
	   		System.out.println("Total count : "+resultsCount);
	   	}
	   	

//or public  no change  cannot change the name
  protected String     clickResult() {
		System.out.println("clicking result ");
		return "Search result page";
	}



}
