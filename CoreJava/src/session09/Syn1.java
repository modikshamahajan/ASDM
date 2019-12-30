package session09;

public class Syn1 extends Thread{
	 Table1 t;
	 Syn1(Table1 t)
	 {
		 this.t=t;
	 }
	 public void run()
	 {
		 t.printTable(5);
	 }

	
}
