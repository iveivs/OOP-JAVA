package try_oop.itronik.exmpl1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class Relation {
    Human human;
    String relationType;

    public Relation(String type, Human to) {
        human = to;
        relationType = type;
    }
}

class Human {
    String name;
    List <Relation> relations;
    Human father;

    public Human() { 
        relations = new ArrayList<Relation>();
    }

    public void addRelation(Relation relation) {
        relations.add(relation);
    }
}

class FamilyTree {
    protected List<Human> humans;

    public FamilyTree(List<Human> initialHumans) {
        humans = new ArrayList<>();
        for(Human h : initialHumans) {
            buildTree(h);
        }
    }

    protected void buildTree(Human human) {
        if(!humans.contains(human)) {
            humans.add(human);
            for(Relation relation : human.relations) {
                buildTree(relation.human);
            }
        }
    }

    public void printTree() {
        for(Human human : humans) {
            System.out.printf("%s \n", human.name);
            for(Relation relation : human.relations) {
                System.out.printf("\t%s (%s) \n", relation.human.name, relation.relationType);
                
            }
            
        }
    }
    

}
class main {
    public static void main(String[] args) {

        Human father = new Human();
        father.name = "John";

        Human son = new Human();
        son.name = "Bob";

        Human mother = new Human();
        mother.name = "Helena";

        // Relation fatherToSon = new Relation();
        // fatherToSon.relationType = "son";
        // fatherToSon.human = son;
        // father.addRelation(fatherToSon);

        // Relation sonToFather = new Relation();
        // sonToFather.relationType = "father";
        // sonToFather.human = father;
        // son.addRelation(sonToFather);


        father.addRelation(new Relation("son", son));
        son.addRelation(new Relation("father", father));
        mother.addRelation(new Relation("son", son));
        son.addRelation(new Relation("mother", mother));


        FamilyTree tree = new FamilyTree(Arrays.asList(father));
        tree.printTree();
    }
}