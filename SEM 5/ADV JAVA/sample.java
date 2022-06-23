import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

class Courier 
{
    String cname,iname,source,destination;
    int quantity,distance;
    float price;
    public void calculate() throws Exception
    {
        if(source.equals("Bardoli") && destination.equals("Surat"))
        {
            distance = 32;
        }
        else if(source.equals("Bardoli") && destination.equals("Navsari"))
        {
            distance = 28;
        }
        else if(source.equals("Surat") && destination.equals("Navsari"))
        {
            distance = 35;
        }
        else
        {
           throw new Exception("Source and destination must be different");
        }
    }
    public void admin()
    {
        Scanner sc = new Scanner(System.in);
        Courier c = new Courier();
        try
		{	
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root", "root");
            System.out.println("Enter Customer name: ");
            c.cname = sc.next();
            System.out.println("Enter Item name: ");
            c.iname = sc.next();
            System.out.println("Enter Product Quantity: ");
            c.quantity = sc.nextInt();
            System.out.println("Enter Price: ");
            c.price = sc.nextFloat();
            System.out.println("Enter Source: ");
            c.source = sc.next();
            System.out.println("Enter Destination: ");
            c.destination= sc.next();
            c.calculate();

            CallableStatement cst = con.prepareCall("{call pinsert(?,?,?,?,?,?,?)}");
         
			cst.setString(1,c.cname);
            cst.setString(2,c.iname);
            cst.setInt(3,c.quantity); 
            cst.setFloat(4,c.price);
            cst.setString(5,c.source);
            cst.setString(6,c.destination);
            cst.setInt(7,c.distance);
            cst.execute();
            System.out.println("Data inserted Successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) 
    {
        Courier c = new Courier();
        String username,password;
        int flag=0;
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root", "root");
            flag=1;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        if (flag == 1)
        {
            while(true)
            {
                System.out.println("Enter Username: ");    
                username = sc.next();
                System.out.println("Enter Password: ");    
                password = sc.next();
                try
                {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root", "root");
                    PreparedStatement pst = con.prepareStatement("select count(id) from tbl_bluecart_master where username = ? and password = md5(?) and status = true;");
                    pst.setString(1,username);
                    pst.setString(2,password);
                    ResultSet rs = pst.executeQuery();
                    rs.next();
                    int signal = rs.getInt(1);
                    if(signal == 1)
                    {
                        c.admin();
                    }
                    else
                    {
                        System.out.println("Invalid Username or Password");
                        System.out.println("==============================");
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
        
    }
}