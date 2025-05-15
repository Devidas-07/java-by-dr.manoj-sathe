package multithreading;

public class CheckStringBuilder {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("MCA in");
		
		Student kartik = new Student(sb," mibs ");
		
		Student ganesh = new Student(sb," imcd ");
		kartik.start();
		ganesh.start();
//		System.out.println("in main thread: ");
//		System.out.println("sb is: "+sb);
		
		

	}

}
class Student extends Thread{
	StringBuffer sb;
	String app;
	public Student(StringBuffer sb, String app) {
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

