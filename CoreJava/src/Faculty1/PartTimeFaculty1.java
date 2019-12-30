package Faculty1;

public class PartTimeFaculty1 extends Faculty1

{
    int hour,rate;
    
    public void accept()
    {
    	System.out.println("enter hours");
    	 hour=s.nextInt();
    	System.out.println("enter rate");
    	 rate=s.nextInt();
    }
    public void display()
    {
    	
    	salary=hour*rate;
   	    System.out.println("Part time faculty salary:"+salary );
    	
    }
}
