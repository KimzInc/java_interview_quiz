import java.util.*;

public class CollectionOrder {
    public static void main(String[] args) {
        Collection<String> collection;
        // collection = new ArrayList<>();
        // collection = new LinkedHashSet<>();
        // collection = new TreeSet<>();
        // collection = new ArrayDeque<>();
        collection = new LinkedList<>();

        collection.add("foo");
        collection.add("bar");
        collection.add("baz");
        collection.add("egg");

        collection.forEach(System.out::println);

        //Which collection above will print the strings added
        // in the same order that they were added
        // 1: ArrayList
        // 2: LinkedHashSet
        // 3: ArrayDeque
        // 4: LinkedList

        /*
        *foo
        *bar
        *baz
        *egg
        **/

        //TreeSet is the only collection that changes the order of
        // strings added, it arranges the string in alphabetical order
        // output: TreeSet
        /*
        * bar
          baz
          egg
          foo
        * */
    }
}
