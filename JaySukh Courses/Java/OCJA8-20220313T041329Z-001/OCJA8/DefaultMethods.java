interface Sayable
{
    // Default method
    default void say()//by default public
    {
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void sayMore(String msg);//by default public and abstract
}
public class DefaultMethods implements Sayable
{
    public void sayMore(String msg)
    {        // implementing abstract method
        System.out.println(msg);
    }
    public void say()
	{
		  Sayable.super.say();//default method of interface
	      System.out.println("Hello we are overiding defualt method");
    }
    void my()
    {
		System.out.println("Child Method");
	}
    public static void main(String[] args)
    {
        DefaultMethods dm = new DefaultMethods();
        dm.say();   // calling default method
        dm.sayMore("Work is worship");  // calling abstract method
        dm.my();

        Sayable dm2 = new DefaultMethods();
        dm2.say();   // calling default method
        dm2.sayMore("Work is worship");  // calling abstract method
        //dm2.my();
        if(dm2 instanceof DefaultMethods)
        {
			((DefaultMethods)dm2).my();
		}

    }
}