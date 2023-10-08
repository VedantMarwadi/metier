class CustomThread extends Thread
{
    Shared shared;

    public CustomThread(Shared shared, String string)
    {
        super(string);
        this.shared = shared;
        start();
    }

    public void run()
 	{
            shared.doWork(Thread.currentThread().getName());
    }
}

class Shared
{
    synchronized   void doWork(String string)
    {
        System.out.println("Starting " + string);

       try {
            Thread.sleep((long) (Math.random() * 500));
        } catch (InterruptedException e) {}

        System.out.println("Ending " + string);
    }
}

class synchronize3
{
    public static void main(String args[])
    {
        Shared shared1 = new Shared();

        CustomThread thread1 = new CustomThread(shared1, "one");
        CustomThread thread2 = new CustomThread(shared1, "two");
        CustomThread thread3 = new CustomThread(shared1, "three");
        CustomThread thread4 = new CustomThread(shared1, "four");


    }
}