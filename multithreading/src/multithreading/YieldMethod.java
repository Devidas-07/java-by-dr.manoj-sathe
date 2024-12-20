package multithreading;

public class YieldMethod {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
		for(int i=0; i<10; i++) {
			Thread.yield();//causes stop execution of current thread and give chance to another method
			System.out.println("Dhoni batting");
		}
		

	}

}
class MyThread1 extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Sachin Batting");
		}
	}
	
}