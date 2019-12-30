package session06;

public class Immutable_Employee 
{
   final String panCard;
   public Immutable_Employee(String panCard)
   {
	   this.panCard= panCard;
   }
   
   public String getpanCard()
   {
	   return panCard;
   }
   
   public static void main(String[] args)
   {
	   Immutable_Employee e1= new Immutable_Employee("111");
	   Immutable_Employee e2= new Immutable_Employee("222");
	   
	   System.out.println(e1.getpanCard());
	   System.out.println(e2.getpanCard());
   }
}
