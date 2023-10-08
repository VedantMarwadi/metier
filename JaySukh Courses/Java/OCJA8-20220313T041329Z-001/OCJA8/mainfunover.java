//function overloading or method overloading with main function

class mainfunover
{

	public static void main(int i)
	{
		System.out.println(i);
	}
	public void main(char i)
	{
			System.out.println(i);
	}
	public static void main(String i)
	{
			System.out.println(i);
	}
	public static void main(String arg[])
	{
			System.out.println("Original Main function");
			main(10);//because it is static
			main("jay");//because It is static
			mainfunover m1=new mainfunover();
			m1.main('A');//because It is not static
	}
}