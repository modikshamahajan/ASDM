package StudentQ42;

public class Collagestd extends Student
{
	int semester;


   public Collagestd()
    {
	     semester=4;
    }
   
   public Collagestd(int rollno,float percentage,int semester)
   {
	   super(rollno, percentage);
	   this.semester=semester;
   }
   
   public void show()
   {
	   super.show();
	   System.out.println("Semester:" +semester);
	   
   }
}