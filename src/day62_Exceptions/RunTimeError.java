package day62_Exceptions;

public class RunTimeError {
static int i=0;
public static void main(String[] args) {
	go();
	
}
public static void go() {
	System.out.println(i+" going");
	i++;
	go();
}
}
