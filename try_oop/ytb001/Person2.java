package try_oop.ytb001;

class Person2 {
    String secondName;
    int mass;
    String job;

    Person2(){
        secondName = "Smith";
        mass = 78;
        job = "bulder";
        
    }


    void displayInfo() {
        System.out.printf("Second Name: %s \tMass: %d\t Job: %s\n", secondName, mass, job);
    }
}
