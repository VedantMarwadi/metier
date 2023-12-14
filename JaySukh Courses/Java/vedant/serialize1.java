import java.io.*;
class student implements Serializable
{
	int id;
	String name;
	student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void showdata()
	{
		System.out.println(id+"\t"+name);
	}
}
class serialize1
{
	public static void main(String arg[])throws Exception
	{
		//serialization
		student s1=new student(10,"jaysukh patel");
		FileOutputStream f=new FileOutputStream("student.dat");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(s1);
		o.close();

		//deserialization
		FileInputStream f1=new FileInputStream("student.dat");
		ObjectInputStream o1=new ObjectInputStream(f1);

		student s3=(student)o1.readObject();
		o1.close();
		s3.showdata();
	}
}