package session06;

public class Inner_third 
{
   private int no=11;
   public void get()
   {
	   class Inner
	   {
		   private int n=10;
		   public void get()
		   {
			   System.out.println("n= "+n);
			   System.out.println("no= "+n);
		   }
	   }
	   Inner i = new Inner();
	   i.get();
   }
   
   public static void main(String[] args)
   {
	   Inner_third i= new Inner_third();
	   i.get();
   }
}
