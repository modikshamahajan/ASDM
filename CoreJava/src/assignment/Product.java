package assignment;

import java.util.Scanner;

public class Product {
	static int pid;
	static double price;
	static int quantity;
	static double spent_amt;
	static double total_amt;
	
	public Product(int pid,double price,int quantity)
	{
		Product.pid=pid;
		Product.price=price;
		Product.quantity=quantity;
	}
	public static void highestPrice(Product p1[])
	{
		int temp;
		double price = 0;
		int pid = 0;
		temp=(int) Product.price;
		for(int i=1;i<p1.length;i++)
		{
			double result = Product.price >temp?Product.price:temp;
			{
				price= result;
				pid= Product.pid;
				temp=(int) Product.price;
			}
		
		}
		System.out.println("highest price"+price+"pid"+pid);
	}
	public void total()
	{
		
		spent_amt=price*quantity;
	}
	public static void totalSpent()
	{
		System.out.println("price for product="+spent_amt);
	}
	public void amt()
	{
		total_amt+=spent_amt;
	}
	public static void totalAmt()
	{
		System.out.println("Total price="+total_amt);
	}
	public String toString()
	{
		return "product info("+pid+" "+price+" "+quantity+")";
	}
	public static void main(String[] args)
	
	{
		
		Product p1[]=new Product[2];
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		for(int i=0;i<p1.length;i++)
		{
			System.out.println("Enter pid");
			pid=s.nextInt();
			System.out.println("Enter price");
			price=s.nextDouble();
			System.out.println("Enter quantity");
			quantity=s.nextInt();
			
			Product p=new Product(pid,price,quantity);
			p1[i]=p;
			System.out.println(p1[i]);
			p.total();
			p.amt();
			
		}
//		for(int i=0;i<p1.length;i++)
//		{
//			System.out.println(p1[i]);
//		}
		Product.highestPrice(p1);
		Product.totalSpent();
		Product.totalAmt();
		
		
}
}
