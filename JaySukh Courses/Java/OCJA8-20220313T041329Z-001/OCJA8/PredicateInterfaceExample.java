import java.util.function.Predicate;
class student
{
	int rollno;
	String name;
	long phone;
	String address;
	student(int r,String n,String a,long p)
	{
		rollno=r;
		name=n;
		address=a;
		phone=p;
	}
	int getrollno()
	{
		return rollno;
	}
	String getname()
	{
			return name;
	}
	String getaddress()
	{
		return address;
	}
	long getphone()
	{
		return phone;
	}
}
public class PredicateInterfaceExample
{
    public static void main(String[] args)
    {
        Predicate<Integer> pr = a -> (a > 18); // Creating predicate
        System.out.println(pr.test(10));    // Calling Predicate method


        Predicate<student> pr1 = s -> s.getname().endsWith("a"); // Creating predicate
        student s1=new student(1,"maria","naranpura",455464565);
        System.out.println(pr1.test(s1));    // Calling Predicate metho

        Predicate<Float> pr2 = a -> (a > 0); // Creating predicate
		System.out.println(pr2.test(-10.56f));    // Calling Predicate method


    }
}