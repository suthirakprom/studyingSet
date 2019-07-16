import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


public class TreeSetwithacustomComparatorDescendingorder {

    public static void main(String[] args) {


    SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder()); //what's in the parameter is what reverse the list

    // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("apple");        //this will show first since it is lowercase
    //reverse the output order
        System.out.println("Fruits Set : " + fruits);

}
}
