class pets {
    Integer age;
    String size;
    account id;
    account name;
    String race;
    String clinical_history;

    public pets(account id, account name) {
        this.id = id;
        this.name = name;
    }

    void printDataPet() {
        System.out.println("Race: "+race+", Size: "+size+",Age: "+age);
    }
}