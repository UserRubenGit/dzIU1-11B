a = int(input("Введите значение \n"))
b = int(input("Введите значение \n"))
c = int(input("Введите значение \n"))

if (a<b+c) and (b<a+c) and (c<a+b):
    print ("Существует")
else:
    print ("Не существует")
if (a==b) and (a==c) and (b==c):
    print ("Треугольник равносторонний")
elif (a==b) or (a==c) or (b==c):
    print ("Треугольник равнобедренный")
else:
    print ("Треугольник разносторонний")