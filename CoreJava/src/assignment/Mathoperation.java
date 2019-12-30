package assignment;

import java.util.Scanner;

public class Mathoperation {

	public double a,b,r;
	public void initData()
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter values of a and b");
		a=s.nextDouble();
		b=s.nextDouble();
	}
	public void add()
	{
		r=a+b;
	}
	public void mul()
	{
		r=a*b;
	}
	public void pow()
	{
		r=Math.pow(a, b);
	}
	public void display()
	{
		System.out.println("result is"+r);
	}
	public static void main(String[] args)
	{
		Mathoperation mo=new Mathoperation();
		mo.initData();
		mo.add();
		mo.display();
		mo.mul();
		mo.display();
		mo.pow();
		mo.display();
	}
}
