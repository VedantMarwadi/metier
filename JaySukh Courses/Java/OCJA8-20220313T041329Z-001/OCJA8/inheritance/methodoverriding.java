//method overriding
//instance variable hiding
import java.util.*;
class A
{
}
class B extends A
{
}
class C extends B
{
}
class emp
{
	int codeno;
	String name;
	String add;
	int sal;
	int a=100;

	void  getdata()
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
		//return new A();

	}
	 void showdata()
	{
		System.out.print(codeno+"\t"+name+"\t"+add+"\t"+sal+"\t");

	}

}
class manager extends emp
{
	String dept;
	int a=1000;//instance variable hiding
	 void getdata()//method overriding
	{
		super.getdata();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter deaprtment");
		dept=s.next();
		//return new C();
	}
	 void showdata()//method overriding
	{
		super.showdata();
		System.out.println(dept);

	}
	void show()
	{
		System.out.println("child class "+a);
		System.out.println("child class "+this.a);
		System.out.println("parent class "+super.a);
	}


}

class methodoverriding
{
	public static void main(String arg[])
	{
		manager m1=new manager();
		//m1.getdata();
		m1.getdata();
		//m1.showdata();
		m1.showdata();
		m1.show();

		manager m2=new manager();
		//m2.getdata();
		m2.getdata();
		//m2.showdata();
		m2.showdata();
		m2.show();
	}
}