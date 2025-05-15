package multithreading;

public class SleepAndInterrupt {

	public static void main(String[] args) throws InterruptedException{
		Lazy l = new Lazy();
		l.start();
		l.interrupt();
		l.join();
		System.out.println("main thread");

	}

}
class Lazy extends Thread{
	public void run() {
		for(int i=1; i<100000; i++) {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println("error");
			}
			System.out.println("i ="+i);
			
		}
	}
}
