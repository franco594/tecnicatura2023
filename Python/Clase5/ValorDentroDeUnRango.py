print("Ingrese un dígito: ", end="> ")
num = int(input())
valorMinimo = 0
valorMaximo = 5
dentroRango = (valorMinimo <= num <= valorMaximo)
if 0 <= num <= 5:
    print(f'El número ingresado {num} está dentro del rango 0-5')
else:
    print(f'El número ingresado {num} no está dentro del rango 0-5')
