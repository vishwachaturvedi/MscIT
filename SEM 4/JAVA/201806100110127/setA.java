
import java.util.*;

import java.sql.*;

import java.util.Scanner;

import java.lang.*;


class ex

{
	public static void main(String[] args)

	{
		try

			{
			
			Class.forName("com.mysql.jdbc.Driver");
	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
	
			System.out.println("Connection Established..");

			
			Scanner sc=new Scanner(System.in);
			

			
			int rid;
			
			String duration,lab,semester,day,subject,faculty1,faculty2,faculty3,set,ch;
		
			//date date;


			
		
			
			System.out.print("Enter id:-");
			
			rid=sc.nextInt();


			System.out.print("Enter labduration:-");

			duration=sc.next();

			
		
			System.out.print("Enter lab:-");
		
			lab=sc.next();
	
	
		if(lab!="CL-01" || lab!="CL-02")
	
		{
				
			System.out.println("\nEnter valid lab!\n");

			lab="NULL";
	
		}

		else
			
			{
				
				lab=lab;

			}

			

		System.out.print("Enter class:-");

		semester=sc.next();


		System.out.print("Enter Day:-");

		day=sc.next();



		System.out.print("Enter Subject:-");
	
		subject=sc.next();



		System.out.print("Enter Faculty names:-");

		faculty1=sc.next();

		

		System.out.println("Enter Second Facult:-");

		faculty2=sc.next();



		System.out.println("Enter third Faculty:-");

		faculty3=sc.next();



			if(labdur=="8:30 to 9:25") && lab=="CL-01" && day=="Monday" && sub=="JAVA");

			{
				
				else if(lab=="CL-01" && day=="Monday" || sub=="JAVA")

					{	
		
					}

					else if(lab=="CL-02" && day=="Monday" || sub=="JAVA")

						{

						}
		
			}

			
			String set=concat(faculty1+":"+faculty2+":"+faculty3);

			System.out.println(set);


			//String sql=("insert into tbl_lab_register values(rid,labdur,lab,clas,lday,sub,fac1,date)");

			PreparedStatement pst=con.prepareStatement("insert into tbl_lab_register (rid,labduration,lab,sem,lab_day,subject,present_faculty) values(?,?,?,?,?,?,?)");

			pst.setInt(1,rid);

			pst.setString(2,duration);

			pst.setString(3,lab);

			pst.setString(4,semester);

			pst.setString(5,day);

			pst.setString(6,subject);

			pst.setString(7,set);


			int r=pst.executeUpdate();

			
			if(r==0)

						{
	
						System.out.println("Not Inserted..");
			
			}
		
						else
		
						{
				
						System.out.println("Inserted..");

						}	

			
						System.out.println("Enter lab for schedule:-");
		
						lab=sc.next;
			

						System.out.println("Enter Day:-");
	
						day=sc.next();
	
	
						PreparedStatement ps=con.prepareStatement("select * from tbl_lab_register where (lab=lab) and (day=day) ");

						ResultSet r1=ps.executeQuery();
	
			
			while(r1.next())

						{

						int a1=r1.getInt(1);

						String a2=r1.getString(2);

						String a3=r1.getString(3);
		
				String a4=r1.getString(4);

						String a5=r1.getString(5);

						String a6=r1.getString(6);

						String a7=r1.getString(7);

						}
	        	
				System.out.println("\n"+a1+"\t"+a2+"\t"+a3+"\t"+a4+"\t"+a5+"\t"+a6"\t"+a7"\n");	
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
			
