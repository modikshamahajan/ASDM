package session06;

public class CloningProgram implements Cloneable
{
   int rn;
   String nm;
   
   public CloningProgram(int rn, String nm)
   {
	   super();
	   this.rn= rn;
	   this.nm= nm;
   }

    public String toString()
    {
	return "Cloning [rn=" + rn + ", nm=" + nm + "]";
    }
    
    protected Object Clone() throws CloneNotSupportedException
    {
		return super.clone();
    }
    
    public static void main(String[] args) throws CloneNotSupportedException
    {
    	CloningProgram c1 = new CloningProgram(1,"Modiksha");
    	System.out.println("c1 ="+c1);
    	
    	CloningProgram c2 = (CloningProgram)c1.Clone();
    	System.out.println(c2.nm+" "+c2.rn);
    	System.out.println("c2 ="+c2);
    }
   
}
