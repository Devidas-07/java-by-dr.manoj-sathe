
public class VarArgs {

	public static void main(String[] args) {
		A a = new A();
		a.add(3);
		B b = new B();
		b.add(3,45,6);

	}

}
class A{
	public void add(int x) {
		int result=0;
		result=result+x;
		System.out.println(result);
	}
	private void sub(int a, int b) {
		System.out.println(a-b);
	}
}
class B{
	public void add(int ...x) {
		int result=0;
		for(int num: x) {
			result=num+result;
		}
		System.out.println(result);

	}
	private void sub(int a, int b) {
		System.out.println(a-b);
	}
}
//add() is method overloading 
//because method structure is same and number of parameter are not same;
//var args can accept 0 or 1 or more values
//sub() method is not overloaded and not overrided because private properties can't access in subclass
//so these sub() 2 methods are totally different