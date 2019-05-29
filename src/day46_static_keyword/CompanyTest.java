package day46_static_keyword;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(Company.cname);
		System.out.println(Company.cname.toUpperCase());	
		
		Company c =new Company();
		System.out.println(c.cname);
		c.companyInfo();
		Company.companyInfo();
	}

}
