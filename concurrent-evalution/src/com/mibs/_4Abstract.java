package com.mibs;

public class _4Abstract {

	public static void main(String[] args) {
		
		Animal1 t = new Lion();
		t.sound();
	}

}
abstract class Animal1{
	public abstract void sound();
}
class Tiger extends Animal1{
	@Override
	public void sound() {
		System.out.println("tiger's sound");
	}
}
class Lion extends Animal1{
	@Override
	public void sound() {
		System.out.println("Lion's sound");
	}
}