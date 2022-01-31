from pets import Pets #pets es el nombre del archivo y Pets es el nombre de la clase declarada dentro de ese archivo

if __name__ == "__main__":
    print("holaaa")
    
    michi = Pets() #Creamos un objeto michi llamando al metodo constructor Pets()
    michi.age = 2   #Asignamos valores a las variables
    michi.race = "Siberian"
    michi.size = "small"
    michi.clinical_history = "unknow"
    print(vars(michi)) #imprimimos las variables en formato JSON