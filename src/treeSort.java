import java.util.TreeSet;
import java.util.SortedSet;

public class treeSort {

        public static void main(String[] args) {
            SortedSet<String> fruit = new TreeSet<>();

            fruit.add("Apple");
            fruit.add("Pineapple");
            fruit.add("Orange");
            fruit.add("Watermelon");
            fruit.add("Dragon Fruit");
            fruit.add("Banana");
            System.out.println("The list of fruit: " + fruit);
            fruit.add("apple");
            //after adding apple
            System.out.println("The set with banana: " + fruit);
        }
    }

