package Anonymous;

public class Anonymous_Myframe 
{
   public  static void main(String[] args)
   {
	   Anonymous_print p= new Anonymous_print()
	   {
		 public void get()
		 {
			 System.out.println("Anonymous inner Class");
		 }
		 
	   };
	   
	   p.get();
	   System.out.println(p.getClass());
	   
   }
}
