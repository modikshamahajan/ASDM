package session09;

public class ThreadGroupDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
		ThreadGroupDemo tg1 = new ThreadGroupDemo();
		ThreadGroup tg = new ThreadGroup("Group A");
		
		Thread t1= new Thread(tg, tg1,"one");
		t1.start();
		
		Thread t2= new Thread(tg, tg1,"two");
		t2.start();
		
		System.out.println("List");
		tg.list();
	}
}
