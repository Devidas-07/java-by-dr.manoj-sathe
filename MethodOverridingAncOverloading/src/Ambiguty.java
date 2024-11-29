
public class Ambiguty {

	public static void main(String[] args) {
	
			Test t = new Test();
			t.m1(10);
		

	}

}
class Test{
	public void m1(int i) {
		
	}
	//public int m1(int i) {
		//return i;
	//}
}
//it will create ambiguti when method signature is same