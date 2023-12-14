import java.util.*;
abstract class simpleinterest
{
		float amount,rate,duration;
		simpleinterest(float amount,float rate,float duration)
		{
			this.amount=amount;
			this.rate=rate;
			this.duration=duration;
		}
		public abstract void calinterest();


}
class interest extends simpleinterest
{
		interest(float amount,float rate,float duration)
		{
			super(amount,rate,duration);
		}
		public void calinterest()
		{
			System.out.println("Simple interest is "+(amount*rate*duration/100));
		}

}

class thirteen
{
	public static void main(String arg[])
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Amount");
			float amount=s.nextFloat();
			System.out.println("Enter Rate of interest");
			float rate=s.nextFloat();
			System.out.println("Enter Duration in years");
			float duration=s.nextFloat();
			interest i1=new interest(amount,rate,duration);
			i1.calinterest();


	}
}