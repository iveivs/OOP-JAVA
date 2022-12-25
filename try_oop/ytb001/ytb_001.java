package try_oop.ytb001;

public class ytb_001 {
    public static void main(String[] args) {
        

        Person Alex = new Person();
        Alex.displayInfo();

        Person John = new Person("John");
        John.displayInfo();

        Person Nick = new Person("Nick", 38);
        Nick.displayInfo();
        // John.name = "John";
        // John.age =  67;
        // John.displayInfo();

        Person2 Daddy = new Person2();
        Daddy.displayInfo();

    }
}

class Person {
    String name;
    int age;

    Person(){
        // name = "Alex";
        // age = 67;
        this("Alex", 67);
    }


    // Person(String n){
    //     name = n;
    //     age = 54;
    // }
    Person(String name){
        this(name, 32);
    }


    // Person(String n, int a){
    //     name = n;
    //     age = a;
    // }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age  );
    }
}