import java.sql.*;

class mysqlconn
{
	public static void main(String []args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getconnection("jdbc:mysql://localhost:3306/mysql","root","root");
			System.out.println("connected successfully");
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("problem in connection");
		}
	
	}

}