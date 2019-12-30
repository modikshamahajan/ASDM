package Tile_Q38;

import java.util.Scanner;

public class Tile {
      
	int edges, total;
	Scanner s=new Scanner(System.in);
	
	public int getedges()
	{
		System.out.println("Enter the value of edges");
		int e=s.nextInt();
		total = e*e;
		System.out.println("TOTAL="+total);
		return total;
	}


	public String toString() {
		return "Tile [edges=" + edges + ", total=" + total + ", s=" + s + "]";
	}
	
}
