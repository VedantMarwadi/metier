#Cricket

import random

runs=0  #user runs
cruns=0 #computer runs
flag=0

def bat():
    global flag
    flag=0
    global runs
    print('\nYOU ARE BATTING\n')
    while flag==0:
        num=int(input('Enter a number : '))
        cnum=random.randint(1,10)
        if num!=cnum:
            runs=runs+num
        else:
            print('You are out')
            flag=1
        print('Your runs : ',runs,'\n')

def batafter():
    global flag
    flag=0
    global runs
    global cruns
    print('\nYOU ARE BATTING\n')
    while flag==0 and runs<=cruns:
        num=int(input('Enter a number : '))
        cnum=random.randint(1,10)
        if num!=cnum:
            runs=runs+num
        else:
            print('You are out')
            flag=1
        print('Your runs : ',runs,'\n')

def bowl():
    global flag
    flag=0
    global cruns
    print('\nYOU ARE BOWLING\n')
    while flag==0:
        num=int(input('Enter a number : '))
        cnum=random.randint(1,10)
        if num!=cnum:
            cruns=cruns+cnum
        else:
            print('The opponent is out')
            flag=1
        print('Their runs : ',cruns,'\n')


def bowlafter():
    global flag
    flag=0
    global cruns
    global runs
    print('\nYOU ARE BOWLING\n')
    while flag==0 and cruns<=runs:
        num=int(input('Enter a number : '))
        cnum=random.randint(1,10)
        if num!=cnum:
            cruns=cruns+cnum
        else:
            print('The opponent is out')
            flag=1
        print('Their runs : ',cruns,'\n')


print('HOW TO BAT\nEnter a number to score runs. If the opponent enters the same number, you are out, otherwise the number will be added to your runs.')
print('\nHOW TO BOWL\nEnter a number. If the opponent enters the same number, they are out, otherwise the number will be added to their runs.\n')
while True:
    choice=input('Do you want to bat first or bowl first?  ')
    if choice=='bat' or choice=='Bat' or choice=='BAT':
        bat()
        bowlafter()
        break
    elif choice=='bowl' or choice=='Bowl' or choice=='BOWL':
        bowl()
        batafter()
        break
    else:
        print('Invalid choice')
if runs>cruns:
    print('You win!')
elif runs<cruns:
    print('You lose!')
else:
    print("It's a tie")
