package multithreading;

public class RunnableInterface {

	public static void main(String[] args) {
		MyOwnThread t = new MyOwnThread();
		Thread thread = new Thread(t);
		thread.start();
		

	}

}
class MyOwnThread implements Runnable{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("child thread");
		}
	}
}