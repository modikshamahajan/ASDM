package session09;

public class Syn3 extends Thread {

	Table1 t;
	 Syn3(Table1 t)
	 {
		 this.t=t;
	 }
	 public void run()
	 {
		 t.printTable(7);
	 }
}
