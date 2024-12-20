package multithreading;

class MyThread5 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Sachin Batting Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}

class ThreadJoinDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread5 t = new MyThread5();
		t.start();
		
		t.join(6000);  //join() method will be called by main thread. It will execute after complete child execution
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Kohli Batting Thread");
		}
	}
}