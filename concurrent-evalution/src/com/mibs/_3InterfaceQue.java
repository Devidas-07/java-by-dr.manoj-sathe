package com.mibs;

public class _3InterfaceQue {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();

	}

}
class Dog implements Animal{
	public void bark() {
		System.out.println("dog is barking");
	}
}