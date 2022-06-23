import java.util.*;
import java.sql.*;
import java.io.*;

class Bank
{
	
	
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
			PreparedStatement pst;
			ResultSet rs;
			Scanner sc=new Scanner(System.in);
			int ch=-1;
			while(ch!=0)
			{
				System.out.println("Press 1 For Register Employee");
				System.out.println("Press 2 For Open Customer Account");
				System.out.println("Press 3 For Deposit");
				System.out.println("Press 4 For Withdraw");
				System.out.println("Press 0 For Exit");
				System.out.println();
				System.out.print("Enter Choice:");
				ch=sc.nextInt();
				if(ch==0)
					break;
				switch(ch)
				{
					case 1:
						System.out.println("Enter Employee Details");
						System.out.print(" Enter Employee Username:");
						sc.nextLine();
						String uname=sc.nextLine();
						System.out.print(" Enter Employee Password:");
						String pswd=sc.nextLine();
						pst=con.prepareStatement("insert into Employee values (?,?)");
						pst.setString(1,uname);
						pst.setString(2,pswd);
						pst.executeUpdate();
						System.out.println("Employee Registration Sucessfully\n");
						break;
					case 2:
						System.out.println("Enter Employee Login Details");
						System.out.print("Enter Username:");
						sc.nextLine();
						uname=sc.nextLine();
						System.out.print("Enter Password:");
						pswd=sc.nextLine();
						pst=con.prepareStatement("select * from Employee");
						rs=pst.executeQuery();
						boolean valid=false;
						while(rs.next())
						{
							if(rs.getString(1).equals(uname))
								if(rs.getString(2).equals(pswd))
									valid=true;
						}
						if(valid==true)
						{
							System.out.println("Enter Holder Details");
							System.out.print("	Enter Holder Name:");
							String cname=sc.nextLine();
							System.out.print("	Enter Aadhar Number:");
							long anumber=sc.nextLong();
							pst=con.prepareStatement("select Aadhar from Account");
							rs=pst.executeQuery();
							boolean exist=false;
							while(rs.next())
							{
								if(rs.getLong(1)==anumber)
									exist=true;
							}
							if(exist!=true)
							{
							System.out.print("	Enter Address:");
							sc.nextLine();
							String address=sc.nextLine();
							System.out.print("	Enter Age:");
							int age=sc.nextInt();
							System.out.print("	Enter Gender:");
							sc.nextLine();
							String gender=sc.nextLine();
							System.out.print("	Enter Opening Balance(Minimum 1000):");
							int balance=sc.nextInt();
							pst=con.prepareStatement("select now()");
							rs=pst.executeQuery();
							rs.next();
							String date=rs.getString(1);
							date=date.substring(0,10);
							long acnum=(long)(Math.random()*100000000000000L);
							pst=con.prepareStatement("insert into Account values (?,?,?,?,?,?,?,?)");
							pst.setLong(1,acnum);
							pst.setString(2,cname);
							pst.setLong(3,anumber);
							pst.setString(4,address);
							pst.setInt(5,age);
							pst.setString(6,gender);
							pst.setInt(7,balance);
							pst.setString(8,date);
							pst.executeUpdate();
							System.out.println("Account Created Successfully\n");
							}
							else
								System.out.println("Account Already Exist\n");
						}
						else
							System.out.println("Username/Password Incorrect\n");
						break;
					case 3:
						System.out.print("Enter Account Number:");
						long acnum=sc.nextLong();
						pst=con.prepareStatement("select Holder,Balance from Account where AccountNumber=?");
						pst.setLong(1,acnum);
						rs=pst.executeQuery();
						int status=0;
						int balance=0;
						String holder=null;
						while(rs.next())
						{
							status++;
							holder=rs.getString(1);
							balance=rs.getInt(2);
						}
						if(status==1)
						{
							System.out.print("Enter Deposit Amount:");
							int deposit=sc.nextInt();
							balance=balance+deposit;
							pst=con.prepareStatement("update Account set Balance=? where AccountNumber=?");
							pst.setInt(1,balance);
							pst.setLong(2,acnum);
							pst.executeUpdate();
							System.out.println("Amount Deposit Successfully Updated Balance is "+balance+"\n");
							pst=con.prepareStatement("select now()");
							rs=pst.executeQuery();
							rs.next();
							String date=rs.getString(1);
							date=date.substring(0,10);
							String day=date.substring(8,10);
							String month=date.substring(5,7);
							String year=date.substring(2,4);
							FileOutputStream fos=new FileOutputStream("Bank_"+(day+month+year)+".txt",true);
							String str=acnum+"      "+holder+"      Deposit      "+deposit+"\n";
							byte[] b=str.getBytes();
							fos.write(b);
							fos.close();
						}
						else
							System.out.println("Account Not Found\n");							
						break;
					case 4:
						System.out.print("Enter Account Number:");
						acnum=sc.nextLong();
						pst=con.prepareStatement("select Holder,Balance from Account where AccountNumber=?");
						pst.setLong(1,acnum);
						rs=pst.executeQuery();
						status=0;
						balance=0;
						holder=null;
						while(rs.next())
						{
							status++;
							holder=rs.getString(1);
							balance=rs.getInt(2);
						}
						if(status==1 && balance>=1000)
						{
							System.out.print("Enter Withdraw Amount:");
							int withdraw=sc.nextInt();
							balance=balance-withdraw;
							pst=con.prepareStatement("update Account set Balance=? where AccountNumber=?");
							pst.setInt(1,balance);
							pst.setLong(2,acnum);
							pst.executeUpdate();
							System.out.println("Amount Withdraw Successfully Updated Balance is "+balance+"\n");
							pst=con.prepareStatement("select now()");
							rs=pst.executeQuery();
							rs.next();
							String date=rs.getString(1);
							date=date.substring(0,10);
							String day=date.substring(8,10);
							String month=date.substring(5,7);
							String year=date.substring(2,4);
							FileOutputStream fos=new FileOutputStream("Bank_"+(day+month+year)+".txt",true);
							String str=acnum+"      "+holder+"      Withdraw      "+withdraw+"\n";
							byte[] b=str.getBytes();
							fos.write(b);
							fos.close();
						}
						else if(balance<1000)
							System.out.println("Minimum Balance 1000 Required For Withdraw\n");
						else
							System.out.println("Account Not Found\n");
						break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}