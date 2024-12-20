package multithreading;

public class WaitExample {

	public static void main(String[] args) throws InterruptedException {
		Friend1 t1 = new Friend1();
		t1.start();
		synchronized (t1) {
			t1.wait();
		}
		Friend2 t2 = new Friend2();
		t2.start();
		

	}

}

class Friend1 extends Thread{
	
	public void run() {
		synchronized(this) {
				for(int i=1; i<=5; i++) {
					System.out.println("friend 1 is doing work");
				}
				System.out.println("friend 1 goes home");
				this.notify();
		}
	}
}
class Friend2 extends Thread{
	public void run() {
		for(int i=1; i<=30; i++) {
			System.out.println("friend 2 is taking time");
		}
		System.out.println("friend 2 goes home");
	}
}
