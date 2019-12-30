package Faculty;

import java.util.Scanner;

public class FullTimeFaculty extends Faculty{
int basic;
int allowance;

public FullTimeFaculty()
{}

public FullTimeFaculty(int id, double salary,int basic,int allowance)
{
	super(id,salary);
	this.basic=basic;
	this.allowance=allowance;
}

public void accept()
{
	super.accept();
   	Scanner n= new Scanner(System.in);
   	int basic = n.nextInt();
   	int allowance = n.nextInt();
}

public void display()
{
	super.display();
	System.out.println("Basic:- "+basic);
	System.out.println("Allowance:- "+allowance);
}

public void calsal()
{
	int salary= basic + allowance;
	System.out.println("Salary of FTF:- "+salary);
}

}

