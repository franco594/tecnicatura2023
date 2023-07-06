import math

radio = float(input('Ingrese el radio del círculo: '))

area = round(math.pi * (radio ** 2), 1)
longitud = round(2 * math.pi * radio, 1)

print(f'El Área del círculo es: {area} y la longitud de su circunferencia es: {longitud}')
