import java.util.*;
interface ola
{
	void get();
}
interface uber
{
	void display();
}
class cabbooking implements ola,uber
{
	String custname,place;
	float distance,payment;
	public static final float amount=10;
	String cabchoice;

	public void get()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Customer name");
		custname=s.nextLine();
		System.out.println("Enter Place");
		place=s.nextLine();
		while(true)
		{
			System.out.println("Enter cab choice(ola/uber)");
			cabchoice=s.nextLine().toLowerCase();
			boolean flag=false;
			switch(cabchoice)
			{
				case "ola":
				case"uber":flag=true;
								break;
			}
			if(flag)
				break;
		}
		System.out.println("Enter Distance");
		distance=s.nextFloat();
		payment=distance*amount;

	}
	public void display()
	{
		System.out.println("Cutomer Name "+custname);
		System.out.println("Place "+place);
		System.out.println("Distance "+distance);
		System.out.println("Cab Choice "+cabchoice);
		System.out.println("Payment "+payment);
	}
}
class fourth
{
	public static void main(String arg[])
	{
		cabbooking c1=new cabbooking();
		c1.get();
		c1.display();
	}
}