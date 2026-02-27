class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def presentarse(self):
        print("Hola, mi nombre es", self.nombre, "y tengo", self.edad, "años.")


class Estudiante(Persona):
    def __init__(self, nombre, edad, carrera, semestre):
        super().__init__(nombre, edad)
        self.carrera = carrera
        self.semestre = semestre

    def estudiar(self):
        print(self.nombre, "está estudiando", self.carrera)
est1 = Estudiante("Juan", 18, "Ingeniería en Sistemas", 2)

est1.presentarse()
est1.estudiar()    
