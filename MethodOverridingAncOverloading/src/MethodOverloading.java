
public class MethodOverloading {

	public static void main(String[] args) {
		Test1 t = new Test1();
		/*
		t.m1();
		t.m1(25);
		t.m1(78.8);
		t.m1('a');
		*/
		//when method signature is not matching then character is promoted to int
		//so output will be integer argument method
		
		Test2 t2 = new Test2();
		/*
		t2.m1("MIBS");
		t2.m1(new StringBuffer("Java"));
		*/
		//t2.m1(null); compile time error because of ambigity
		
		Test3 t3 = new Test3();
	
		t3.m1(10,34);
		t3.m1();
		//var args can accept 0 or more values so here also no issue
		t3.m1(10); 
		//here ambiguty dosen't come

	}

}
class Test1{
	public void m1() {
		System.out.println("no arguments method");
		
	}
	public void m1(int i) {
		System.out.println("integer argument method");
	}
	public void m1(double d) {
		System.out.println("double arguments method");
	}
}
class Test2{
	public void m1(String s) {
		System.out.println("in string ");
	}
	public void m1(StringBuffer s) {
		System.out.println("in stringbuffer");
	}
	public void m1(String [] args) {
		
	}
}
class Test3{
	public void m1(int i) {
		System.out.println("in one argument");
	}
	public void m1(int ...i) {
		System.out.println("in var args");
	}
	public void m1(String [] args) {
		
	}
}
