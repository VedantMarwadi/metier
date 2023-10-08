import random

score = 0
scorecomp = 0
def main():
    global score
    global scorecomp
    flag = 1
    output = ["rock","paper","scissor"]
    
    comp=random.choice(output)
   

    gameinput = input("rock, paper or scissor?: ")
    

    if(gameinput == "rock" and comp == "paper"):#Rock-Paper
        print('Computer: ',comp)
        scorecomp = scorecomp + 1
        print("The score of the computer is ",scorecomp)
        print("Your score is ",score)
        
    elif(gameinput == "paper" and comp == "rock"):#Rock-Paper
        print('Computer: ',comp)
        score = score + 1
        print("The score of the computer is ",scorecomp)
        print("Your score is ",score)
        
    elif(gameinput == "rock" and comp == "scissor"):#Rock-scissor
        print('Computer: ',comp)
        score = score + 1
        print("The score of the computer is ",scorecomp)
        print("Your score is ",score)
        
    elif(gameinput == "scissor" and comp == "rock"):#Rock-scissor
        print('Computer: ',comp)
        scorecomp = scorecomp + 1
        print("The score of the computer is ",scorecomp)
        print("Your score is ",score)

    elif(gameinput == "scissor" and comp == "paper"):#scissor-Paper
        print('Computer: ',comp)
        score = score + 1
        print("The score of the computer is ",scorecomp)
        print("Your score is ",score)
        
    elif(gameinput == "paper" and comp == "scissor"):#scissor-Paper
        print('Computer: ',comp)
        scorecomp = scorecomp + 1
        print("The score of the computer is ",scorecomp)
        print("Your score is ",score)
        
    elif(gameinput == "rock" and comp == "rock"):#Rock-rock
        print('Computer: ',comp)
        print("Tie")
        print("The score of the computer is ",scorecomp)
        print("Your score is ",score)
              
    elif(gameinput == "paper" and comp == "paper"):#paper-Paper
        print('Computer: ',comp)
        print("Tie")
        print("The score of the computer is ",scorecomp)
        print("Your score is ",score)
        
    elif(gameinput == "scissor" and comp == "Scissor"):#scissor-scissor
        print('Computer: ',comp)
        print("Tie")
        print("The score of the computer is ",scorecomp)
        print("Your score is ",score)
        
    else:
        print("invalid")

    if(score == 5):
        print("You Win")
        flag = 0
        

    
    if(scorecomp == 5):
        print("You lose")
        flag = 0

    if(flag == 1):
        main()

main()
