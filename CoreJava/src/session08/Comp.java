package session08;

import java.util.TreeSet;

public class Comp {
	
	public static void main(String [] args)
	{
		Employee e1=new Employee("Snehal",100);
		Employee e2=new Employee("Priyanka",200);
		Employee e3=new Employee("Modiksha",50);
		Employee e4=new Employee("Aditi",150);
		Employee e5=new Employee("Ashwini",180);
		Employee e6=new Employee("Shweta",170);
//		TreeSet t1=new TreeSet();
//		t1.add(e1);
//		t1.add(e2);
//		t1.add(e3);
//		t1.add(e4);
//		t1.add(e5);
//		t1.add(e6);
//	System.out.println(t1);
	TreeSet t2=new TreeSet(new MyComparator3());
	t2.add(e1);
	t2.add(e2);
	t2.add(e3);
	t2.add(e4);
	t2.add(e5);
	t2.add(e6);
	System.out.println(t2);	
		
	}

}
