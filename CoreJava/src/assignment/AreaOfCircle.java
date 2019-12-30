package assignment;

import java.util.Scanner;

public class AreaOfCircle {
	int r;
	double a;
	public void initRadius()
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius");
		r=s.nextInt();
	}
	public void areaC()
	{
		a=3.14*r*r;
	}
	public void display()
	{
		System.out.println("area is" +a);
	}
	public static void main(String[] args)
	{
		AreaOfCircle a=new AreaOfCircle();
		a.initRadius();
		a.areaC();
		a.display();
	}
}
