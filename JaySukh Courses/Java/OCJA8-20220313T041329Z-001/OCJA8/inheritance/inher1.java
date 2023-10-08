//single level inheritance
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

class inher1
{
	public static void main(String arg[])
	{
		manager m1=new manager();
		m1.getdata();
		m1.get();
		m1.showdata();
		m1.show();

		manager m2=new manager();
		m2.getdata();
		m2.get();
		m2.showdata();
		m2.show();

	}
}