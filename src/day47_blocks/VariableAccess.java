package day47_blocks;

public class VariableAccess {

	
	//instance variable
	int myInstanceVar=40;
	
	//static variable
	static int myStaticVariable=55;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(myInstanceVar);     it doesnt work becs maon method is static 
System.out.println(myStaticVariable);


//create object of VariableAccess and print  value

VariableAccess myVar =new VariableAccess() ;
System.out.println(myVar.myInstanceVar);
System.out.println(myVar.myStaticVariable);
	
//acess static variable using classname

System.out.println(VariableAccess.myStaticVariable);




	}

}
