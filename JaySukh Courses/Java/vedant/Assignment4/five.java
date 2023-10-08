import java.util.*;
class Father
{
	String fathername;
	String fatheraddress;
	Father(String fathername,String fatheraddress)
	{
		this.fathername=fathername;
		this.fatheraddress=fatheraddress;
	}

}
class Child extends Father
{
	String childname;
	final String childsurname="Patel";
	Child(String fathername,String fatheraddress,String childname)
	{
		super(fathername,fatheraddress);
		this.childname=childname;
	}
	void displayfullname()
	{
		System.out.println(childsurname+" "+childname+" "+fathername);
		System.out.println(fatheraddress);
	}

}
class five
{
	public static void main(String arg[])
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Father Name");
			String fathername=s.next();
			System.out.println("Enter Child Name");
			String childname=s.next();
			System.out.println("Enter Address");
			String address=s.next();
			Child c1=new Child(fathername,address,childname);
			c1.displayfullname();


	}
}