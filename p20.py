
X = int(input("Enter the value of X:"))
# X is the variable to match
match X:
    # if X is )
    case 0:
        print(" X is Zero")
    # case with if-condition
    case 4:
        print("case is 4")
    # Empty  case with  if-condition
    case _ if X < 10:
        print("x is < 10")
    # default case( will only be matched if  the above cases were not matched)
    # so it is basically just an else:
    case _ :
        print(X)
