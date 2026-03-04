class Estudiante:
    def __init__(self, nombre, edad, carrera, semestre):
        self.nombre = nombre
        self.edad = edad
        self.carrera = carrera
        self.semestre = semestre

    def mostrar(self):
        print("Nombre:", self.nombre)
        print("Edad:", self.edad)
        print("Carrera:", self.carrera)
        print("Semestre:", self.semestre)
        print("------------------------")

    def modificar_semestre(self, nuevo_semestre):
        self.semestre = nuevo_semestre


# Lista de objetos
lista_estudiantes = []

while True:
    print("\n--- MENÚ ---")
    print("1. Registrar estudiante")
    print("2. Mostrar estudiantes")
    print("3. Buscar estudiante")
    print("4. Modificar semestre")
    print("5. Salir")

    opcion = input("Seleccione una opción: ")

    if opcion == "1":
        nombre = input("Nombre: ")
        edad = int(input("Edad: "))
        carrera = input("Carrera: ")
        semestre = int(input("Semestre: "))

        estudiante = Estudiante(nombre, edad, carrera, semestre)
        lista_estudiantes.append(estudiante)
        print("Estudiante registrado correctamente.")

    elif opcion == "2":
        if len(lista_estudiantes) == 0:
            print("No hay estudiantes registrados.")
        else:
            for est in lista_estudiantes:
                est.mostrar()

    elif opcion == "3":
        nombre_buscar = input("Ingrese el nombre a buscar: ")
        encontrado = False

        for est in lista_estudiantes:
            if est.nombre.lower() == nombre_buscar.lower():
                est.mostrar()
                encontrado = True
                break

        if not encontrado:
            print("Estudiante no encontrado.")

    elif opcion == "4":
        nombre_modificar = input("Nombre del estudiante: ")
        encontrado = False

        for est in lista_estudiantes:
            if est.nombre.lower() == nombre_modificar.lower():
                nuevo_semestre = int(input("Nuevo semestre: "))
                est.modificar_semestre(nuevo_semestre)
                print("Semestre actualizado.")
                encontrado = True
                break

        if not encontrado:
            print("Estudiante no encontrado.")

    elif opcion == "5":
        print("Saliendo del sistema...")
        break

    else:
        print("Opción inválida.")