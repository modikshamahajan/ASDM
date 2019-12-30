package session08;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args)
	{
		ArrayList l= new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("M");
		l.add("O");
	
	   // l.add(new Integer(10));//ClassCastException
	   // l.add(null);//NullPointerException
	    
	    System.out.println("Before Sorting: "+l);
	    Collections.sort(l);
	    
	    System.out.println("After Sorting: "+l);
	    
	}
	
	
}
