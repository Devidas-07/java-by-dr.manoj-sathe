
public class RulesForOverriding {

	public static void main(String[] args) {
		Human h = new Human();
		h.noOfFoot();
	}

}
class Animal{
	public void noOfFoot() {
		System.out.println("4");
	}
}
class Human extends Animal{
	public void noOfFoot() {
		System.out.println("2");
	}
}
