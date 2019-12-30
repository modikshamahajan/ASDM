package session09;

public class Table {

	synchronized public void printTable(int n)
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(n*i);
			
			try {
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
