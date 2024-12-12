package multithreading;

public class RunnableInterface {

	public static void main(String[] args) {
		MyOwnThread t = new MyOwnThread();
		

	}

}
class MyOwnThread implements Runnable{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("child thread");
		}
	}
}