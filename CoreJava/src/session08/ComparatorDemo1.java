package session08;

import java.util.TreeSet;

public class ComparatorDemo1 {
                
	 public static void main(String args[])
	 {
		 TreeSet t=new TreeSet(new MyComparator1());
       
		 t.add("Snehal");	 
		 t.add("Priyanka");	 
		 t.add("Modiksha");	 
		 t.add("Aditi");	 
		 t.add("Ashwini");	 
		 t.add("Shweta");	 
		 System.out.println(t);
				 
	 }
}
