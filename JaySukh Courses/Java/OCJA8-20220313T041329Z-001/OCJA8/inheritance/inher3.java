//method overriding or instance variable hiding
import java.util.*;
/*class A
{
}
class B extends A
{
}
class C extends B
{
}*/
class emp
{
	int codeno;
	String name;
	String add;
	int sal;
	int a=100;

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
		//return new A();



	}
	void showdata()
	{
		System.out.print(codeno+"\t"+name+"\t"+add+"\t"+sal);

	}

}
class manager extends emp
{
	String dept;
	int a=1000;//instance variable hiding
	void getdata()
	{
		super.getdata();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter deaprtment");
		dept=s.next();
		//return new C();

	}
	void showdata()
	{
		super.showdata();
		System.out.println(dept);
		System.out.println("parent class"+super.a);
		System.out.println("child class"+this.a);
		System.out.println("child class"+a);

	}


}

class inher3
{
	public static void main(String arg[])
	{
		manager m1=new manager();
		m1.getdata();
		m1.showdata();




	}
}
