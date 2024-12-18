import java.util.Scanner;

public class _6_ThreadQuestion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string. I'll tell you vowels");
		String s1 = s.nextLine();
		MyThread t1 = new MyThread(s1);
		t1.start();
	}

}
class MyThread extends Thread{
	public MyThread(String s) {
		this.s= s;
	}
	String s;
	public void run() {
		for(int i=0; i<=s.length()-1; i++) {
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				System.out.println("vowels in "+s+" is "+s.charAt(i));
			}
		}
	}
}