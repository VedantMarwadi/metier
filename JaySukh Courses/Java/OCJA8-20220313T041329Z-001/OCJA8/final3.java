
class final3
{
	public  final  int count;//final instance variable
	public  final  static int c;//final static variable
	/*final3()
	{
		count=100;

		System.out.println("constructer");

	}*/
	/*void get(int cp)
	{
		count=cp;
		c=cp;
	}*/

	static
	{
		c=67;
		System.out.println("first static block");


	}


	{
		count=45;
		System.out.println("object intializer block");
	}

	public static void main(String arg[])
	{
		System.out.println("main");
		final3 f1=new final3();
		//f1.count=200;
		//c=400;
		//f1.get(500);
		final int a;
		a=10;
		//a=78;



	}
}

