package com.mibs;

public class _2ExtendKeyword {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.len=10;
		r.b=5;
		r.getArea();

	}

}
class Shape{
	public void getArea() {
		
	}
}
class Rectangle extends Shape{
	float len;
	float b;
	@Override
	public void getArea() {
		double area= 0.0d;
		area=len*b;
		System.out.println("area is:  "+area);
	}
}
