//extends Thread class
class thread1 extends Thread
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
class thread2 extends Thread
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
class thread3 extends Thread
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
class mythread
{
	public static void main(String arg[])
	{
		thread1 t1=new thread1();//new state
		thread2 t2=new thread2();//new state
		thread3 t3=new thread3();//new state
		t1.start();
		t2.start();
		t3.start();
		int i;
		for(i=31;i<=40;i++)
		{
				System.out.println(i);
				try
				{
					Thread.sleep(4000);
				}
				catch(Exception e){}
		 }
	}
}

