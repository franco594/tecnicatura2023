num = int(input("Ingrese un número: "))
print(f'El residuo de la división es: {num % 2}')
if num % 2 == 0:
    print(f'{num} es PAR')
else:
    print(f'{num} es IMPAR')