package multithreading;



public class SleepB {

	public static void main(String[] args) throws InterruptedException{
		NewThread t1 = new NewThread();
		t1.start();
		Thread.sleep(4000);
		System.out.println("total is: "+t1.total);

	}

}
class NewThread extends Thread{
	int total =0;
	public void run() {
		for(int i=1; i<=100; i++) {
			total = total +i;
		}
	}
}