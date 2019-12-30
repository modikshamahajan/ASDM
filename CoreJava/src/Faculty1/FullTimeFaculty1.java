package Faculty1;

public class FullTimeFaculty1 extends Faculty1
{
    int basic,allowance;
    
    public void accept() {
    
    System.out.println("enter faculty id");
    fid=s.nextInt();
    System.out.println("enter faculty basic");
      basic=s.nextInt();
    System.out.println("enter faculty allowance");
     allowance=s.nextInt();
    }
    
    public void display()
    {
    	 
    	salary=basic+allowance;
    	
    	
    	System.out.println("faculty id="+fid+"   Basic salary:"+basic+"   Allowance:"+allowance+"    Salary:"+salary);
    }
}
