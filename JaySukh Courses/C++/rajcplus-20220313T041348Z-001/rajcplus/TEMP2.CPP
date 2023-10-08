#include<iostream.h>
#include<conio.h>
#include<string.h>
template<class T>void  sort(T a[],int s)
{
	T temp;
	int i,j;
	for(i=0;i<s;i++)
	{
		for(j=i+1;j<s;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}

}

void main()
{
	int i;
	int a[]={10,20,78,56,15};
	float f1[]={45.67,78.12,1.2,89.3,61.23};
	char c1[]="kiran";
	clrscr();
	cout<<"\nbefore sorting integer array"<<endl;
	for(i=0;i<5;i++)
	{
		cout<<a[i]<<"\t";
	}
	cout<<"\nbefore sorting float array"<<endl;
	for(i=0;i<5;i++)
	{
		cout<<f1[i]<<"\t";
	}

	cout<<"before sorting character array"<<endl;
	cout<<c1;
	sort(a,5);
	sort(f1,5);
	sort(c1,5);
	cout<<"\nafter sorting integer array"<<endl;
	for(i=0;i<5;i++)
	{
		cout<<a[i]<<"\t";
	}
	cout<<"\nafter sorting float array"<<endl;
	for(i=0;i<5;i++)
	{
		cout<<f1[i]<<"\t";
	}

	cout<<"after sorting character array"<<endl;
	cout<<c1;



	getch();
}