package Bhk_Q40;

public class OneBHK {

	int roomArea;
	int hallArea;
	float price;
	float total=0;
	static int cnt1;
	
	public OneBHK()
	{
		roomArea=88;
		hallArea=90;
		price =890000;
	}
	
	public OneBHK(int roomArea, int hallArea, float price)
	{
		this.roomArea= roomArea;
		this.hallArea= hallArea;
		this.price=price;
		cnt1++;
	}
	
	public void showcnt()
	
	{
		System.out.println("Total no of 1Bhk flats :- "+cnt1);
	}
	public void total()
	{     
		 total=total+price;
	}
	/*public void show()
	{
		System.out.println("ONE BHK:- "+"\nRoom Area:"+roomArea+" "+"\nHall Area:"+hallArea+" "+"\nPrice:"+price);
	}*/
	
//	public static void main(String[] args) {
//		OneBHK o = new OneBHK();
//		OneBHK o1 = new OneBHK(34,78,890000);
//	    o.show();
//	    o1.show();
//	    
//	}
}
