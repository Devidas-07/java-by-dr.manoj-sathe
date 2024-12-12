package multithreading;

public class ThreadPriority {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		System.out.println(t1.getPriority());
		Thread2 t2 = new Thread2();
		System.out.println(t2.getPriority());
		Thread3 t3 = new Thread3();
		t3.setPriority(7);
		System.out.println(t3.getPriority());
		
		System.out.println(Thread.MAX_PRIORITY);
	}

}
class Thread1 extends Thread{
	public void run() {
		System.out.println("in thread 1");
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		System.out.println("in thread 2");
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
}
class Thread3 extends Thread{
	public void run() {
		System.out.println("in thread 3");
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
}