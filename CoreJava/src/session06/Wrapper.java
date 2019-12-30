package session06;

public class Wrapper 
{
   public static void main(String[] args)
   {
	   int x=30;
	   Integer i = new Integer(x);//Primitive to Wrapper
	   
	   int y = i.intValue();//Wrapper to primitive
	   
	   String s = "30";
	   int a = Integer.parseInt(s);//String to primitive
	   
	   String s1 = "30";
	   Integer b = Integer.valueOf(s1);//string to wrapper
	   
	   int no= 10;
	   Integer q= no;
	   no=q;
	   
   }
}
