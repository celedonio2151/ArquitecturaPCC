class Tabla():
    """docstring for Tabla."""

    # def __init__(self, arg):
    #     super(Tabla, self).__init__()
    #     self.arg = arg

    def menu(self):
        print("Tabla de 1 a 10")
        print("-------------------------------------------------------------")
        t = int(input("Ingrese el numero de la tabla que quiere ver: "))
        print("-------------------------------------------------------------")
        n = 0;
        while n != 5:
            print("-------------------------------------------------------------")
            print("1 -> Para la suma")
            print("2 -> Para la resta")
            print("3 -> Para la multiplicacion")
            print("4 -> Para la division")
            print("5 -> Para la finalizar")
            print("-------------------------------------------------------------")
            n = int(input("Ingrese un numero del menu: "))
            print("-------------------------------------------------------------")
            if n == 1:
                self.sumar(t)
            if n == 2:
                self.restar(t)
            if n == 3:
                self.multiplicar(t)
            if n == 4:
                self.dividir(t)

    def sumar(self,tabla):
        for x in range(1,11):
            print(tabla," + ",x," = ",tabla+x)

    def restar(self,tabla):
        for x in range(1,11):
            print(tabla," - ",x," = ",tabla-x)

    def multiplicar(self,tabla):
        for x in range(1,11):
            print(tabla," * ",x," = ",tabla*x)

    def dividir(self,tabla):
        for x in range(1,11):
            print(tabla," / ",x," = ",tabla//x)

tabla = Tabla()
tabla.menu()
