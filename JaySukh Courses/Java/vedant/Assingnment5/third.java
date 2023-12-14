import java.util.*;
interface number
{
	void getnumber();
	void showresult();


}
class sqrt implements number
{
	int no;
	public void getnumber()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		no=s.nextInt();
	}
	public void showresult()
	{
		System.out.println("Square root of number "+Math.sqrt(no));
	}
}
class cube implements number
{
	int no;
	public void getnumber()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		no=s.nextInt();
	}
	public void showresult()
	{
		System.out.println("Cube of number "+Math.pow(no,3));
	}
}

class third
{
	public static void main(String arg[])
	{
		sqrt s1=new sqrt();
		cube c1=new cube();
		s1.getnumber();
		s1.showresult();
		c1.getnumber();
		c1.showresult();

	}
}