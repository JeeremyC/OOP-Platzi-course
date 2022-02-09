import string


class Account:
    id = int  
    name = string
    document = string

    def __init__(self,name,document): #la palabra self hace referencia a los valores que componen el objeto, algo similir como lo es this en otros lenguajes
        self.name = name; #esta llamando al atributo name de la linea 3 de la clase, y le esta asignando el dato que se pasa en el metodo __init__ de la linea 8
        self.document = document;