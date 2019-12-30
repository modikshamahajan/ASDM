package StudentQ42;

public class XYZ {
	
	  
	
	public static void main(String args[])
	{
		Student s[]=new Student[5];
		s[0]=new Collagestd(28,90,6);
		s[1]=new Collagestd(29,95,8);
		s[2]=new Collagestd(30,92,4);
		
		s[3]=new Schoolstd(30,92,10);
		s[4]=new Schoolstd(30,92,10);
	
		
		for(int i=0;i<s.length;i++)
		{
		   s[i].show();
		}
		
//		for(int i=0;i<s.length;i++)
//		{
//			if(percentage>75)
//			{
//				cnt++;
//			}
//		}
	}
}
