package session08;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {
       public static void main(String[] args)
       {
    	   ArrayList<Integer> a = new ArrayList<Integer>();
    	   a.add(10);
    	   a.add(56);
    	   a.add(78);
    	   a.add(78);
    	   
    	   System.out.println(a);
    	   
    	   Iterator<Integer>i = a.iterator();
    	   while(i.hasNext())
    	   {
    		   System.out.println(i.next());
    	   }
    	   
    	   for(Integer b:a)
    	   {
    		   System.out.println(b);
    	   }
       }
}
