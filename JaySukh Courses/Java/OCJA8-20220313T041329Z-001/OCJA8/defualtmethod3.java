class Clazz
{
	public void foo()
	{
        System.out.println("Hello Clazz!");
    }

}

interface Interface111
{

    default public void foo()
    {
        System.out.println("Hello Interface111!");
    }

}

interface Interface222
{

    default public void foo()
    {
        System.out.println("Hello Interface222!");
    }

}


public class defualtmethod3 extends Clazz implements Interface111, Interface222
{

    public void foo()
    {
		System.out.println("Method of child class");
       super.foo(); // (note: Clazz.super is wrong!)
       Interface111.super.foo();
       Interface222.super.foo();
    }

    public static void main(String[] args)
    {
        new defualtmethod3().foo();

    }

}
