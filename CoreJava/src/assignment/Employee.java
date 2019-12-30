package assignment;

public class Employee {
	public static int cnt;
	public static int empNo=0;
	public static double sal;
	public static double totalsal=0;
	
	public Employee(double sal)
	{
		Employee.empNo++;
		Employee.sal=sal;
		cnt++;
	}
	public static void getCnt()
	{
		System.out.println("Count is-"+cnt);
	}
	static {
		cnt=0;
	}
	public void sal()
	{
		totalsal=totalsal+sal;
	}
	public static void totalSal()
	{
		System.out.println("salary is--"+totalsal);
	}
	public void display() {
		System.out.println("Employee info [" +empNo
				+","+sal+"]");
	}
	public static void main(String[] args)
	{
		Employee e1[]=new Employee[3];
		e1[0]=new Employee(10000);
		e1[0].display();
		e1[0].sal();
		e1[1]=new Employee(20000);
		e1[1].display();
		e1[1].sal();
		e1[2]=new Employee(10000);
		e1[2].display();
		e1[2].sal();
		Employee.totalSal();
		Employee.getCnt();
		
	}
}
