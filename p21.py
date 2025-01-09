X = input("Enter the value of x:")
# X is the variable to macth
match X:
# if X is 0
  case 0:
   print("X is zero")
#case with if-condition

  case 4:
      print("case is 4")
  case _ if X!=90:
      print(X< "is not 90")
  case _ if X!=80:
      print(X, "is not 80")
  case _:
       print(X)


