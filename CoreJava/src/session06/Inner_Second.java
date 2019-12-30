package session06;

public class Inner_Second 
{
   private int no =10;
   
   private class Inner
   {
	   public void get()
	   {
		   System.out.println("no= "+no);
	   }
   }
   public void get()
   {
	   Inner i = new Inner();
	   i.get();
   }
   public static void main(String[] args)
   {
	   Inner_Second si = new Inner_Second();
	   si.get();
   }
}
