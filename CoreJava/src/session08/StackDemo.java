package session08;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args0)
	{
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search("A"));
		System.out.println(s.search("2"));
		System.out.println(s.empty());
	}
}
