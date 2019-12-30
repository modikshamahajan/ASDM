package session09;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("name="+Thread.currentThread().getId());
		
	}
	public static void main(String args[])
	{
		MyThread1 m1=new MyThread1();
		Thread t1=new Thread(m1);
		t1.start();
	}
	
	

}
