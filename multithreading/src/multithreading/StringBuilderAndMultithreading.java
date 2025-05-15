package multithreading;

public class StringBuilderAndMultithreading {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java by dr. manoj sathe sir");
		Ramesh ramesh = new Ramesh(sb);
		ramesh.start();
		Ganesh ganesh = new Ganesh(sb);
		ganesh.start();
		System.out.println(sb);
		sb.append("in IMCD");

	}

}
class Ramesh extends Thread{
	StringBuilder sb;
	public Ramesh(StringBuilder sb) {
		this.sb=sb;
	}
	public void run() {
		System.out.println(sb);
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			
		}
		sb.append("in mibs");
	}
}
class Ganesh extends Thread{
	StringBuilder sb;
	public Ganesh(StringBuilder sb) {
		this.sb=sb;
	}
	public void run() {
		System.out.println(sb);
	}
}