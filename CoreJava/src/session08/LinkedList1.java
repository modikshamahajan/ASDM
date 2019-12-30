package session08;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args)
	{
		LinkedList l= new LinkedList();
		l.add("Aditi");
		l.add(30);
		l.add(null);
		l.add("Modiksha");
	   
		System.out.println(l);
		l.set(0,"Software");
		
		System.out.println(l);
		l.set(0,"Venky");
		
		System.out.println(l);
		l.removeLast();
		
		System.out.println(l);
		l.addFirst("Mona");
		
		System.out.println(l);
		
		
	}
}
