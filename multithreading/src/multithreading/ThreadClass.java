package multithreading;

public class ThreadClass {

	public static void main(String[] args) {
		System.out.println("current thread: "+Thread.currentThread().getName());
		System.out.println("main started");
		MyThread t= new MyThread();
		t.setName("childThread");
		t.setPriority(7);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getStackTrace());
		System.out.println(t.getThreadGroup());
		t.start();
		//t.run();//but this is not multithreading
		for(int i=0; i<10; i++) {
			System.out.println("in parent class");
		}
		System.out.println("main ended");
		

	}

}
class MyThread extends Thread{
	//we can override start method 
	//but at this case it is not multithreading
	/*
	 * public void start(){
	 * 
	 * }
	 */
	
	@Override
	public void run() {
		for(int i=0; i<11; i++) {
			System.out.println(i/0);
			System.out.println("in child class");
		}
	}
	//we can overload run method
}
