import java.util.*;
class atm
{
		private String cardholdername;
		private long cardno;
		private int cvvcode;
		void getvalues()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter card holder name");
			cardholdername=s.nextLine();
			System.out.println("Enter card number");
			cardno=s.nextLong();
			String str="";
			while(true)
			{
				System.out.println("Enter cvv code of three digits");
				str=s.next();
				if (str.length()!=3)
					System.out.println("Enter three digits only");
				else
					break;
			}
			cvvcode=Integer.parseInt(str);
		}
		void showvalues()
		{
			System.out.println("Card Holder Name "+cardholdername);
			System.out.println("Card Number "+cardno);
			System.out.println("Cvv Code "+cvvcode);
		}


}
class second
{
	public static void main(String arg[])
	{
			atm a1=new atm();
			a1.getvalues();
			a1.showvalues();
	}
}