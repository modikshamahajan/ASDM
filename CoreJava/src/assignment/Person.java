package assignment;

public class Person {

	String name;
	int age;
	public Person()
	{
		name="Modiksha";
		age=21;
				
	}
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
				
	}
	public void display()
	{
		System.out.println("Person Details= "+name+" "+age);
	}
	public static void main(String[] args) {
		Person p=new Person();
		p.display();
		Person p1=new Person("Aditi",22);
		p1.display();
	}
}
