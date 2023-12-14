interface Sayable1
{
    // default method
     default void say()
    {
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void sayMore(String msg);
    // static method
    public static void sayLouder(String msg)
    {
        System.out.println(msg);
    }
}
public class DefaultMethods2 implements Sayable1
{
    public void sayMore(String msg)
    {     // implementing abstract method
        System.out.println(msg);
    }
   	public static void sayLouder(String msg)
	{
			Sayable1.sayLouder(msg);
	        System.out.println("we are overiding static method"+msg);
    }
    public void say()
	{
			Sayable1.super.say();
	        System.out.println("Hello, this is default method2");
    }

    public static void main(String[] args)
    {
        DefaultMethods2 dm = new DefaultMethods2();
        dm.say();                       // calling default method
        dm.sayMore("Work is worship");      // calling abstract method
        Sayable1.sayLouder("Helloooo...");   // calling static method
        dm.sayLouder("Helloooo...");   // error -calling static method
		DefaultMethods2.sayLouder("Helloooo...");
        Sayable1 dm2 = new DefaultMethods2();
        dm2.say();                       // calling default method
		dm2.sayMore("Work is worship");      // calling abstract method
		Sayable1.sayLouder("Helloooo...");   // calling static method*/
		//dm2.sayLouder("Helloooo...");   // error-calling static method*/
    }
}