//type casting
import java.util.*;
class A
{
}
class B extends A
{
}
class C extends B
{
}
class D extends A
{
}
class E extends A
{
}
//A-->B,D,E
//B-->C

class inher6
{
	public static void main(String arg[])
	{
		A a1=new A();
		B b1=new B();
		C c1=new C();
		D d1=new D();
		E e1=new E();
		A a2=new B();
		A a3=new C();
		A a4=new D();
		A a5=new E();

		//B b2=(B)a1;//no comilation error but run time error(classcastexception)
		//C c2=(C)a1;//no comilation error but run time error(classcastexception)
		//D d2=(D)a1;//no comilation error but run time error(classcastexception)
		//E e2=(E)a1;//no comilation error but run time error(classcastexception)
		//B b2=(B)a2;//no comilation error no run time error
		//C c2=(C)a3;//no comilation error no run time error
		//D d2=(D)a4;//no comilation error no run time error
		//E e2=(E)a5;//no comilation error no run time error
		//B b2=(B)a3;//no comilation error no run time error
		//C c2=(B)a3;//comilation error
		//C c2=(C)(B)a3;//no comilation error no run time error
		//C c2=(B)(C)a3;//comilation error
		//B b2=(B)(C)a3;//no comilation error no run time error
		 //D d2=(D)a2;//no comilation error but run time error(classcastexception)
		  //E e2=(E)a2;//no comilation error but run time error(classcastexception)
		  //C a8=(C)a1;//no compilation error but runtime error(classcastexception)
	}
}