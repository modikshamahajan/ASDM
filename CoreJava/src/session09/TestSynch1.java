package session09;

public class TestSynch1 {

	public static void main(String arghs[])
	{
	  Table1 obj = new Table1();
	  Table1 ob = new Table1();
	  Syn1 t1 = new Syn1(obj);
	  Syn2 t2 = new Syn2(obj);
	  Syn3 t3 = new Syn3(ob);
	  Syn4 t4 = new Syn4(ob);
	  
	  t1.start();
	  t2.start();
	  t3.start();
	  t4.start();
	}
}
