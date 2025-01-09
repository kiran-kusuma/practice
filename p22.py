X = 4
# X is the varibale to match
match X:
    # if X is 0
    case 0:
        print("X% 2 == 0 and case is 4")
        # Empty case with if-condition
        case _ if X < 10:
        print(" X is < 10")
        # default case( will only be matched if the above cases were not matched)
        #so it is basically just an elsee:
        case _:
        print(X)
        