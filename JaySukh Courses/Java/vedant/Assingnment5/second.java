import java.util.*;
interface makemytrip
{
	public abstract void getdetail();
	public abstract void showdetail();

}
class hotel implements makemytrip
{
	String hotelname,hoteladdress,contactno;
	public void getdetail()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Hotel name");
		hotelname=s.nextLine();
		System.out.println("Enter Hotel Address");
		hoteladdress=s.nextLine();
		System.out.println("Enter Contact number");
		contactno=s.nextLine();

	}
	public void showdetail()
	{
		System.out.println("Hotel Name "+hotelname);
		System.out.println("Hotel Address "+hoteladdress);
		System.out.println("Contact Number "+contactno);
	}
}
class customer implements makemytrip
{
	String custname,custaddress,roomtype;
	int stayingdays;
	String acnonac;
	public void getdetail()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Customer name");
		custname=s.nextLine();
		System.out.println("Enter Customer Address");
		custaddress=s.nextLine();
		System.out.println("Enter ac/non ac");
		acnonac=s.nextLine().toLowerCase();

		while(true)
		{
			boolean flag=false;
			System.out.println("Enter Room Type(Royal,Delux,SuperDelux)");
			roomtype=s.nextLine().toLowerCase();
			switch(roomtype)
			{
					case "royal":
					case "delux":
					case "superdelux":flag=true;break;

			}
			if(flag)
				break;
		}
		System.out.println("Enter Stying days");
		stayingdays=s.nextInt();


	}
	public void showdetail()
	{

		System.out.println("Customer Name "+custname);
		System.out.println("Customer Address "+custaddress);
		System.out.println("AC/NONAC "+acnonac);
		System.out.println("Room Type "+roomtype);
		System.out.println("Stying Days "+stayingdays);


	}
	void calbill()
	{
		if(roomtype.equals("royal"))
		{
			if(acnonac.equals("ac"))
			{
					System.out.println("Total Charges are(Royral+Ac) "+(stayingdays*2500));
			}
			else
			{
					System.out.println("Total Charges are(Royral+NOnAc) "+(stayingdays*2000));
			}
		}
		else if(roomtype.equals("delux"))
		{
					if(acnonac.equals("ac"))
					{
							System.out.println("Total Charges are(Delux+Ac) "+(stayingdays*3500));
					}
					else
					{
							System.out.println("Total Charges are(Delux+NOnAc) "+(stayingdays*3000));
					}
		}
		else
		{
				if(acnonac.equals("ac"))
				{
						System.out.println("Total Charges are(SuperDelux+Ac) "+(stayingdays*4500));
				}
				else
				{
						System.out.println("Total Charges are(SuperDelux+NOnAc) "+(stayingdays*4000));
				}
		}
	}
}

class second
{
	public static void main(String arg[])
	{
		hotel h1=new hotel();
		customer c1=new customer();
		h1.getdetail();
		c1.getdetail();
		h1.showdetail();
		c1.showdetail();
		c1.calbill();

	}
}