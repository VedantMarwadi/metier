//implements Runnable interface
class thread11 implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}

	}
}
class thread22 implements Runnable
{
	public void run()
	{
		int i;
		for(i=11;i<=20;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}

	}
}
class thread33 implements Runnable
{
	public void run()
	{
		int i;
		for(i=21;i<=30;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}

	}
}
class mythread2
{
	public static void main(String arg[])
	{

		thread11 t1=new thread11();
		thread22 t2=new thread22();
		thread33 t3=new thread33();



		Thread t11=new Thread(t1);
		Thread t22=new Thread(t2);
		Thread t33=new Thread(t3);

		t11.start();
		t22.start();
		t33.start();


	}
}

