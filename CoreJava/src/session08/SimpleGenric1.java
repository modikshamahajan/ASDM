package session08;

public class SimpleGenric1<V extends Number>
{
	   V v;
	   public SimpleGenric1(V v)
	   {
		 this.v = v;  
	   }
	   public V getv()
	   {
		   return v;
	   }
	   
	   public static void main(String[] args)
	   {
		   SimpleGenric1<Integer>a= new SimpleGenric1<Integer>(10);
		   System.out.println(a.getv());
		   
		   //SimpleGenric1<String> s= new SimpleGenric1<String>("abc");
		   //System.out.println(s.getv());
	   }
}
