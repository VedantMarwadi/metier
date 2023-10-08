class RBI
{
	float rateofinterest=0.0f;
	void display()
	{
		System.out.println("RBI rate of interest is "+rateofinterest);
	}


}
class SBI extends RBI
{
	String bankname="SBI";
	float rateofinterest=7.0f;
	void display()
	{
			super.display();
			System.out.println("Bank Name "+bankname);
			System.out.println("rate of interest is "+rateofinterest);
	}




}
class AXIS extends RBI
{
	String bankname="AXIS";
	float rateofinterest=8.0f;
	void display()
		{
				super.display();
				System.out.println("Bank Name "+bankname);
				System.out.println("rate of interest is "+rateofinterest);
		}



}
class KOTAK extends RBI
{
	String bankname="KOTAK";
	float rateofinterest=5.0f;
	void display()
		{
				super.display();
				System.out.println("Bank Name "+bankname);
				System.out.println("rate of interest is "+rateofinterest);
		}



}

class twelve
{
	public static void main(String arg[])
	{
		SBI s1=new SBI();
		s1.display();
		AXIS a1=new AXIS();
		a1.display();
		KOTAK k1=new KOTAK();
		k1.display();
	}
}