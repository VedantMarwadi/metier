import java.util.*;
class eligiblevoterexception extends Exception
{
	private int age;
	eligiblevoterexception(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		return "eligiblevoterexception for entry of age(It should be greater than 18) "+age;
	}
}
class six
{
	public static void main(String arg[])
	{

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=s.nextLine();
		System.out.println("Enter Your Address");
		String address=s.nextLine();
		System.out.println("Enter Your Election Card Number");
		int elecardno=s.nextInt();

		System.out.println("Enter Your Age");
		int age=s.nextInt();
		try
		{
			if(age<18)
			{
					throw new eligiblevoterexception(age);
			}
			else
			{
				System.out.println("\n\nVoter detailed Information");
				System.out.println("Voter Name"+name);
				System.out.println("Election card Number"+elecardno);
				System.out.println("Voter Address"+address);
				System.out.println("Voter Age"+age);
				System.out.println("Vote for your facourite political party");
			}
		}
		catch(eligiblevoterexception e)
		{

				System.out.println(e);
		}



	}
}