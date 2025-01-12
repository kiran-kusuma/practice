def calculateGmean(a, b):
    mean =(a*b)/(a*b)
    print(mean)


a = 9
b = 8
if(a>b):
    print(" First number is greater")
else:
    print("Second number is greater or equal")
calculateGmean(a, b)


# gmean1 = (a*b)/(a+b)
# print(gmean1)
calculateGmean(a, b)

c = 8
d = 74
if(c>d):
    print(" First number is greater")
else:
    print("Second number is greater or equal")

# gmean2 = (c*d)/(c+d)
# print(gmean2)
if(c>d):
    calculateGmean(c, d)