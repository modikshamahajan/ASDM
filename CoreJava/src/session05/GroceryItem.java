package session05;

public class GroceryItem extends Item{
	
	String name;
	int qty;
	float rate;
	float dis;
	final float disper=0.01f;
	float amt;

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		amt =rate * qty;
		System.out.println("Amount= "+amt);
	}

	@Override
	public void calAmount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calDiscount() {
		// TODO Auto-generated method stub
		dis= amt * disper;
		amt = amt-dis;
		System.out.println("Discount= "+dis);
		System.out.println("Amount to be paid= "+amt);
	}
}
