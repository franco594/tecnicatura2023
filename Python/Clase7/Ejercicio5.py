edad = int(input("Ingrese su nota: "))
calificacion = None

if 9 <= edad <= 10:
    calificacion = "A"
elif 8 <= edad < 9:
    calificacion = "B"
elif 7 <= edad < 8:
    calificacion = "C"
elif 6 <= edad < 7:
    calificacion = "D"
elif 0 <= edad < 6:
    calificacion = "F"
else:
    calificacion = "Error: valor ingresado incorrecto"

print(f'Tu calificacion es: {calificacion}')