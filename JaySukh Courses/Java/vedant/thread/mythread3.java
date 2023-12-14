//implements Runnable interface
class thread11 implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+","+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}

	}
}
class mythread3
{
	public static void main(String arg[])
	{

		thread11 t1=new thread11();
		thread11 t2=new thread11();
		thread11 t3=new thread11();



		Thread t11=new Thread(t1);
		Thread t22=new Thread(t2);
		Thread t33=new Thread(t3);
		t11.setName("First");
		t22.setName("Second");
		t33.setName("Third");

		t11.start();
		t22.start();
		t33.start();


	}
}

