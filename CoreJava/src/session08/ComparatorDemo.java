package session08;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		
		System.out.println(t);
	}
}
