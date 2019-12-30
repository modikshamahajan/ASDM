package session05;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Electronic\n2. Grocery\n3. Exit");
			System.out.println("Enter your choice= ");
			
			int ch = s.nextInt();
			
			switch(ch)
			{
			
			case 1:
				ElectronicItem e= new ElectronicItem();
				e.getData();
				e.calAmount();
				e.calDiscount();
				break;
				
			case 2:
				GroceryItem g= new GroceryItem();
				g.getData();
				g.calAmount();
				g.calDiscount();
				break;
				
			case 3:
				System.exit(0);
				
			default :
				System.out.println("OOPs you are going Worng");
			}
		}
		
	}
}
