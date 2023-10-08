import random
list=['advice','brick','cookies','damage','explain','garage','happy','monkey','memory','palace','select','health']
vowels=['a','e','i','o','u']
wordl=[]
def show(word):
    for w in word:
        if w not in vowels:
            word=word.replace(w,' _ ')
        else:
            wordl.append(w)
    print ('\n',word,'\n')

def input_word(word):
    global score
    global a
    w=input("Enter a letter : ")
    if w in wordl:
        print('Same letter!\n')
    elif w in word:
        print('Correct guess!')
        vowels.append(w)
        show(word)       
    else:
        print('Wrong guess')
        score-=1
        if score!=0:
            if score==1:
                print('LAST TRY LEFT')
            elif score<=3:
                print('Be careful, only',score,'tries left')
            else:
                print('Tries left :',score)
            show(a)
        else:
            print('\n')

def game():
    global score
    global a
    a=list[random.randint(0,len(list)-1)]
    show(a)
    score=input('Enter total number of guesses you want : ')
    while True:
        if score.isdigit()==True:
            score=int(score)
            while score>0:
                flag=0
                input_word(a)
                for w in a:
                        if w not in vowels:
                            flag=1
                            break
                if flag==0:
                    print('You win!')
                    break
            else:
                print('You lose\n\nThe word was\n',a)
            break
        else:
            score=input('Please enter a number : ')

print('\t\t\t\tHANGMAN GAME\n\n')

while True:
    game()
    char=input('Do you want to play again? (Y/N)')
    if char!='y' and char!='Y':
        break

'''
while True:
    game()
    char=input('Do you want to play again? (Y/N)')
    if char=='y' and char=='Y':
        continue
    else: break
'''
