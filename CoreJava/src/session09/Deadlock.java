package session09;

public class Deadlock 
{
   public static void main(String[] args) 
   {
	final String res1 = "hematite";
	final String res2 = "mindscript";
	
	Thread t1 = new Thread()
	{
		public void run()
		{
		synchronized(res1)
		{
			System.out.println("Thread1 : locked res1");
			
			try {
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				
			}
			synchronized(res2)
			{
				System.out.println("Thead1 : locked res2");
			}
		}
		}
	};
	
	Thread t2 = new Thread()
			{
		public void run()
		{
		synchronized(res2)
		{
			System.out.println("Thead1 : locked res2");
			
			try {
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				
			}
			synchronized(res1)
			{
				System.out.println("Thead1 : locked res1");
			}
		}
		}
	};
	
	t1.start();
	t2.start();
   }
}
