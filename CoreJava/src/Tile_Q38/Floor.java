package Tile_Q38;

import java.util.Scanner;

public class Floor {
      int leng;
      int width;
      static int totaltiles;
	int area;
      Scanner s=new Scanner(System.in);

public void totaltiles(Tile t)
   {
      System.out.println("Enter the length and width:");
      int l=s.nextInt();
      int w=s.nextInt();
      
      area=l*w;
      totaltiles = area/(t.total);
   }

public String toString() {
	return "Floor [leng=" + leng + ", width=" + width + ", totaltiles=" + totaltiles + ", area=" + area + ", s=" + s
			+ "]";
}

public static void main(String[] args)
    {
	  Tile t= new Tile();
	 // t.getedges();
 	 Floor f= new Floor();
 	 f.totaltiles(t);
 	 System.out.println("Totaltiles="+totaltiles);
 	  
    }

}

