package com.pack1;

public class Main {

	public static void main(String[] args) {
		First f = new First();
		f.m1();
		
		Second s = new Second();
		s.m1();
		
		First s1 = new Second();
		s1.m1();
	}

}
class First{
	public static void m1() {
		System.out.println("First");
	}
}
class Second extends First{
	public static void m1() {
		System.out.println("Second");
	}
}
