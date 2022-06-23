import BlueDart.*;
import java.util.*;
import java.sql.*;

class sordestination
{
	public static void main(String[] args)
	{
		Courier c = new Courier();
		boolean rs=false;
		int distance;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
	
				
			CallableStatement cst=con.prepareCall("{call sp_Insert(?,?,?,?,?,?,?)}");
			
			String d=c.getDestination();
			String s=c.getSource();
			if(s=="Surat" && d=="Bardoli" )
			{
				distance=32;
			}
			else if(s=="Bardoli" && d=="Surat")
			{
				distance=32;
			}
			else if(s=="Navsari" && d=="Bardoli")
			{
				distance=28;
			}
			else if(s=="Bardoli" && d=="Navsari")
			{
				distance=28;
			}
			else if(s=="Surat" && d=="Navsari")
			{
				distance=35;
			}
			else if(s=="Navsari" && d=="Surat")
			{
				distance=35;
			}

			cst.setString(1,c.getCname());
			cst.setString(2,c.getIname());
			cst.setInt(3,c.getQuantity());
			cst.setInt(4,c.getPrice());
			cst.setString(5,c.getSource());
			cst.setString(6,c.getDestination());
			cst.setInt(7,distance);

			boolean valid=c.cheak();
			
			if(valid!=true)
			{
				rs=cst.execute();
			}

			System.out.println(rs);
			
			if(rs==true)
			{
				System.out.println("Insert Record Successfully");
			}
			else
			{
				System.out.println("Record is not inserted");
			}		
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Database connectivity problem : "+e);
		}
	}	
}