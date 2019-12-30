package session09;

public class ThreadJoin extends Thread {

	public void run()
	{
		for(int i=1; i<5; i++)
		{
			System.out.println(i);
		
		try
		{
			Thread.currentThread().sleep(2000);
		}
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
		}
	}
	public static void main(String[] args)
	{
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();
		
		t1.start();
		
		try 
		{
			t1.join();
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		//t1.yield();
		t2.start();
		t3.start();
		
	}
}
