package session09;

public class MythreadPriority extends Thread {
	
	public void run()
	{
		System.out.println("Thread name-"+Thread.currentThread().getPriority());
		
		try { Thread.currentThread().sleep(2000);
		
		}
		catch(InterruptedException e) {}
	}
	
	
	public static void main(String args[])
	{
		MythreadPriority t1=new MythreadPriority();
		MythreadPriority t2=new MythreadPriority();
		MythreadPriority t3=new MythreadPriority();
		
		t2.setPriority(MAX_PRIORITY);
		t1.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
	
	

}
