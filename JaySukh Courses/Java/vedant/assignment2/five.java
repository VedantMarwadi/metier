import java.util.*;
class five
{
	int maths,sci,eng;
	float average;
	five(int maths,int sci,int eng)
	{
			this.maths=maths;
			this.sci=sci;
			this.eng=eng;
			average=(maths+sci+eng)/3.0f;
	}
	void displayaverage()
	{
		System.out.println("Average is "+average);

	}
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Maths,Science and English Marks Respectively");
		int maths=s.nextInt();
		int sci=s.nextInt();
		int eng=s.nextInt();
		five f1=new five(maths,sci,eng);
		f1.displayaverage();

	}
}