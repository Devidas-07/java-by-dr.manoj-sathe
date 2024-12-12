package multithreading;

public class ThreadMethods {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		CustomThread c = new CustomThread();
		System.out.println(c.getName());
		Thread.currentThread().setName("dr. sathe sir");
		System.out.println(10/0);
	}

}
class CustomThread extends Thread{
	public void run() {
		System.out.println("in custom thread");
	}
}