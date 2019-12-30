package assignment;

public class CopyConstructor 
{

	int id;
	String name;
	double marks;
	
	public CopyConstructor(int id,String name,double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public CopyConstructor(CopyConstructor cc3)
	{
		this.id=cc3.id;
		this.name=cc3.name;
		this.marks=cc3.marks;
	}
	public void display()
	{
		System.out.println("Info is= ["+id+" "+name+" "+marks+"]");
	}
	public void display1(CopyConstructor cc1)
	{
		System.out.println("Info is= ["+cc1.id+" "+cc1.name+" "+cc1.marks+"]");
	}
	public static void main(String[] args) 
	{
		CopyConstructor cc=new CopyConstructor(1,"Modiksha",36);
		CopyConstructor cc1 = new CopyConstructor(cc);
		cc.display();
		cc1.display();
	}
}
