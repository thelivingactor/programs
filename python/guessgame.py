import random
number=random.randint(1,20)
guess=int(input("guess the number less than 20:"))
while number!=guess:
    print("your guess is wrong")

    if guess > number:
        print("your number is greater")
    else:
        print("your nimber is lesser")
    guess=int(input("guess the number:"))
print("congrats!you won")        
