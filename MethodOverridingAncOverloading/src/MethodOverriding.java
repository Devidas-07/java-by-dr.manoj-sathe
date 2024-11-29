
public class MethodOverriding {

	public static void main(String[] args) {
		Son s = new Son();
		s.marry();

	}

}
class Parent{
	public void property() {
		System.out.println("land, gold, house");
	}
	public void marry() {
		System.out.println("mary to xyz");
	}
	public final void genetics() {
		System.out.println("height, voice");
	}
}
class Son extends Parent{
	public void marry() {
		System.out.println("mary to abc");
	}
	
}
//we cannot override final method