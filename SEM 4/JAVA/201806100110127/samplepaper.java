package BlueDart;
import java.util.*;

class Courier
{
	Scanner sc=new Scanner(System.in);
	
	public String customername, itemname, source, destination;
	public int quantity, price, distance;
	boolean valid;
	
	public String getCname()
	{
		System.out.print("Enter Customer name: ");
		return this.customername=sc.next();
	}
	public String getIname()
	{
		System.out.print("Enter item name: ");
		return this.itemname=sc.next();
	}
	public String getSource()
	{
		System.out.print("Enter Source: ");
		return this.source=sc.next();
	}
	public String getDestination()
	{
		System.out.print("Enter Destination: ");
		return this.destination=sc.next();
	}
	public int getQuantity()
	{
		System.out.print("Enter Quantity: ");
		return this.quantity=sc.nextInt();
	}
	public int getPrice()
	{
		System.out.print("Enter price: ");
		return this.price=sc.nextInt();
	}
	/*public int getDistance()
	{
		if(source=="Surat" && destination=="Bardoli" )
		{
			distance=32;
		}
		else if(source=="Bardoli" && destination=="Surat")
		{
			distance=32;
		}
		else if(source=="Navsari" && destination=="Bardoli")
		{
			distance=28;
		}
		else if(source=="Bardoli" && destination=="Navsari")
		{
			distance=28;
		}
		else if(source=="Surat" && destination=="Navsari")
		{
			distance=35;
		}
		else if(source=="Navsari" && destination=="Surat")
		{
			distance=35;
		}
		return this.distance;
	}*/
	public boolean cheak()
	{
		valid=source.equals(destination); 
		
		if(valid==true)
		{
			try
			{ 
				throw new Exception(); 
			} 
			catch(Exception e) 
			{ 
				System.out.println("Please provide different source and destination");  
			}
		}
		return this.valid;
	}
}
