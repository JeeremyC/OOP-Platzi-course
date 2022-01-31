class Main {

    public static void main(String[] args) {
        System.out.println("holaaaa");

        pets michi = new pets(); //Creamos un objeto, 'pets' es el nombre de la clase y 'pets()' es el metodo constructor generado automaticamente
        michi.age = 3; //empezamos a asignarle valores
        michi.size = "small";
        michi.clinical_history = "This cat was in the outside";
        michi.race = "black";
        michi.printDataPet(); //invocamos un metodo de la clase

        pets luna = new pets();
        luna.age = 2;
        luna.size = "medium";
        luna.clinical_history = "any";
        luna.race = "black & white";
        
        luna.printDataPet();
    }
}