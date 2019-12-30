package Bhk_Q40;

public class TwoBHK extends OneBHK {
   int room2Area;
   static int cnt2;
   
   public TwoBHK()
   {
	   room2Area= 89;
   }
   public TwoBHK(int roomArea,int hallArea,float price,int room2Area)
   {
	   super(roomArea,hallArea,price);
	   this.room2Area=room2Area;
	   cnt2++;
   }
   public void display()
   {
	 //super.show();
	  
	   System.out.println("one BHK :-"+"Room area:-"+roomArea);
	   System.out.println("one BHK :-"+"hall area:-"+hallArea);
	   System.out.println("one BHK :-"+"price:-"+price);
	   System.out.println("TWO BHK :-"+"Room Area:-"+room2Area);
   }
   
   public void showcnt()
   {
	   super.showcnt();
	   super.total();
	   System.out.println("Total no of 2BHK flat:- "+cnt2);
   }
   
//   public static void main(String[] args) 
//   {
////	 TwoBHK t= new TwoBHK();
////	 t.display();
//	 TwoBHK t1= new TwoBHK(80);
//	 t1.display();
//   }
}
