import random
board = [0,1,2,3,4,5,6,7,8]
count =0;
flag=0
def showboard():
    print (str(board[0])+" | "+str(board[1])+" | "+str(board[2]))
    print ('----------')
    print (str(board[3])+" | "+str(board[4])+" | "+str(board[5]))
    print ('----------')
    print (str(board[6])+" | "+str(board[7])+" | "+str(board[8]))

def checking(char, spot1, spot2, spot3):
    if board[spot1] == char and board[spot2] == char and board[spot3]==char:
        return True

def check(char):
    if checking(char, 0, 1, 2):
        return True
    elif checking(char, 3, 4, 5):
        return True
    elif checking(char, 6, 7, 8):
        return True
    elif checking(char, 2, 4, 6):
        return True
    elif checking(char, 0, 3, 6):
        return True
    elif checking(char, 1, 4, 7):
        return True
    elif checking(char, 2, 5, 8):
        return True
    elif checking(char, 0, 4, 8):
        return True
    else:
        return False

while True:
    flag=0;
    number = input("Select a spot: ")
    number = int(number)
    if board[number] != 'x' and board[number] != 'o':
        board[number] = 'x'
        count=count+1
        if check('x') == True:
            print ("X Wins!")
            break
        if count>8:
            print("It is tie")
            break

        while True:
            random.seed()
            number2 = random.randint(0,8)
            print(number2)
            if board[number2] != 'x' and board[number2] != 'o':
                board[number2] = 'o'
                count=count+1
                #break;
                #showboard()
                if check('o') == True:
                    print ("O Wins!")
                    flag=1
                    break
            
                break;
        showboard()
        if(flag==1):
            break;
        
        #break
    else:
         print ("Spot Taken... Try again.")
         #break
