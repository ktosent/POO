class personaje:
        def __init__(self,nombre, vida, defensa,resistencia,nivel):
            self.nombre = nombre
            self.vida = vida
            self.defensa = defensa
            self.resistencia = resistencia 
            self.nivel = nivel 
        def mostrar(self):
            print("Nombre:",self.nombre)
            print("Vida:",self.vida)
            print("Resistencia:",self.resistencia)
            print("Defensa:",self.defensa)
            print("Nivel:",self.nivel)
        def subir_nivel(self,vida,resistencia):
            self.vida += vida
            self.resistencia += resistencia
Venus = personaje("Vemus", 5,10 ,4,1)
Venus.mostrar()
Venus.subir_nivel(100,4)
Venus.mostrar()