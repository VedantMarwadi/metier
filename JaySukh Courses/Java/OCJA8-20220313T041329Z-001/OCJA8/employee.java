import java.util.*;
class employee
{
	int id;
	String name;
	String address;
	long phone;
	String dept;
	float basicsal;
	float pf,tada,hra,netsal;
	employee()
	{
		System.out.println("constructer");
	}
	void getdata1()
	{
		id=1;
		name="jay";
		address="naranpura";
		phone=456765;
		dept="production";
		basicsal=25000;

	}
	void getdata2()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id");
		id=s.nextInt();
		System.out.println("Enter Name");
		name=s.next();
		System.out.println("Enter address");
		address=s.next();
		System.out.println("Enter phone no");
		phone=s.nextLong();
		System.out.println("Enter department");
		dept=s.next();
		System.out.println("Enter basic salary");
		basicsal=s.nextFloat();
	}
	void showdata()
	{
		System.out.println("id "+id);
		System.out.println("name "+name);
		System.out.println("address "+address);
		System.out.println("phone no "+phone);
		System.out.println("department "+dept);
		System.out.println("basic salary "+basicsal);
		System.out.println("tada "+tada);
		System.out.println("hra "+hra);
		System.out.println("pf "+pf);
		System.out.println("net salary "+netsal);

	}
	void calsalary()
	{
		tada=basicsal*0.12f;
		hra=basicsal*0.10f;
		pf=basicsal*0.15f;
		netsal=basicsal+tada+hra-pf;
	}
	void getinfo(int i,String n,String a,long p,String d,float b)
	{
		id=i;
		name=n;
		address=a;
		phone=p;
		dept=d;
		basicsal=b;
	}
	public static void main(String arg[])
	{
		employee e1=new employee();
		employee e2=new employee();
		employee e3=new employee();
		employee e4=new employee();
		employee e5=new employee();
		employee e6=new employee();
		e1.getdata1();
		e2.getdata1();
		e3.getdata2();
		e4.getdata2();
		e5.getinfo(67,"lalit","naranpura",34654645,"production",12000);
		e6.getinfo(78,"nirav","satrelite",36454576,"reserch",15000);
		e1.calsalary();
		e2.calsalary();
		e3.calsalary();
		e4.calsalary();
		e5.calsalary();
		e6.calsalary();
		e1.showdata();
		e2.showdata();
		e3.showdata();
		e4.showdata();
		e5.showdata();
		e6.showdata();
		System.out.println(e1.id);
	}

}