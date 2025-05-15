package multithreading;

public class StringBufferAndMultithreading {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("MCA in");
		
		Person kartik = new Person(sb," mibs ");
		
		Person ganesh = new Person(sb," imcd ");
		kartik.start();
		ganesh.start();
//		System.out.println("in main thread: ");
//		System.out.println("sb is: "+sb);
		
		

	}

}
class Person extends Thread{
	StringBuffer sb;
	String app;
	public Person(StringBuffer sb, String app) {
		this.sb=sb;
		this.app = app;
	}
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("I'm going to append the StringBuffer after 1 sec");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("interrupted");
			}
			sb.append(app);
			System.out.println(sb);
		}
	}
}

