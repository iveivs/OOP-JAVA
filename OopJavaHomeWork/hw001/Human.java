package OopJavaHomeWork.hw001;
import java.util.ArrayList;
import java.util.List;

public class Human {
    public String name;
    int age;
    Human father;
    Human mother;
    List<Human> children;

    @Override
    public String toString() {
        return name;
    }

    public String getChildrenNames() {
        String res  = new String();
        for (Human child: children) {
            res += child.toString() + " ";
        }
        return res;
    }


    Human(String name, int age, Human father, Human mother){
        this.name = name;
        this.age = age;
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<Human>();
        if (father != null) {
            father.children.add(this);
        }
        if (mother != null) {
            mother.children.add(this);
        }
    }  

    void displayInfo() {
        System.out.printf("%s %d Father: %s \t Mother: %s \t Children:%s \n", name, age, father, mother, getChildrenNames());
    }

    public void findByName(String name) {
        if (father != null && father.name == name) {
            father.displayInfo();
        }
        if (mother != null && mother.name == name) {
            mother.displayInfo();
        }
        for (Human child: children) {
            if (child.name == name) {
                child.displayInfo();
            }
        }
        if (father != null) {
            father.findByName(name);
        }
    }


}
















// "Name: %s \tAge: %d\n", 
    // public void add(Human human){
    //     human1.add(human);
    // }
