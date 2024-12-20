package multithreading;

public class JoinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinDemo t1 = new JoinDemo();
		t1.start();
		//t1.join(8000);
		for(int i=0; i<20; i++) {
			System.out.println(i+"times in parent");
		}

	}

}
class JoinDemo extends Thread{
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(i+"times in child");
			
		}
	}
}