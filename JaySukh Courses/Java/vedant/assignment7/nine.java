import java.util.*;
class excessweightexception extends Exception
{
	float weight;
	excessweightexception(float weight)
	{
		this.weight=weight;
	}
	public String toString()
	{
		return "Weight is more than 15 kg so excessweightexception is generated with weight"+weight;
	}
}
class passenger
{
	String name,destination,address;
	float weight;
	void getvalues()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name");
		name=s.nextLine();
		System.out.println("Enter Address");
		address=s.nextLine();
		System.out.println("Enter Destination");
		destination=s.nextLine();
		try
		{
			System.out.println("Enter luggage weight");
			weight=s.nextFloat();
			if(weight>15)
			{
					throw new excessweightexception(weight);
			}
			showdata();
		}
		catch(excessweightexception e)
		{
			System.out.println(e);
		}
		System.out.println("Have a nice day");


	}
	void showdata()
	{
		System.out.println("Name "+name);
		System.out.println("Address "+name);
		System.out.println("Destination "+destination);
		System.out.println("Weight "+weight);
	}

}
class nine
{
	public static void main(String arg[])
	{
		passenger p1=new passenger();
		p1.getvalues();


	}
}