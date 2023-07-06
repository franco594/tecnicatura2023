edad = int(input("Ingrese su edad: "))
etapa = None

if 0 <= edad < 10:
    etapa = "La infancia es increible y bella"
elif 10 <= edad < 20:
    etapa = "Tienes muchos cambios, mucho que estudiar"
elif 20 <= edad < 30:
    etapa = "Amor, y comienza el trabajo"
elif 30 <= edad < 40:
    etapa = "Crecimiento profesional, llegan los hijos"
elif 40 <= edad < 50:
    etapa = "Disfrutas de los logros profesionales,viajas, los hijos crecen"
elif 50 <= edad < 60:
    etapa = "Se acerca el momento de descansar, empiezas a preparar tu retiro"
elif 60 <= edad < 70:
    etapa = "Ha descansar y disfrutar de los nietos y todo lo logrado! te vuelves mas contemplativo"
elif 70 <= edad < 100:
    etapa = "Disfruta, la vida se va volando!"
else:
    etapa = "Error: etapa no reconocida"

print(f'Tu edad es {edad}, {etapa}')