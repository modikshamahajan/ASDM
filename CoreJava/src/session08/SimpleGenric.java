package session08;

public class SimpleGenric<V>
{
   V v;
   public SimpleGenric(V v)
   {
	 this.v = v;  
   }
   public V getv()
   {
	   return v;
   }
   
   public static void main(String[] args)
   {
	   SimpleGenric<Integer>a= new SimpleGenric<Integer>(10);
	   System.out.println(a.getv());
	   
	   SimpleGenric<String>s= new SimpleGenric<String>("abc");
	   System.out.println(s.getv());
   }
  
	
}
