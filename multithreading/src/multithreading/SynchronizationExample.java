package multithreading;

public class SynchronizationExample {

	public static void main(String[] args) {
			Display d = new Display();
			Guest g1 = new Guest(d, "sham");
			Guest g2 = new Guest(d, "ram");
			Guest g3 = new Guest(d, "ganesh");
			g1.start();
			
			g2.start();
			g3.start();
	}

}
class Display{
	public synchronized void wish(String name) {
		for(int i=1; i<5; i++) {
			System.out.print("happy birthday");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}
			System.out.println(name);
		}
	}
}
class Guest extends Thread{
	Display d;
	String name;
	
	public Guest(Display d, String name) {
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}