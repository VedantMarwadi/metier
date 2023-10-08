//tree type inheritance
import java.util.*;
class emp
{
	int codeno;
	String name;
	String add;
	int sal;

	void getdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter codeno");
		codeno=s.nextInt();
		System.out.println("Enter name");
		name=s.next();
		System.out.println("Enter address");
		add=s.next();
		System.out.println("Enter salary");
		sal=s.nextInt();


	}
	void showdata()
	{
		System.out.print(codeno+"\t"+name+"\t"+add+"\t"+sal);

	}

}
class manager extends emp
{
	String dept;
	void get()
	{
		//getdata();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter deaprtment");
		dept=s.next();
	}
	void show()
	{
		//showdata();
		System.out.println(dept);

	}


}

class engineer extends emp
{
	String plant;
	void getplant()
	{
		//getdata();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the plant number:");
		plant = s.next();
	}
	void showplant()
	{
		//showdata();
		System.out.println("\t"+plant);
	}
}
class supervisor extends emp
{
	int noofhours;
	void getnoofhours()
	{
		//getdata();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of hours");
		noofhours = s.nextInt();
	}
	void shownoofhours()
	{
		//showdata();
		System.out.println("\t"+noofhours);
	}
}


class inher2
{
	public static void main(String arg[])
	{
		manager m1=new manager();
		m1.getdata();
		m1.get();
		m1.showdata();
		m1.show();

		engineer e1=new engineer();
		e1.getdata();
		e1.getplant();
		e1.showdata();
		e1.showplant();

		supervisor s1=new supervisor();
		s1.getdata();
		s1.getnoofhours();
		s1.showdata();
		s1.shownoofhours();
	}
}