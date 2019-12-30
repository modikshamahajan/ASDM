package session09;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args)
	{
	HashMap<Integer, String> hm= new HashMap<>();
	hm.put(111,"Aditi");
	hm.put(222,"Modiksha");
	hm.put(333,"Priyanka");
	
	for(Map.Entry m:hm.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	}
}
