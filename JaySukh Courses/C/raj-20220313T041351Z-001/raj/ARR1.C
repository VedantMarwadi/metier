#include<conio.h>
#include<stdio.h>
void main()
{
	int i;
	int a[]={10,20,30,40,50};
	float f[5];
	char name1[]={'k','i','r','a','n','\0'};
	char name2[]="kiran";
	char name3[8];
	clrscr();
	printf("Enter five float values\n");
	for(i=0;i<5;i++)
	{
		printf("Enter value");
		scanf("%f",&f[i]);

	}
	printf("\nEnter name");
	//scanf("%s",name3); //up to space

	fflush(stdin);
	//scanf("%[^\n]",name3); //with space
	gets(name3);//----with space

	printf("\nInteger array\n");
	for(i=0;i<5;i++)
	{
		printf("%d\t",a[i]);
	}
	printf("\nfloat array\n");
	for(i=0;i<5;i++)
	{
		printf("%f\t",f[i]);
	}
	printf("%s\n",name1);
	printf("%s\n",name2);
	printf("%s\n",name3);
	puts(name1);
	puts(name2);
	puts(name3);
	getch();
}