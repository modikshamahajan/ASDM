package session05;

import java.util.Scanner;

public class ElectronicItem extends Item{
	
	String name;
	int qty;
	float rate;
	float dis;
	final float disper=0.05f;
	float amt;

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name= ");
		name = s.next();
		
		System.out.println("Enter Rate= ");
		rate = s.nextFloat();
		
		System.out.println("Enter Quantity= ");
		qty = s.nextInt();
	}

	@Override
	public void calAmount() {
		// TODO Auto-generated method stub
		amt = rate*qty;
		System.out.println("Amount= "+amt);
	}

	@Override
	public void calDiscount() {
		// TODO Auto-generated method stub
		dis = amt * disper;
		amt = amt-dis;
		
		System.out.println("Discount= "+dis);
		System.out.println("Amount to be paid= "+amt);
	}
    
}
