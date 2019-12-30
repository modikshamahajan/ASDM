package session06;

public class Inner_First 
{
    private int no=10;
    private class Inner
    {
    	public void get()
    	{
    		System.out.println("no= "+no);
    	}
    }
	
    public static void main(String[] args)
    {
    	Inner_First fi = new Inner_First();
    	Inner i = fi.new Inner();
    	i.get();
    }
}
