import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class treeSetWithCustomComparator {

        public static void main(String[] args) {
            SortedSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
            fruits.add("Banana");
            fruits.add("Apple");
            fruits.add("Pineapple");
            fruits.add("Orange");
            System.out.println("Fruit set is: " + fruits);
            fruits.add("banana");
            //banana is also considered as a duplicated item so it won't show
            //because we have the case insenitive
            System.out.println("After adding banana: " + fruits);
        }
    }

