package Bhk_Q40;

import java.util.Scanner;

public class MainBHK {
	

	public static void main(String[] args) 
	{
		
		TwoBHK t1= new TwoBHK(20,50,45000,25);
		TwoBHK t2= new TwoBHK(30,45,500000,48);
		TwoBHK t3= new TwoBHK(35,40,80000,85);
		TwoBHK t4= new TwoBHK();
		t1.display();
		t2.display();
		t3.display();
		t4.showcnt();
		
		
    }
}