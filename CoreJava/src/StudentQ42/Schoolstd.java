package StudentQ42;

public class Schoolstd extends Student
{
    int classname;
    
    public Schoolstd()
    {
    	classname=10;
    }
    public Schoolstd(int rollno,float percentage,int classname)
    { 
    	super(rollno,percentage);
    	this.classname=classname;
    }
    
    public void show()
    {
    	super.show();
    	System.out.println("Classname: " +classname);
    }
}
