import java.util.*;
class fruit
{
	private float fruitprice;
	private String fruitcolor;
	fruit(float fruitprice,String fruitcolor)
	{
		this.fruitprice=fruitprice;
		this.fruitcolor=fruitcolor;
	}
	void displayfruitinfo()
	{
		System.out.println("Fruit Price "+fruitprice);
		System.out.println("Fruit Color "+fruitcolor);
	}

}
class mango extends fruit
{
	private String fruitname;
	mango(String fruitname,float fruitprice,String fruitcolor)
	{
		super(fruitprice,fruitcolor);
		this.fruitname=fruitname;

	}
	void displaymangoinfo()
	{
		System.out.println("Fruit Name "+fruitname);
	}
}
class second
{
	public static void main(String arg[])
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter fruit name");
			String fruitname=s.next();
			System.out.println("Enter fruit price");
			float fruitprice=s.nextFloat();
			System.out.println("Enter fruit color");
			String fruitcolor=s.next();
			mango m1=new mango(fruitname,fruitprice,fruitcolor);
			m1.displayfruitinfo();
			m1.displaymangoinfo();

	}
}