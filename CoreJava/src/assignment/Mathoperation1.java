package assignment;

import java.util.Scanner;

public class Mathoperation1 {

	static double r;
	public void multiply(int x,int y)
	{
		r=x*y;
	}
	public void multiply(float x,float y,float z)
	{
		r=x*y*z;
	}
	public void multiply()
	{
		int arr[]=new int[3];
		
		System.out.println("Enter array elements");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			arr[i]=s.nextInt();
		}
		double r=1;
		for(int i=0;i<3;i++)
		{
			r=r*arr[i];
		}
		
	}
	public void multiply(double x,int y)
	{
		r=x*y;
	}
	public void display()
	{
		System.out.println("Result= "+r);
	}
	public static void main(String[] args)
	{
		Mathoperation1 mo=new Mathoperation1();
		mo.multiply(5,6);
		mo.display();
		mo.multiply();
		mo.display();
		mo.multiply(5.2f,6.1f,1.2f);
		mo.display();
		mo.multiply(12.3d,5);
		mo.display();
		
}
}
