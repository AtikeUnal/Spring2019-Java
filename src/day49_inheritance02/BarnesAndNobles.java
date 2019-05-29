package day49_inheritance02;

public class BarnesAndNobles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EBook ebook =new EBook();
		
		
		ebook.setTitle("Intro to JAVA");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech");
		
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		
		ebook.readEBook(600);
	
		
		AudioBook abook=new AudioBook() ;
		abook.setAuthor("Jeanne");
		abook.setTitle("OCA Prep");
		abook.setNarrator("MarofJoon");
			
		abook.listen();
		
		PaperBack pbook =new PaperBack();
		
		pbook.setAuthor("Malcom Gladwell");
		pbook.setTitle("Outlier");
		pbook.setType("Bio");
		pbook.setPrice(20);
		pbook.setPages(304);
			
		System.out.println(pbook.toString());
		
		
	}

}
