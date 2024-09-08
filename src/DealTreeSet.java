import java.util.Set;
import java.util.TreeSet;

public class DealTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add((int)3.0);
        set.add(2);
        set.add(2);
        //set.add(new Integer(2));
        set.add(Integer.parseInt("2"));

        System.out.println(set);

        //output
        //[2,3]

        /*
        *   A TreeSet automatically maintains the natural order of its elements (in the case of integers, this is
        *    ascending order). Thus, after inserting the values 2 and 3, the TreeSet contains these elements
        *    in sorted order.
        *    The TreeSet also ensures that duplicates are ignored. The number 2 is inserted multiple times, but only
        *     one instance of it is retained.
        **/

    }
}
