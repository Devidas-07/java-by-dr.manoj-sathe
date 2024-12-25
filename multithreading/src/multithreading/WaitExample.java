package multithreading;

public class WaitExample {

	public static void main(String[] args) throws InterruptedException {
		

	
		Friend1 t1 = new Friend1();
		t1.start();
		
		
		System.out.println("main thread got notification");
		

	}

}

class Friend1 extends Thread{
	
	public void run() {
		System.out.println("t1 is got notification");
				for(int i=1; i<=30; i++) {
					System.out.println("friend 1 is doing work");
				}
				Friend2 t2 = new Friend2();
				t2.start();
				System.out.println("friend 1 goes home");
				
		
	}
}
class Friend2 extends Thread{
	public void run() {
		synchronized (this) {
			
		
		for(int i=1; i<=10; i++) {
			System.out.println("friend 2 is taking time");
		}
		System.out.println("friend 2 goes home");
		this.notify();
	}
	}
}
