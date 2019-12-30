package Faculty;

import java.util.Scanner;

public class PartTimeFaculty extends Faculty{
	double hours;
	double rate;
	public PartTimeFaculty()
	{}

	public PartTimeFaculty(int id, double salary,double hours,double  rate)
	{
		super(id,salary);
		this.hours=hours;
		this.rate=rate;
	}
	public void accept()
	{
		super.accept();
	   	Scanner n= new Scanner(System.in);
	   	int hours = n.nextInt();
	   	int rate = n.nextInt();
	}

	public void display()
	{
		super.display();
		System.out.println("hours:- "+hours);
		System.out.println("rate:- "+rate);
	}
	
	public void calsal1()
	{
		double salary= hours*rate;
		System.out.println("Salary of PTF:- "+salary);
		
	}
}
