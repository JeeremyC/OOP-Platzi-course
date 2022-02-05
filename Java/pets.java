import java.nio.channels.AcceptPendingException;

class pets {
    Integer age;
    String size;
    account id;
    account name;
    String race;
    String clinical_history;

    public pets(String race, account id, account name) {
        
    }

    void printDataPet() {
        System.out.println("Race: "+race+", Size: "+size+",Age: "+age);
    }
}