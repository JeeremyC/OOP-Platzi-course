/*function pets() {
    this.age;
    this.size;
    this.race;
    this.clinical_history;
}*/

class pets {

    constructor (race,size) {
        this.race = race;
        this.size = size;
        this.age;
        this.clinical_history;
    }


    printDataPets() {
        console.log(this.age);
        console.log(this.race);
        console.log(this.size);
        console.log(this.clinical_history);
    }
}