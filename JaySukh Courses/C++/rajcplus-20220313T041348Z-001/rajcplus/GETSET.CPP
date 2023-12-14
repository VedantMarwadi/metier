#include<iostream.h>
#include<conio.h>
#include<string.h>
class emp
{

	private:
	int codeno;
	char name[25];
	float sal;
	public:
	void setCodeno(int c)
	{
		if(c<0)
			cout<<"code no sould not be negative"<<endl;
		else
			codeno=c;
	}
	void setName(char n[])
	{
		strcpy(name,n);
	}
	void setSal(float s)
	{
		sal=s;
	}
	int getCodeno()
	{
		return codeno;
	}
	char* getName()
	{
		return name;
	}
	float getSal()
	{
		return sal;
	}




};
void main()
{
	emp e1;
       /*	e1.codeno=-10;
	strcpy(e1.name,"Jaysukh Patel");
	e1.sal=45000;
	cout<<e1.codeno<<endl;
	cout<<e1.name<<endl;
	cout<<e1.sal<<endl;*/
	e1.setCodeno(10);
	e1.setName("Jaysukh patel");
	e1.setSal(45000);
	//int c=e1.getCodeno();
	cout<<e1.getCodeno()<<endl;
	cout<<e1.getName()<<endl;
	cout<<e1.getSal()<<endl;

	e1.setCodeno(-10);
	e1.setName("kiran shah");
	e1.setSal(35000);
	//int c=e1.getCodeno();
	cout<<e1.getCodeno()<<endl;
	cout<<e1.getName()<<endl;
	cout<<e1.getSal()<<endl;


}