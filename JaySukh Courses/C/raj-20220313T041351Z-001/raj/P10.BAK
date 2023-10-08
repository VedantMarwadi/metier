//to conver string into uppercase without using string function
#include<stdio.h>
#include<conio.h>
void main()
{
	char *str1;         //str1[i]==*(str1+i)
			       //	str1[j]=*(str1+j)
	int i,l,j;
	char temp;

	clrscr();
	printf("Enter any string");
	gets(str1);
	for(i=0;*(str1+i)!='\0';i++)
	{
		if(*(str1+i)>='a' && *(str1+i)<='z')
			*(str1+i)=*(str1+i)-32;
	}
	puts(str1);
	for(i=0;*(str1+i)!='\0';i++)
	{
		if(*(str1+i)>='A' && *(str1+i)<='Z')
			*(str1+i)=*(str1+i)+32;
	}
	puts(str1);
	for(l=0;*(str1+l)!='\0';l++);

	for(i=0,j=l-1;i<l/2;i++,j--)
	{
		temp=*(str1+i);
		*(str1+i)=*(str1+j)	;
		*(str1+j)=temp;

	}
	puts(str1);




	getch();

}