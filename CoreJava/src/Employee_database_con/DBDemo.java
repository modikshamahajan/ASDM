package Employee_database_con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBDemo 
{

	public static void main(String[] args) throws SQLException
	{
		Connection con = null;
		PreparedStatement pstmt;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver found");
			con=DriverManager.getConnection("jdbc:mysql://192.168.100.26:3306/group029","group029","welcome");
		    System.out.println("Connection Established");
		    pstmt=con.prepareStatement("insert into Employeejava values(?,?,?)");
		    
		    
		    Scanner s=new Scanner(System.in);
		    System.out.println("Enter empolyee id");
		    int i=s.nextInt();
		    System.out.println("Enter empolyee name");
		    String n=s.next();
		    System.out.println("Enter empolyee salary");
		    int sal=s.nextInt();
		    
		    pstmt.setInt(1, i);
		    pstmt.setString(2, n);
		    pstmt.setFloat(3
		    		, sal);
		    
		    int status=pstmt.executeUpdate();
		    if(status>0)
		    {
		    	System.out.println("Successfully inserted");
		    }
		    else
		    {
		    	System.out.println("Failed to insert");
		    }
		    rs=pstmt.executeQuery("select * from Employeejava");
		    while(rs.next())
		    {
		    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		    }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			con.close();
		}
		
	}
}
