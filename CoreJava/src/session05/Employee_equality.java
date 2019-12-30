package session05;

public class Employee_equality extends Object
{
    int empId;
    String empNm;
    
   	public Employee_equality(int empId, String empNm) {
		super();
		this.empId = empId;
		this.empNm = empNm;
	}
   	
	public String toString() 
	{
		return "Employee_equality [empId=" + empId + ", empNm=" + empNm + "]";
	}
    
   public boolean equals(Object o)
   {
	   Employee_equality e = (Employee_equality)o;
	   if((this.empId == e.empId) && (this.empNm.equals(e.empNm)))
		   
		   return true;
	   else
		   return false;
   }
   //Code for hashcode
   public int hashcode()
   {
	   return empId+1;
   }
   
   public static void main(String[] args)
   {
	   Employee_equality e1 = new Employee_equality(1,"Modiksha");
	   Employee_equality e2 = new Employee_equality(1,"Modiksha");
   
	   if(e1.equals(e2))
       System.out.println("Object are equals");
	   
	   else
		   System.out.println("Object are not equal");
	   
	   System.out.println("e1 ="+e1.hashcode());
	   System.out.println("e2 ="+e2.hashcode());
	   
   }
 }
