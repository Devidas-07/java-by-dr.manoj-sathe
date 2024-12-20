package multithreading;

public class StringBufferAndMultithreading {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("MCA in");
		
		Person kartik = new Person(sb);
		kartik.start();
		kartik.sb.append(" in imcd");
		Person ganesh = new Person(sb);
		ganesh.start();
		ganesh.sb.append(" in mibs");
		

	}

}
class Person extends Thread{
	StringBuffer sb;
	public Person(StringBuffer sb) {
		this.sb=sb;
	}
	public void run() {
		
		System.out.println(sb);
	}
}

