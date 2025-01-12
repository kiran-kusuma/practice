# def average(a=9, b=1):
# print("The average is", (a+b)/2)

def average(*numbers):
    print(type(numbers))
    for i in numbers:
        sum = sum + i
        print("Average is: ", sum /len(numbers))


# average(4. 6)
# average(b=9)
average(5, 6)  

