import java.util.*;
class school
{
	String schoolname;
	String address;
	school(String schoolname,String address)
	{
		this.schoolname=schoolname;
		this.address=address;
	}
	void display()
	{
		System.out.println("School Name "+schoolname);
		System.out.println("School Address "+address);
	}


}
class principal extends school
{
	String principalname;
	String principaladdress;
	principal(String schoolname,String address,String principalname,String principaladdress)
	{
			super(schoolname,address);
			this.principalname=principalname;
			this.principaladdress=principaladdress;
	}
	void display()
	{
			super.display();
			System.out.println("Principal Name "+principalname);
			System.out.println("Principal Address "+principaladdress);
	}



}
class ten
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter School name");
		String schoolname=s.nextLine();
		System.out.println("Enter School address");
		String address=s.nextLine();
		System.out.println("Enter Principal name");
		String principalname=s.nextLine();
		System.out.println("Enter Principal address");
		String principaladdress=s.nextLine();
		principal p1=new principal(schoolname,address,principalname,principaladdress);
		p1.display();



	}
}