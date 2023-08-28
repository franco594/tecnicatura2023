print('Ingrese los siguientes datos del libro:')
nombre = input('Digite el nombre del libro:> ')
idLibro = input('Digite el ID del libro:> ')
precio = float(input('Digite el precio del libro:> '))
envio = input('Indicar si el envío del libro es gratuito (True/False):> ')
if envio == 'True':
    envio = True
elif envio == 'False':
    envio = False
else:
    envio = 'El valor ingresado es incorrecto, debe escribir True/False'
print(f'''
            Nombre: {nombre}
            ID: {idLibro}
            Precio: {precio}
            Envío Gratuito: {envio}
''')
