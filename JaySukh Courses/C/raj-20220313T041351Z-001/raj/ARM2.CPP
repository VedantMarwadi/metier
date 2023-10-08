//to print armstrong no between 1 to 1000
#include<iostream.h>
#include<conio.h>
void main()
{
	int no,rem,sum,temp;
	int l;
	clrscr();
	for(no=1;no<=1000;no++)
	{
		sum=0;
		temp=no;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		if(sum==no)
			cout<<no<<endl;
	}

	getch();

	//printf("%d",l);

}