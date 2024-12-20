package multithreading;

public class ThreadMethods {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("in main class " + Thread.currentThread().getName());
		CustomThread c = new CustomThread();
//		System.out.println(c.getName());
		c.start();

		System.out.println("by obj of c " + c.getName());
		Thread.currentThread().setName("dr. sathe sir");
		System.out.println(Thread.currentThread().getName() + " in main class");

//		System.out.println(10/0);
	}

}

class CustomThread extends Thread {
	public void run() {
		Thread.currentThread().setName("pushpa2");
		
		for (int i = 0; i < 5; i++) {
			try {
			}
			catch(Exception e) {
				e.getMessage();
			}
			System.out.println("in custom thread " + Thread.currentThread().getName());
		}
	}
}