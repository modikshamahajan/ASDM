package session08;

import java.util.HashSet;

public class HashsetDemo 
{

	public static void main(String[] args)
	{
		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add("null");
		h.add("10");
		
		System.out.println(h.add("12"));
		System.out.println(h);
	}
}
