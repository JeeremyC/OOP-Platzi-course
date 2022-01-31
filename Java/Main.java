class Main {

    public static void main(String[] args) {
        System.out.println("holaaaa");

        pets michi = new pets();
        michi.age = 3;
        michi.size = "small";
        michi.clinical_history = "This cat was in the outside";
        michi.race = "black";
        michi.printDataPet();

        pets luna = new pets();
        luna.age = 2;
        luna.size = "medium";
        luna.clinical_history = "any";
        luna.race = "black & white";
        
        luna.printDataPet();
    }
}