package OopJavaHomeWork.hw001;
import java.util.List;

public class MainFamilyTree {
    public static void main(String[] args) {

        Human Alex = new Human("Alex", 55, null, null);

        Human Ann = new Human("Ann", 55, null, null);

        Human Bob = new Human("Bob", 35, Alex, Ann);

        Human John = new Human("John", 15, Bob, null);

        John.findByName("Ann");
        // Ann.displayInfo();





    }


}















        // MainFamilyTree mainFamilyTree = new MainFamilyTree();
        // mainFamilyTree.add(new Human("Bob", 40));

        // List<Human> relationList = mainFamilyTree.displayInfo();
        //     System.out.println(relationList);
