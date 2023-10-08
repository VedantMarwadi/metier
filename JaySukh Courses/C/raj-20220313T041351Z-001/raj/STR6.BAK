//to count the alphabet,digit,space and words
#include<ctype.h>
void main()
{
	char str1[50];
	int i,calpha=0,cdigit=0,cspace=0,cword=1,cpun=0;
	clrscr();
	printf("Enter any string");
	gets(str1);
	for(i=0;str1[i]!='\0';i++)
	{
		if(isalpha(str1[i]))
		      calpha++;
		else if(isdigit(str1[i]))
			cdigit++;
		else if(ispunct(str1[i]))
			cpun++;
		else
		{
			cspace++;
			cword++;
		}
	}
	printf("The no of alphabet is %d\n",calpha);
	printf("The no of digit is %d\n",cdigit);
	printf("The no of space is %d\n",cspace);
	printf("The no of words are %d\n",cword);
	printf("The special characters are %d\n",cpun);
	getch();
}