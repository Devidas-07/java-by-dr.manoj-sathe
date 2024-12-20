package multithreading;

public class SleepMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomThread2 t1 = new CustomThread2();
		t1.start();
		for(int i=0; i<50; i++) {
			System.out.println("in parent thread");
			
		}
		
	}
	

}
class CustomThread2 extends Thread{
	
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println("in child thread");
			try {
				Thread.sleep(4000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		}
		
	}
}