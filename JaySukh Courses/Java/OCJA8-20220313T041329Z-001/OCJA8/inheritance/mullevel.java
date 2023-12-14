//multi level inheritance
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
		System.out.print(codeno+"\t"+name+"\t"+add+"\t"+sal+"\t");

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

class gmanager extends manager
{
	int spallowance;
	void getspallowance()
	{

		//get();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Special Alloowance");
		spallowance=s.nextInt();
	}
	void showspallowance()
	{

		//show();
		System.out.println(spallowance);

	}


}

class mullevel
{
	public static void main(String arg[])
	{
		gmanager g1=new gmanager();
		g1.getdata();
		g1.get();
		g1.getspallowance();
		g1.showdata();
		g1.show();
		g1.showspallowance();


	}
}