
public class _3b {

	public static void main(String[] args) {
		
		Circle c = new Circle(7.6f);
		c.getArea();
		c.getPerimeter();
		Square s = new Square(5f, 5f);
		s.getArea();
		s.getPerimeter();
	}

}
abstract class Shape{
	public abstract void getArea();
	public abstract void getPerimeter();
	
}
class Rectangle extends Shape{
	public Rectangle(float l, float b) {
		this.l=l;
		this.r=b;
		
	}
	float l;
	double r;
	@Override
	public void getArea() {
		System.out.println("area of rectangle is "+l*r);
		
	}

	@Override
	public void getPerimeter() {
		System.out.println("perimeter of rectangle: "+2*(l+r));
		
	}
	
}
class Circle extends Shape{
	public Circle(float r) {
		this.radius=r;
	}
	float radius;
	
	
	@Override
	public void getArea() {
		System.out.println("area of circle: "+(Math.PI)*radius*radius);
		
	}

	@Override
	public void getPerimeter() {
		System.out.println("primeter of circle: "+2*Math.PI*radius);
		
	}
	
}
class Square extends Rectangle{

	public Square(float l, float b) {
		super(l, b);
		this.l=l;
		this.b=b;
		
	}
	float l;
	float b;
	public void getArea() {
		System.out.println("area of square");
		System.out.println(l*b);
		
		System.out.println("perimeter of square");
		System.out.println(4*l);
	}
	
}