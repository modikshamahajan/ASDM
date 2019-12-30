package session09;

public class Syn4 extends Thread{

	Table1 t;
	 Syn4(Table1 t)
	 {
		 this.t=t;
	 }
	 public void run()
	 {
		 t.printTable(6);
	 }
}
