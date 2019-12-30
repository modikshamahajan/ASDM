package session06;

public class Interface2_CalNumber 
{
   void fact(int n)
   {
	   int f = 1;
	   while(n!=1)
	   {
		   f=f*n;
		   n--;
	   }
	   System.out.println("Factorial of the number is : "+f);
   }
}
