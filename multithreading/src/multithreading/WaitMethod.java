package multithreading;

public class WaitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Calculation t1 = new Calculation();
		t1.start();
		synchronized (t1) {
			t1.wait();
			
			System.out.println("total is:" +t1.total);
		}

	}

}

class Calculation extends Thread{
	int total=0;
	public void run() {
		synchronized (this) {
			for(int i=1; i<=100; i++) {
				total = total+i;
				System.out.println(total);
			}
			this.notify();
		}
		
	}
}
