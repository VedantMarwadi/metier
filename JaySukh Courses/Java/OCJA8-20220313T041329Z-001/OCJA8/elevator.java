class elevator
{
	boolean isopen=false;
	int currentfloor=1;
	public final int topfloor=10;
	public final int minfloor=1;

	public void opendoor()
	{
		System.out.println("opening the door");
		isopen=true;
		System.out.println("now door is open");
	}
	public void closedoor()
	{
		System.out.println("closing the door");
		isopen=false;
		System.out.println("now door is closed");
	}
	public void goup()
	{
		if(currentfloor<topfloor && !isopen)
		{
			System.out.println("Going up one floor");
			currentfloor++;
			System.out.println("floor ="+currentfloor);
		}
		else
		{
			System.out.println("Top floor has been reached");
		}
	}
	public void godown()
	{
		if(currentfloor>minfloor && !isopen)
		{
			System.out.println("Going down one floor");
			currentfloor--;
			System.out.println("floor ="+currentfloor);

		}
		else
		{
			System.out.println("bottom floor has been reached");
		}
	}
	void setfloor(int no)
	{
		while(currentfloor!=no)
		{
			if(currentfloor<no)
				goup();
			else
				godown();
		}
	}
	public static void main(String arg[])
	{
		elevator e1=new elevator();
		e1.opendoor();
		e1.closedoor();
		for(int i=1;i<=12;i++)
		{
			e1.goup();
		}
		for(int i=1;i<=12;i++)
		{
			e1.godown();
		}
		e1.setfloor(5);
		System.out.println(e1.currentfloor);
		e1.setfloor(8);
		System.out.println(e1.currentfloor);
		e1.setfloor(2);
		System.out.println(e1.currentfloor);


	}
}