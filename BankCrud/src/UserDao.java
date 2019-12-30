import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDao {

	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            System.out.println("diver found");
            con=DriverManager.getConnection("jdbc:mysql://192.168.100.26:3306/group029","group029","welcome");
            System.out.println("connection done...");
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }  
        return con;
	}
	
	public static int save(User e)
	{
		int status=0;
		try
		{
			Connection con =UserDao.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into bank(name,address,account,mobile,balance) values(?,?,?,?,?)");
			ps.setString(1,e.getName());
			ps.setString(2,e.getAddress());
			ps.setInt(3,e.getAccount());
			ps.setString(4,e.getMobile());
			ps.setDouble(5,e.getBalance());
		
			status = ps.executeUpdate();
			con.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return status;
	}
}
