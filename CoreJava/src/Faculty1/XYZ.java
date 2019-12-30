package Faculty1;

public class XYZ 
{

	public static void main(String[] args)
	{    
		 
		 PartTimeFaculty1 p[]=new PartTimeFaculty1[2]; 
		 
		 for(int i=0;i<p.length;i++)
		 {
		 p[i]=new PartTimeFaculty1();
		 p[i].accept();
		 p[i].display();
		
		 }
		 
		 
	 FullTimeFaculty1 f[]=new FullTimeFaculty1[2];
		 
		 for(int i=0;i<f.length;i++)
		 {
		 f[i]=new FullTimeFaculty1();
		 f[i].accept();
	      f[i].display();
		
		 }
		
	}
	
	
	
	
}
