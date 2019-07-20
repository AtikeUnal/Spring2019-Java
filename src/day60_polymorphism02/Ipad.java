package day60_polymorphism02;

public class Ipad extends AppleDevice{

	public double maxScreenSize = 12.9;

	@Override
	public void use() {
		System.out.println("IPad | Music | Read Book | Cartoon");
	}

	public void draw() {
		System.out.println("Drawing shapes using IPad");
	}

}