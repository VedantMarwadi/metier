#include<stdio.h>
#include<conio.h>
void main()
{
	int i;
	int a[]={10,20,30,40,50},*p;
	float f[]={45.67,12.34,56.78,90.45,45.12},*q;
	char name1[]={'k','i','r','a','n','\0'},*r;
	char name2[]="kiran",*m;

	clrscr();
	p=a;//p=&a[0]
	q=f; //q=&f[0]
	r=name1;//r=&name1[0]
	m=name2;//m=&name2[0]
	printf("\nInteger array\n");
	for(i=0;i<5;i++)
	{
		printf("%u\t%d\t%u\t%d\n",&a[i],a[i],p,*p);
		p++;
	}
	printf("\nfloat array\n");
	for(i=0;i<5;i++)
	{
		printf("%u\t%.2f\t%u\t%.2f\n",&f[i],f[i],q,*q);
		q++;
	}
	getch();
	printf("\nchar array1\n");
	for(i=0;i<5;i++)
	{
		printf("%u\t%c\t%u\t%c\t%s\n",&name1[i],name1[i],r,*r,r);
		r++;
	}
	printf("\nchar array2\n");
	for(i=0;i<5;i++)
	{
		printf("%u\t%c\t%u\t%c\t%s\n",&name2[i],name2[i],m,*m,m);
		m++;
	}
	--p;
	--q;
	--r;
	--m;
	printf("%d\n",*p);
	printf("%f\n",*q);
	printf("%c\n",*r);
	printf("%c\n",*m);



	getch();



}