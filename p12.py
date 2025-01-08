# strings are immutable
a ="!!Harry !!!!!!!!!!!! Harry"
print(len(a))
print(a)
print(a.upper())
print(a.lower())
print(a.rstrip("!") )
print(a.replace("Harry","jyoshu"))  
print(a.split(" ")) 
blogHeading = "introdution to js "
print(blogHeading.capitalize())

str1 = "welcom to the console!!!!"
print(len(str1)) 
print(len(str1.center(50)))
print(a.count("Harry"))

str1 ="Welcom to the console !!!"
print(str1.endswith("!!!"))

str1 ="Welcom to the console !!!"
print(str1.endswith("to", 4, 10))

srt1 = "He's name is Dan. He is an honest man."
print(str1.find("ishh"))
# print(str1.index("ishh"))


str1 ="Welcom to the console"
print(str1.isalnum())
str1 = "welcom"
print(str1.isalpha())

str1 = "hello world"
print(str1.islower())
 
str1 =" We wish you a merry christmas\n"
print(str1.isprintable())
str1 = "      " #using spacebar
print(str1.isspace())
str2 ="        "     #using Tab
print(str2.isspace())

str1 ="World Health  Organization"
print(str1.istitle())

str2 ="To Kill a Mocking bird"
print(str2.istitle())

str1 ="Python is a Interpreted Language"
print(str1.startswith("Python"))

str1 = "Python is a Interpreted Language"
print(str1.swapcase())

str1 ="His name is Don. Don is an honest man."
print(str1.title())


