import java.util.*;
class arraylist
{
    public static void main(String args[])
    {
        ArrayList arraylist = new ArrayList();
		//arraylist.ensureCapacity(100);
        arraylist.add("Item 1");
        arraylist.add("Item 2");
        arraylist.add("Item 3");
        arraylist.add("Item 4");
        arraylist.add("Item 5");
        arraylist.add("Item 6");
        arraylist.add("4");
        arraylist.add("Item 5");
        arraylist.add(4);//autoboxing
        System.out.println(arraylist);

        arraylist.add(1, "Item 12");//shifting
		arraylist.add("Item 2");
        arraylist.add("Item 3");
        arraylist.add("Item 5");
        arraylist.add("Item 6");
        arraylist.add(45);
        arraylist.add(45);
        arraylist.add(45);
        arraylist.add(45);
        arraylist.add(45.67);
        arraylist.add(true);

        System.out.println(arraylist);
		arraylist.set(1, "Item 13");//replace
		System.out.println(arraylist);
        arraylist.remove("Item 5");
		//arraylist.remove(new StringBuilder("Item 5"));
        System.out.println(arraylist);

        arraylist.remove(4);
        System.out.println(arraylist);
        System.out.println("Index of item 3 is "+arraylist.indexOf("Item 3"));

        for(Object o:arraylist)
        {
		  System.out.println(o);
	    }
	    Integer arr[]={10,20,30};
	    List a2=Arrays.asList(arr);
	    System.out.println(a2);
	    String arr2[]={"jay","Kiran","lalit"};
		List a3=Arrays.asList(arr2);
		System.out.println(a3);

	 }
}
