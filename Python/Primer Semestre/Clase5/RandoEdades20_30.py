
edad = int(input('Ingrese su edad:> '))
veintes = edad >= 20 and edad < 30
treintas = edad >= 30 and edad < 40
if veintes :
    print(f'Se encuentra dentro del rango de los 20 años con {edad} años')
elif treintas:
    print(f'Se encuentra dentro del rango de los 30 años con {edad} años')
else:
    print(f'No se encuentra dentro del rango de los 20-30 años con {edad} años')