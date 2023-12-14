#include<iostream>
using namespace std;
void fun()//throw(int)
{
	int a,b,c;
	cout<<"Enter two int values";
   cin>>a>>b;
   if(b==0)
     throw b;
   c=a/b;
   cout<<"Division is "<<c<<endl;
}
int main()
{
	try
   {
   	fun();
   }
   catch(...)
   {
   	cout<<"int value catched"<<endl;
   }
	cout<<"hello"<<endl;
   cout<<"Hi"<<endl;
   return 0;
}
