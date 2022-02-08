/*function pets() {
    this.age;
    this.size;
    this.race;
    this.clinical_history;
}*/

class pets {

    age;
    size;
    race;
    clinical_history;


    constructor (race,size) {
        this.race = race;
        this.size = size;
    }

    printDataPets() {
        console.log(this.age);
        console.log(this.race);
        console.log(this.size);
        console.log(this.clinical_history);
    }
}