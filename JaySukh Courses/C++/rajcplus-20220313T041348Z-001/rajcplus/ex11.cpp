#include<iostream>
using namespace std;
int main()
{
	int a;
   int b;
   cout<<"Enter two values";
   cin>>a>>b;
   try
   {
   	if(b==0)
      	throw b;
   	int c=a/b;
   	cout<<"division is "<<c<<endl;
   }
   catch(int p)
   {
   	cout<<"division by zero"<<p<<endl;
   }
   cout<<"hello"<<endl;
   cout<<"Hi"<<endl;

   return 0;
}
