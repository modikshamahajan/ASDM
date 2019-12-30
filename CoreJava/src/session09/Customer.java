package session09;

public class Customer {

	
	  int amount=10000;
synchronized void withdraw(int amount)
{
	System.out.println("going to withdraw");
if(this.amount<amount)
{
	System.out.println("les balance;waiting for deposite...");
	try {
		wait();
	}
	catch(Exception e) {}
}
this.amount-=amount;
System.out.println("withdraw completed..");
}
synchronized void deposite(int amount)
{
	System.out.println("going to deposite..");
	this.amount+=amount;
	System.out.println("deposite completed...");
    notify();
}
}
