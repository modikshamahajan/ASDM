package session09;

public class Syn2 extends Thread{

	Table1 t;
	 Syn2(Table1 t)
	 {
		 this.t=t;
	 }
	 public void run()
	 {
		 t.printTable(100);
	 }
}
