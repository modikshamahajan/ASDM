package StudentQ42;

public class Student
{
	
	int rollno;
	float percentage;
	static int cnt;
	public Student()
	{
		rollno=28;
		percentage=90;
	}
	public Student(int rollno,float percentage)
	{
		this.rollno=rollno;
		this.percentage=percentage;
		
	}
	
	public void show()
	{
		System.out.println("Roll no: "+rollno+"   Percentage: "+percentage);
	}

}
